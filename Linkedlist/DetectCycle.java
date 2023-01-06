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
  
    public static boolean Detect(Node head){
        if(head==null||head.next==null){
            return false;
        }
		Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println(slow.val);
                return true;
                
            }
        }
        return false;
    }
    public  Node GetNode(int k) {
		// if (k < 0 || k >= size) {
		// 	throw new Exception("BkLOL k out of Range hai ");
		// }
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

}
public class DetectCycle{

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.tail.next=ll.GetNode(2); 
        System.out.println(ll.Detect(ll.head));
       
    }
}