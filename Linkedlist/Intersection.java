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
    public void inter(Node headA,Node headB){
        Node p=headA;
        Node q=headB;
        Node dummy=new Node();
        Node temp=dummy;
          while(p != null  &&  q != null)
      {
          if(p.val == q.val)
          {
              // add to dummy list
              dummy.next=p;
              //System.out.println(dummy.next.data);
              dummy=dummy.next;
              p = p.next;
              q = q.next;
              dummy.next=null;
          }
          else if(p.val < q.val)
              p = p.next;
          else
              q= q.next;
      }
      head=temp.next;
        
    }
}
public class Intersection{
    public static void main(String[] args){
        LinkedList ll1=new LinkedList();
        LinkedList ll2=new LinkedList();   
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       int[] arr1=new int[n];
       int[] arr2=new int[m];
       for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
       }
       for(int i=0;i<m;i++){
        arr2[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
          ll1.addlast(arr1[i]);
       }
       for(int i=0;i<m;i++){
          ll2.addlast(arr2[i]);
       }
       ll1.inter(ll1.head,ll2.head);
       ll1.display();

       //System.out.println(tem.val);
      
    }
}