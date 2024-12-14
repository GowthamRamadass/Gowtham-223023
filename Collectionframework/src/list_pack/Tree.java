package list_pack;


import java.util.Queue;
import java.util.LinkedList;
class treenode
{
	int data;
	treenode left;
	treenode right;
}
public class Tree 
{	
	treenode root=null;
	
	void insert(int d) //1 2 3 4 5 6 7 8 9
	{
		treenode n = new treenode();
		n.data = d;
		
		if(root==null)
		{
			root = n;
			return;
		}
		//Queue a = new Queue();
		Queue<treenode> a = new LinkedList<>();
		a.add(root);
		while(!a.isEmpty())
		{
			treenode t = a.peek();
			a.remove();
			if(t.left==null)
			{
				t.left=n;
				break;
			}
			else if(t.right == null)
			{
				t.right =n;
				break;
			}
			a.add(t.left);
			a.add(t.right);
		}
		
	}
}
