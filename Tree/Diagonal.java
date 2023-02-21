import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class Diagonal{
    private Node root;
    void check(Node root)
    {
        if(root==null){
            return;
        }
        ArrayList<Integer>l=new ArrayList<>();
	   Queue<Node>q=new LinkedList<>();
	   Node node=root;
       while(node!=null){
           l.add(node.data);
           if(node.left!=null){
            q.add(node.left);
           }
           if(node.right!=null){
            node=node.right;
           }
           else if(!q.isEmpty()){
               node=q.peek();
               q.remove();
           }
           else{
            node =null;
           }
       }
	 
	 System.out.print(l);
    }
     public static Node createNode(int data){
       Node nn=new Node();
       nn.data=data;
       nn.left=null;
       nn.right=null;
       return nn;
     }
    public static void main(String[] args){
      Diagonal tt=new Diagonal();
      Node tree=createNode(5);
      tree.left=createNode(3);
      tree.right=createNode(6);
      tree.left.left=createNode(2);
      tree.left.right=createNode(4);
      tree.right.left=createNode(7);
      tree.right.right=createNode(8);
      tt.check(tree);
    }
}