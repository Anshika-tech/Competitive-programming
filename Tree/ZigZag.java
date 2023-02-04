import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class ZigZag{
    private Node root;
     public static Node createNode(int data){
       Node nn=new Node();
       nn.data=data;
       nn.left=null;
       nn.right=null;
       return nn;
     }
     public static void zigZagTraversal(Node root)
     {
        
         LinkedList<Node>queue=new LinkedList<>();
         LinkedList<Node>help=new LinkedList<>();
         queue.add(root);
         ArrayList<Integer>ll=new ArrayList<>();
          ArrayList<Integer>a=new ArrayList<>();
         int level=0;
         while(!queue.isEmpty()){
             Node rv=queue.remove();
             ll.add(rv.data);
             if(rv.left!=null){
                 help.add(rv.left);
                 
             }
             if(rv.right!=null){
                 help.add(rv.right);
             }
             if(queue.isEmpty()){
                 queue=help;
                 help=new LinkedList<>();
                 if(level%2==0){
                     for(int val:ll){
                        System.out.print(val+" ");
                     }
                 }
                 else{
                     Collections.reverse(ll);
                     for(int val:ll){
                        System.out.print(val+" ");
                     }
                 }
                 ll=new ArrayList<>();
                 level++;
             }
             
         }
     }
    public static void main(String[] args){
      Left tt=new Left();
      Node tree=createNode(5);
      tree.left=createNode(3);
      tree.right=createNode(6);
      tree.left.left=createNode(2);
      tree.left.right=createNode(4);
      zigZagTraversal(tree);
    }
}