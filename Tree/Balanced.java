import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class Balanced{
     Node root;
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
        
    }
    public boolean isBalanced(Node root)
    {
	if(root==null){
	    return true;
	}
	boolean left=isBalanced(root.left);
	boolean right=isBalanced(root.right);
	boolean isbal=Math.abs(height(root.left)-height(root.right))<=1;
	return left&&right&&isbal;
    }
     public static Node createNode(int data){
       Node nn=new Node();
       nn.data=data;
       nn.left=null;
       nn.right=null;
       return nn;
     }
    public static void main(String[] args){
      Balanced tt=new Balanced();
      Node tree=createNode(5);
      tree.left=createNode(3);
      tree.right=createNode(6);
      tree.left.left=createNode(2);
      tree.left.right=createNode(4);
      System.out.print(tt.isBalanced(tree));
    }
}