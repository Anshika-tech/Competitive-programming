import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class DeleteNode{
    private Node root;
    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static int min(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int left=min(root.left);
        return Math.min(left,root.data);
    }
    public static Node deleteNode(Node root,int key){
        if(root==null){
            return root;
        }
        if(root.data<key){
            root.right=deleteNode(root.right,key);
        }
        else if(root.data>key){
            root.left=deleteNode(root.left,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                int min=min(root.right);
                root.right=deleteNode(root.right,min);
                root.data=min;
            }
        }
       return root;
    }
     public static Node createNode(int data){
       Node nn=new Node();
       nn.data=data;
       nn.left=null;
       nn.right=null;
       return nn;
     }
    
    public static void main(String[] args){
      DeleteNode tt=new DeleteNode();
      Node tree=createNode(5);
      tree.left=createNode(3);
      tree.right=createNode(6);
      tree.left.left=createNode(2);
      tree.left.right=createNode(4);
      tree.right.right=createNode(7);
      tt.preorder(tree);
      tt.deleteNode(tree,3);
      System.out.println();
      tt.preorder(tree);
      
    }
}