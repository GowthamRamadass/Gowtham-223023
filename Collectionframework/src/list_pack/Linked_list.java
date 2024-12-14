package list_pack;

//class node
//{
//	node prev;
//	int data;
//	node next;
//	
//	node(int d)
//	{
//		data = d;
//		next = null;
//	}
//}
public class Linked_list 
{
	private node head = null;
	node temp = null;
	
	void insert(int d)
	{
		node n = new node(d);
		
		if(head == null)
		{
			head = n;
			temp = n;
			temp.next = n;
			temp.prev = n;
		}
		else
		{
			temp.next = n;
			n.prev = temp;
			n.next = head;
			temp = n;
			head.prev = n;
		}
	}
	
	int get(int pos)
	{
		node t = head; int i=1;
		while(t!=null && i<pos)
		{
			t= t.next;
			i++;
		}
		return t.data;
	}
	
	void remove_last()
	{
		node t= head;
		while(t.next.next!=head)
		{
			t= t.next;
		}
		temp.next = head;
	}
	
	void insert_pos(int pos, int d)
	{
		int i=1; node t= head;
		
		while(t!=null && i<pos-1)
		{
			t = t.next;
			i++;
		}
		node n = new node(d);
		
		n.next = t.next;
		n.prev = t;
		t.next = n;
		n.next.prev = n;
	}
	void remove_pos(int pos)
	{
		if(pos==1 && head!=null)
		{ 
			head = head.next;
			temp.next = head;
			return;
		}
		node t= head;
		int i=1; 
		while(t!=null && i<pos-1)
		{
			t = t.next;
			i++;
		}
		if(t.next!=head)
		{
			t.next = t.next.next;
			t.next.prev = t; 
		}
		else if(t!=null)
		{
			t.next = null;
		}
	}
	
	void display()
	{
		node t = head;
		if(t!=null)
		{
			do
			{
				System.out.print(t.data + " ");
				t = t.next;
				
			}while(t!=head);
		}
	}
	
	void display_rev()
	{
		node t = temp;
		while(t!=null)
		{
			System.out.print(t.data + " ");
			t = t.prev;
		}
	}
	
}
