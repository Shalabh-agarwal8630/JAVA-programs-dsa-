public class Circular_Queue {
	
	static class cirqueue
	{
		static int [] a; 
		static int size;
		static int rear;
		static int front;
		
		cirqueue(int size)
		{
			a = new int[size];
			this.size = size;
			rear = -1;
			front = -1;
		}
		
		static Boolean isEmpty() {
			return rear == -1 && front == -1;
		}
		
		static Boolean isFull() {
			return (rear+1)%size == front;
		}
		
		static void add(int data)
		{		
			if(isFull())
			{
				System.out.println("Queue is full");
				return ;
			}
			if(front == -1)
				front = 0;
			rear = (rear+1)%size;
			a[rear] = data;
		}
		
		static int remove()
		{
			if(isEmpty())
			{
				System.out.println("Queue is empty");
				return -1;
			}
			int result = a[front];
			if(rear == front) // deleted last element
				rear = front = -1;
			else
				front = (front+1)%size;
			return result;
		}
		
		static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Queue is empty");
				return -1;
			}
			int result = a[front];
			return front;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cirqueue q = new cirqueue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty())
		{
			System.out.println(q.remove());
		}
	}
}