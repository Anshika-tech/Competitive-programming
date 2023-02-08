import java.util.*;
public class ValidSubstring{
    static int findMaxLen(String S) {
        int c=0;
        Stack<Integer>s=new Stack<>();
        s.push(-1);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                s.push(i);
                
            }
            else{
                if(!s.isEmpty()){
                   s.pop();
                }
                if(s.isEmpty()){
                    s.push(i);
                }
                else{
                    c=Math.max(c,i-s.peek());
                }
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         String s=sc.next();
         System.out.println(findMaxLen(s));
    }
}