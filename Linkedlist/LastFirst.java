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
   public void lastToFirst(){
        if(head==null||head.next==null){
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){ 
            prev=temp;
           temp=temp.next;
        }
        prev.next=null;
        temp.next=head;
        head=temp;
    }    
}
public class LastFirst{
    public static void main(String[] args){
       LinkedList ll=new LinkedList();
       ll.addlast(1);
       ll.addlast(2);
       ll.addlast(3);
       ll.addlast(4);
       ll.addlast(5);
       ll.addlast(7);
       ll.display();
       System.out.println("After Moving last element to front of a given Linked List");
       ll.lastToFirst();
       ll.display(); 
    }
}