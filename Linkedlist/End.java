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
    public int getNthFromLast(int n)
    {
    	Node temp=head;
    	int len=0;
    
           while(temp!=null){
                len++;
                temp=temp.next;
           }
           	if(len<n){
    	    return -1;
    	}
           Node t=head;
           for(int i=1;i<len-n+1;i++){
               t=t.next;
           }
            return t.val;
    }
}
public class End{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        System.out.println(ll.getNthFromLast(2));    

    }
}