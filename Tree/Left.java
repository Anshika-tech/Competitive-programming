import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class Left{
    private Node root;
    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void left_(Node root){
    
        Queue<Node>q=new LinkedList<>();
        if(root==null){
            return;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=1;i<=n;i++){
                Node rv=q.remove();
                if(i==1){
                    System.out.print(rv.data+" ");
                }
                if(rv.left!=null){
                    q.add(rv.left);
                }
                if(rv.right!=null){
                    q.add(rv.right);
                }
            }
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
      Left tt=new Left();
      Node tree=createNode(5);
      tree.left=createNode(3);
      tree.right=createNode(6);
      tree.left.left=createNode(2);
      tree.left.right=createNode(4);
      tt.preorder(tree);
      System.out.println("Left view of tree");
      tt.left_(tree);
    }
}