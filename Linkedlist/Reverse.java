/*class LinkedList {

	private class Node {
		int val;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

// O(1)
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if (this.size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;

		}

	}

	// O(1)
	public void addlast(int item) {

		if (size == 0) {
			addFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;

		}

	}

//   O(n)
	public void Addatindex(int item, int k) throws Exception {
		if (k < 0 || k > size) {
			throw new Exception("BkLOL k out of Range hai ");

		}
		if (k == 0) {
			addFirst(item);
		} else if (k == size) {
			addlast(item);
		} else {
			Node k_1th = GetNode(k - 1);
			Node nn = new Node();
			nn.val = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}

	}

	public int getFirst() {
		return head.val;
	}

	public int getlast() {
		return tail.val;
	}

	public int getatindex(int k) throws Exception {
		return GetNode(k).val;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	// O(n)
	private Node GetNode(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("BkLOL k out of Range hai ");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

// O(1)
	public int removefirst() {
		Node temp = head;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.next;
			temp.next = null;
			size--;
		}
		return temp.val;

	}

	public int removelast() throws Exception {
		if (size == 1) {
			return removefirst();
		} else {
			Node ss = GetNode(size - 2);
			int rv = tail.val;
			tail = ss;
			tail.next = null;
			size--;
			return rv;
		}

	}

	public int removeatindex(int k) throws Exception {
		if (k == 0) {
			return removefirst();
		} else if (k == size - 1) {
			return removelast();
		} else {
			Node prev = GetNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}

	}
   

}


public class Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.display();
		ll.addlast(-9);
		ll.display();
		ll.Addatindex(80, 3);
		ll.display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getlast());
//		System.out.println(ll.getatindex(3));
//		System.out.println(ll.removefirst());
//		System.out.println(ll.removelast());
		System.out.println(ll.removeatindex(2));
		ll.display();

	}

}
*/
//---------------------------------------------------------------------
//---------------------------------------------------------------------
//Reverse linkedlist by iterative method.


/*class LinkedList{
    private class Node{
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
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
    public void reverse(){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
     head=prev;
    }
}
public class Reverse{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.display();
        ll.reverse();
        ll.display();

    }
}
*/

//Recursive method
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
}
public class Reverse{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.display();
        ll.head=ll.reverse(ll.head);
        ll.display();

    }
}
