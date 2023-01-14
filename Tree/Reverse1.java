import java.util.*;
public class Reverse1{
    Scanner sc=new Scanner(System.in);
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public Reverse1(){
        this.root=createtree();
    }
     private Node createtree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        boolean hlc=sc.nextBoolean();
        if(hlc==true){
            nn.left=createtree();
        }
        boolean hlr=sc.nextBoolean();
        if(hlr==true){
            nn.right=createtree();
        }
        return nn;
     }
     public void reverselevelorder(){
        Stack<Node>s=new Stack<>();
       LinkedList<Node>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
           Node rv=queue.remove();
           s.push(rv);
           if(rv.right!=null){
            queue.add(rv.right);
           }
           if(rv.left!=null){
            queue.add(rv.left);
           }
        }
       while(!s.isEmpty()){
           Node r=s.peek();
           System.out.print(r.data+" ");
           s.pop();
       }
     }
    public static void main(String[] args){
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true
		// 70 false false false
      Reverse1 tt=new Reverse1();
      tt.reverselevelorder();
    }
}