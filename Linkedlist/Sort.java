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
    public void Sort012() {
        int count[]={0,0,0};
        Node ptr=head;
        while(ptr!=null){
            count[ptr.val]++;
            ptr=ptr.next;
        }
        ptr=head;
        int i=0;
        while(ptr!=null){
            if(count[i]==0){
                i++;
            }
            else{
                ptr.val=i;
                count[i]--;
                ptr=ptr.next;
            }
        }
	}
    
}
public class Sort{
    public static void main(String[] args){
       LinkedList ll=new LinkedList();
       ll.addlast(1);
       ll.addlast(1);
       ll.addlast(2);
       ll.addlast(0);
       ll.addlast(2);
       ll.addlast(0);
       ll.display();
       ll.Sort012();
       ll.display();
    }
}