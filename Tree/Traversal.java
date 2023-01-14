import java.util.*;
public class Traversal{
    Scanner sc=new Scanner(System.in);
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public Traversal(){
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
     public void levelorder(){
        LinkedList<Node>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
           Node rv=queue.remove();
           System.out.print(rv.data+" ");
           if(rv.left!=null){
            queue.add(rv.left);
           }
           if(rv.right!=null){
            queue.add(rv.right);
           }
        }
     }
    public static void main(String[] args){
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true
		// 70 false false false
      Traversal tt=new Traversal();
      tt.levelorder();
    }
}