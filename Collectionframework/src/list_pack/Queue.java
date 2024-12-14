package list_pack;

class node
{
	treenode data;
	node next;
}
public class Queue {
	
	private node front = null, rear = null;
	
	void enqueue(treenode d)
	{
		node n = new node();
		n.data = d;
		
		if(front ==null)
		{
			front = n;
			rear = n;
		}
		else
		{
			rear.next = n;
			rear = n;
		}
	}
	
	treenode dequeue()
	{
		treenode a = front.data;
		front = front.next;
		if(front==null)
		{
			rear = null;
		}
		return a;
	}
	
	treenode front()
	{
		return front.data;
	}
	
	boolean isempty()
	{
		return front == null;
	}
}
