import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class LeafSame{
    private Node root;
    boolean check(Node root)
    {
	 if(root==null){
	     return true;
	 }
	 Queue<Node>q=new LinkedList<>();
	 q.add(root);
	 int level=0;
	 int r=Integer.MAX_VALUE;
	 while(!q.isEmpty()){
	     int size=q.size();
	     level++;
	     for(int i=0;i<size;i++){
	         Node rv=q.remove();
	         if(rv.left!=null){
	             q.add(rv.left);
	             if(rv.left.left==null&&rv.left.right==null){
	                 if(r==Integer.MAX_VALUE){
	                     r=level;
	                 }
	                 else if(r!=level){
	                     return false;
	                 }
	             }
	         }
	          if(rv.right!=null){
	             q.add(rv.right);
	             if(rv.right.left==null&&rv.right.right==null){
	                 if(r==Integer.MAX_VALUE){
	                     r=level;
	                 }
	                 else if(r!=level){
	                     return false;
	                 }
	             }
	         }   
	     }
	 }
	 return true;
    }
     public static Node createNode(int data){
       Node nn=new Node();
       nn.data=data;
       nn.left=null;
       nn.right=null;
       return nn;
     }
    public static void main(String[] args){
      LeafSame tt=new LeafSame();
      Node tree=createNode(5);
      tree.left=createNode(3);
      tree.right=createNode(6);
      tree.left.left=createNode(2);
      tree.left.right=createNode(4);
      tree.right.left=createNode(7);
      tree.right.right=createNode(8);
      System.out.println(tt.check(tree));
    }
}