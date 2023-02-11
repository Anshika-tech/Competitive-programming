import java.util.*;
public class Redundant{
    public static boolean redundency_check(String s)
    { 
          Stack<Character>st=new Stack<>();
          char[] str=s.toCharArray();
          for(char ch:str){
             if(ch==')'){
                 char top=st.peek();
                 st.pop();
                 boolean flag=true;
                 while(top!='('){
                    if(top=='+'||top=='-'||top=='*'||top=='/'){
                        flag=false;
                    }
                    top=st.peek();
                    st.pop();
                 }
                 if(flag==true){
                    return true;
                 }
             }
             else{
                st.push(ch);
             }
          }
          return false;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         if(redundency_check(s)){
            System.out.println("Redundancy exits in string");
         }
         else{
            System.out.println(" no Redundancy exits in string");
         }
    }
}