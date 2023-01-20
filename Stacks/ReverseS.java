import java.util.*;
public class ReverseS{
    public static void insert_down(Stack<Integer>s,int item){
            if(s.isEmpty()){
                s.push(item);
                return;
            }
            int a=s.pop();
            insert_down(s,item);
            s.push(a);
    }
    public static void reverse(Stack<Integer>s){
             if(s.isEmpty()){
                return;
             }
             int x=s.pop();
             reverse(s);
             insert_down(s,x);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer>s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
        reverse(s);
        System.out.print(s);

    }
}