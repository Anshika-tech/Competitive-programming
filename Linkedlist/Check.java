class LinkedList{
    public class Node{
        int val;
        Node next;
    }
    public Node head;
    public Node tail;
    public int size;
    public void addlast(int item){
        Node nn=new Node();
        nn.val=item;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public boolean isCircular()
    {
	// Your code here
	if(head==null){
	    return true;
	}
	Node temp=head;
	   while(temp!=null){
	       if(temp.next==head){
	           return true;
	       }
	       temp=temp.next;
	   }
	   return false;
    }
   
}
public class Check{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.tail.next=ll.head;
        System.out.println(ll.isCircular());

    }
}
