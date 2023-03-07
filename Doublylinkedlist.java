public class Doublylinkedlist {
    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public void insertfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    public void insertlast(int data)
    { 
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
      
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;

    }
    public void insertloc(int index,int data)
    {   Node newNode =new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        
        int i=0;
        Node temp=head;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
       newNode.next=temp.next;
       temp.next=newNode;
       newNode.prev=temp;



    }
    public int removefirst()
    {
        if(size==0)
        {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        
        if(size==1)
        {   int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }
    public int removelast()
    {
        if(size==0)
         {
            System.out.println("ll is empty");
            return -1;
         }
         if(size==1)
         {   int val=head.data;
             head=tail=null;
             size--;
             return val;
         }
         int val=tail.data;
         tail=tail.prev;
         tail.next=null;
         size--;
         return val;
         
    }
    
    public int removeindex(int index)
    {
        if(size==0)
        {
           System.out.println("ll is empty");
           return -1;
        }
        if(size==1)
        {   int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        Node temp=head;
        int i=0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        
        int val=temp.next.data;
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
        
        size--;
        return val; 



    }
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <->" + " ");
            temp = temp.next;
        }
        System.out.println("null");   
        System.out.println();   
    }

    public static void main(String args[]) {
        Doublylinkedlist ll = new Doublylinkedlist();
        ll.insertfirst(4);
        ll.insertfirst(3);
        ll.insertfirst(2);
        ll.insertfirst(1);
        ll.display();
        ll.insertlast(5);
        ll.display();
        ll.insertloc(3,9);
        ll.display(); 
        ll.removefirst();
        ll.display();
        ll.removelast();
        ll.display();
        ll.removeindex(2);
        ll.display();
        
    }
}
