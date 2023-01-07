import java.util.*;
class LinkedList{
    public class Node{
        Node next;
        int val;
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
    public void removeDuplicates() 
    {
         // Your code here 
         if(head==null){
             return;
         }
        HashSet<Integer>s=new HashSet<>();
        Node prev=head;
        Node temp=head;
         while(temp!=null){
             if(!s.contains(temp.val)){
                 s.add(temp.val);
                 prev=temp;
             }
             else{
                 prev.next=temp.next;
             }
             temp=temp.next;
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
}
public class DeleteDuplicate2{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlast(5);
        ll.addlast(3);
        ll.addlast(2);
        ll.addlast(4);
        ll.addlast(3);
        ll.addlast(6);
       ll.display();
       ll.removeDuplicates();
       System.out.println("After deletion of duplicate node in unsorted linked list");
       ll.display();
    }
}