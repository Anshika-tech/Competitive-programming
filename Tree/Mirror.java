import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class Mirror{
    private Node root;
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static Node mirrorify(Node root){
        if(root==null){
            return null;
        }
        Node m=createNode(root.data);
        m.right=mirrorify(root.left);
        m.left=mirrorify(root.right);
        return m;
    }
     public static Node createNode(int data){
       Node nn=new Node();
       nn.data=data;
       nn.left=null;
       nn.right=null;
       return nn;
     }
    
    public static void main(String[] args){

       Mirror tt=new Mirror();
      Node tree=createNode(5);
      tree.left=createNode(3);
      tree.right=createNode(6);
      tree.left.left=createNode(2);
      tree.left.right=createNode(4);
      tt.inorder(tree);
      System.out.println("");
      Node mirr=mirrorify(tree);
      System.out.println("Inorder of mirror tree");
      tt.inorder(mirr);

    }
}