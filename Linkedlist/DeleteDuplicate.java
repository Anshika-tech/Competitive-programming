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
    public void deleteDuplicates() {
        if(head==null){
            return;
        }
        Node temp=head;

        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
       // return head;
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
public class DeleteDuplicate{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlast(1);
        ll.addlast(1);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(4);
        ll.addlast(6);
       ll.display();
       ll.deleteDuplicates();
       System.out.println("After deletion of duplicate node in sorted linked list");
       ll.display();
    }
}