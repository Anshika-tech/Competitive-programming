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
    public static Node reverse(Node head){
		if(head==null||head.next==null){
            return head;
        }
        Node t=reverse(head.next);
        Node headnext=head.next;
        headnext.next=head;
        head.next=null;
        return t;
    }
    public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}    
    public void Addone(){
        Node temp=head;
        int c=0;
         temp.val=temp.val+1;
         Node prev=null;
        while(temp!=null){
            int ans=temp.val+c;
            c=ans/10;
            temp.val=ans%10;
            prev=temp;
            temp=temp.next;
           
        }
        if(c==1){
            Node nn1=new Node();
            nn1.val=c;
            prev.next=nn1;
        }
        
    }
}
public class AddOne{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        // ll.addlast(9);
        // ll.addlast(9);
       
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.head=ll.reverse(ll.head);
        ll.display(); 
        ll.Addone();
        ll.display();
        ll.head=ll.reverse(ll.head);
        ll.display();
            
  }
}