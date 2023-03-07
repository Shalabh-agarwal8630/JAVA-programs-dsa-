class DoublyLinkedList {
    Node Head, Last;

    class Node{
        int data;
        Node RPTR;
        Node LPTR;

        Node(int data) {
            this.data = data;
            RPTR = null;
            LPTR = null;
        }
    }

    void insertFirst(int data) {
        Node node = new Node(data);
        if(Head == null) {
            Head = node;
            Last = node;
        }
        else {
            node.RPTR = Head;
            Head.LPTR = node;
            Head = node;
        }
    }

    void insertLoc(int data, Node loc) {
        Node node = new Node(data);
        if(Head == null) {
            Head = node;
            Last = node;
        }
        else {
            node.LPTR = loc;
            node.RPTR = loc.RPTR;
            loc.RPTR.LPTR = node;
            loc.RPTR = node;
        }
    }

    void insertLast(int data) {
        Node node = new Node(data);
        if(Head == null) {
            Head = node;
            Last = node;
        } else {
            node.LPTR = Last;
            Last.RPTR = node;
            Last = node;
        }
    }

    void deleteFirst() {
        if(Head == null) {
            System.out.println("Under Flow");
            return;
        }
        else if(Head == Last) {
            Head = null;
            Last = null;
        }
        else {
            Head = Head.RPTR;
            Head.LPTR = null;
        }
    }

    void deleteLoc(Node loc) {
        if(loc == null) {
            System.out.println("Invalid Location");
        }
        else if(Head == Last) {
            Head = null;
            Last = null;
        }
        else {
            loc.LPTR.RPTR = loc.RPTR;
            loc.RPTR.LPTR = loc.LPTR;
        }
    }

    void deleteLast() {
        if(Head == null) {
            System.out.println("Under Flow");
        }
        else if(Head == Last) {
            Head = null;
            Last = null;
        } 
        else {
            Last = Last.LPTR;
            Last.RPTR = null;
        }
    }

    void traverseForward() {
        Node ptr = Head;
        while(ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.RPTR;
        }
    }
    void traverseBackward() {
        Node ptr = Last;
        while(ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.LPTR;
        }
    }
}

class doublyInsertDelete {
    public static void main(String args[]) {
        // Code
        DoublyLinkedList Dll = new DoublyLinkedList();

        Dll.insertFirst(10);
        Dll.insertFirst(20);
        Dll.insertLast(50);
        Dll.insertLast(60);
        Dll.insertLoc(30,Dll.Head.RPTR);
        Dll.traverseForward();
        System.out.println();
        Dll.traverseBackward();

        System.out.println();
        System.out.println();

        Dll.deleteFirst();
        Dll.deleteLast();
        Dll.deleteLoc(Dll.Head.RPTR);
        Dll.traverseForward();
        System.out.println();
        Dll.traverseBackward();
    }
}