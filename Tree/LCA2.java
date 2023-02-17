import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class LCA2{
    private Node root;
    Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root==null){
		    return null;
		}
		if(root.data==n1||root.data==n2){
		    return root;
		}
		Node left=lca(root.left,n1,n2);
		Node right=lca(root.right,n1,n2);
		if(left!=null&&right!=null){
		    return root;
		}
		if(left==null){
		    return right;
		}
		else{
		    return left;
		}
	}
     public static Node createNode(int data){
       Node nn=new Node();
       nn.data=data;
       nn.left=null;
       nn.right=null;
       return nn;
     }
    
    public static void main(String[] args){
      LCA2 tt=new LCA2();
      Node tree=createNode(5);
      tree.left=createNode(2);
      tree.right=createNode(7);
      tree.left.left=createNode(3);
      tree.left.right=createNode(4);
      int n1=3;
      int n2=4;
      System.out.println(tt.lca(tree,n1,n2).data);
    }
}