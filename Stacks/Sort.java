import java.util.*;
public class Sort{  
    public static void insert(Stack<Integer>s,int item){
        if(s.isEmpty()||item>s.peek()){
            s.push(item);
            return;
        }
        int temp=s.pop();
        insert(s,item);
        s.push(temp);
    }
    public static void sort_stack(Stack<Integer>s){
          if(s.isEmpty()){
	         return;
	     }
	     int t=s.pop();
	     sort(s);
	     insert(s,t);
	   
    }
	public static Stack<Integer> sort(Stack<Integer> s)
	{
	    sort_stack(s);
	    return s;
	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer>s=new Stack<>();
        s.push(30);
        s.push(2);
        s.push(-1);
        s.push(-2);
        s.push(5);
        System.out.println(s);
        System.out.println(sort(s));
    }
}