package day6;
import java.util.*;
class Stack
{
	private int top;
	private int[] stack;
	private int n;
	
	Stack(int capacity)
	{
		this.n=capacity;
		this.stack=new int[capacity];
		this.top=-1;
	}
	void push(int ele)
	{
		if(top==n-1)
			System.out.println("Stack is full");
		top++;
		stack[top]=ele;		
	}
	int pop()
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		int ele=stack[top];
		stack[top]=0;
		top--;
		return ele;
	}
	void printstack()
	{
		if(isEmpty())
			System.out.println("Stack is empty");
		System.out.println(stack[top]);
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
}

 class Queue{
	private Stack s1;
	private Stack s2;
	Queue(int capacity)
	{
		s1=new Stack(capacity);
		s2=new Stack(capacity);
		
	}
	public void enqueue(int ele)
	{
		s1.push(ele);
	}
	public void dequeue()
	{
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		s2.pop(); 
	}
	public void print()
	{
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		s2.printstack();
	}
}
class Queue_Using_Stack
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int query=sc.nextInt();
		Queue queue=new Queue(query);
		for(int i=0;i<query;i++)
		{
			int op=sc.nextInt();
			switch(op)
			{
			case 1:int ele=sc.nextInt();
					queue.enqueue(ele);
					break;
			case 2:queue.dequeue();
					break;
			case 3:queue.print();
					break;
			}
		}
	}

}
