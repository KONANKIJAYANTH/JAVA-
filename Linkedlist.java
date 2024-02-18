class Node{
	int data;
	Node last, next;
	public Node(int data)
	{
		this.data=data;
		this.last=null;
		this.next=null;
		
	}
}// end of non-primitive data type which is created to use as a node
// CREATING  a class named  as doublylinkedlist 
class doublylinkedlist{
	Node head;
	//constructor
	public int doublylinkedlist()//initializing the head value
	{
		this.head=null;
		return 0;
	}
//creating a method to insert values into linkedlist
	public int insert(int data)
	{
        Node current;
        current = null;
        Node newnode = new Node(data);       // creating a new node
        if(head==null){
               head=newnode;
              
        }
        else{
        	current = head;
            while (current.next != null) {       //transversing until the last node
                current = current.next;
            }
        	current.next=newnode;
        	newnode.last=current;
        	current=newnode;
        }
       return 0;
	}
	public int display()
	{
		Node current;
		current=head;
		System.out.println("DOUBLY LINKED LIST ");
		while(current!=null)
		{
           System.out.print(current.data+"->");
           current=current.next;
		}
		return 0;
	}
}
// main class 
public class Linkedlist{
	public static void main(String[] args) {
		doublylinkedlist obj = new doublylinkedlist();
		obj.insert(5);
		obj.insert(6);    //inserting values into linkedlist
		obj.insert(7);
		obj.display();
	}
}		

