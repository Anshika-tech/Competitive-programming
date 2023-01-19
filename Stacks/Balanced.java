import java.util.*;
public class Balanced{
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character>s=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='('||x.charAt(i)=='['||x.charAt(i)=='{'){
                s.push(x.charAt(i));
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='('&&x.charAt(i)==')'){
                    s.pop();
                }
                else if(s.peek()=='{'&&x.charAt(i)=='}'){
                    s.pop();
                }
                else if(s.peek()=='['&&x.charAt(i)==']'){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        return s.size()==0;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        if(ispar(s1)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}