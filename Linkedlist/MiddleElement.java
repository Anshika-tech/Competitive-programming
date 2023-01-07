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
    public int Middle(){
		Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.val;
    }
}
public class MiddleElement{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        //ll.addlast(7);

        ll.display();
        System.out.println(ll.Middle());
    }
}
