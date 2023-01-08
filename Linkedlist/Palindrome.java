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
    public boolean palindrome(){
        Stack<Node>s=new Stack<>();
        Node temp=head;

        while(temp!=null){
            s.push(temp);
            temp=temp.next;
        }
       
        while(head!=null){
            if(head.val!=s.pop().val){
                return false;
            }
            head=head.next;
        }
     return true;
    }
   
}
public class Palindrome{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(1);
       // ll.addlast(1);
        System.out.println(ll.palindrome());    
    }
}
