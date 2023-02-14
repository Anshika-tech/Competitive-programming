import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class Construct1{
    private Node root;
    public void Inorder1(){
        Inorder(root);
    }
    public void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public void preorder1(){
        preorder(root);
    }
    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
   public void createNode(int val){
        root=create(root,val);
   }
    public static Node create(Node node,int val) {
       if(node==null){
         Node nn=new Node();
         nn.data=val;
         return nn;
       }
       if(node.data>val){
          node.left=create(node.left,val);
       }
       if(node.data<val){
        node.right=create(node.right,val);
       }

        return node;
    }
    public static void main(String[] args){
      Construct1 tt=new Construct1();
      int[] arr={10,5,1,7,40, 50};
      for(int i=0;i<arr.length;i++){
        tt.createNode(arr[i]);
      }
      System.out.println("Preorder");
     tt.preorder1();
     System.out.println("Inorder");
     tt.Inorder1();

      
    }
}