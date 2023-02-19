import java.util.*;
public class Permutation{
    public static void permutation(String ques,String ans){
         if(ques.length()==0){
            System.out.println(ans);
            return;
         }
         char ch=ques.charAt(0);
         permutation(ques.substring(1),ans);
         permutation(ques.substring(1),ans+ch);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1="abc";
        permutation(s1,"");   
    }
}