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
    public Node GetNode(int k){
        if(k<0||k>size){
            return null;
        }
        Node temp=head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp;
    }
    public  boolean Detect(){
       
		Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
                
            }
        }
        return false;
    }
    public Node MeetingPoint(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
       }
    public Node FirstNode(){
        Node slow=head;
        Node fast=MeetingPoint();
        
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    
}
public class FirstNode{
    public static void main(String[] args){
       LinkedList ll=new LinkedList();
       ll.addlast(1);
       ll.addlast(2);
       ll.addlast(3);
       ll.addlast(4);
       ll.addlast(5);
       ll.addlast(6);
       ll.tail.next=ll.GetNode(3); 
       System.out.println(ll.tail.next.val);
       if(ll.Detect()==true){
          System.out.println("Starting point "+ll.FirstNode().val);
       }     
    }
}