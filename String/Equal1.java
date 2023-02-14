import java.util.*;
public class Equal1{
    public static boolean Check_rotation(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
         Queue<Character>q1=new LinkedList<>();
         for(int i=0;i<s1.length();i++){
            q1.add(s1.charAt(i));
         }
         Queue<Character>q2=new LinkedList<>();
         for(int i=0;i<s2.length();i++){
            q2.add(s2.charAt(i));
         }
         int k=s1.length();
         while(k!=0){
            k--;
            char ch=q2.peek();
            q2.remove();
            q2.add(ch);
            if(q2.equals(q1)){
                 return true;
            }
         }
    return false;

    }
    public static void main(String[] args){
        String s1="AACD";
        String s2="ACDA";
        if(Check_rotation(s1,s2)){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }

    }
}