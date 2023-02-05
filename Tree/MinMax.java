import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class MinMax{
    private Node root;
   
     public static Node createNode(int data){
       Node nn=new Node();
       nn.data=data;
       nn.left=null;
       nn.right=null;
       return nn;
     }
     public static int minValue(Node node) {
        if(node==null){
            return -1;
        }
       if(node.left==null){
           return node.data;
       }
       return minValue(node.left);
        
    }
    public static int maxValue(Node node) {
        if(node==null){
            return -1;
        }
       if(node.right==null){
           return node.data;
       }
       return maxValue(node.right);
        
    }
    public static void main(String[] args){
      MinMax tt=new MinMax();
      Node tree=createNode(5);
      tree.left=createNode(3);
      tree.right=createNode(6);
      tree.left.left=createNode(2);
      tree.left.right=createNode(4);
      tree.right.right=createNode(7);
      System.out.println(tt.minValue(tree));
      System.out.print(tt.maxValue(tree));

      
    }
}