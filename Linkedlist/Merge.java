
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
    public void  mergeTwoLists(Node list1,Node list2) {
        Node Dummy=new Node();
        Node t=Dummy;
        while(true){
            if(list1==null){
                t.next=list2;
                break;
            }
            if(list2==null){
                t.next=list1;
                break;
            }
            if(list1.val<=list2.val){
                 t.next=list1;
                 list1=list1.next;
            }
            else{
                t.next=list2;
                list2=list2.next;
            }
             t=t.next;
           }
        head=Dummy.next;
    }
   
}
public class Merge{
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
       
       ll1.mergeTwoLists(ll1.head,ll2.head);
       ll1.display();

    }
}