import java.util.*;
public class Arithmetic{  
    public static int evaluatePostFix(String S)
    {
        Stack<Integer>s1=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                s1.push(S.charAt(i)-'0');
            }
            else{
                int v1=s1.pop();
                int v2=s1.pop();
                if(S.charAt(i)=='+'){
                    s1.push(v1+v2);
                }
                 if(S.charAt(i)=='*'){
                    s1.push(v1*v2);
                }
                 if(S.charAt(i)=='-'){
                    s1.push(v2-v1);
                }
                 if(S.charAt(i)=='/'){
                    s1.push(v2/v1);
                }
                
            }
        }
        return s1.pop();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         String s=sc.next();
        System.out.println(evaluatePostFix(s));
    }
}