//Reverse Node in k Groups
import java.util.*;
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
    public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
    public Node reverseKGroups(Node head,int k){
		 Stack<Node>st=new Stack<>();
         Node Dummy=new Node();
         Node temp=Dummy;
         Node start=head;
         while(head!=null){
            if(st.size()==0){
               start=head;
            }
            st.push(head);
            if(st.size()==k){
                while(!st.isEmpty()){
                    Node m=new Node();
                    m.val=st.pop().val;
                    Dummy.next=m;
                    Dummy=Dummy.next;
                }
            }
            head=head.next;
         }
         if(st.size()>0){
            Dummy.next=start;
         }
         return temp.next;
    }
}
public class ReverseKgroups{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.addlast(7);
        int k=sc.nextInt();
        ll.display();
        ll.head=ll.reverseKGroups(ll.head,k);
        ll.display();

    }
}
