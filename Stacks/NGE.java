import java.util.*;
public class NGE{
    public static void nextLargerElement(long[] arr, int n)
    { 
          long[] ans=new long[n];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&arr[i]>arr[s.peek()]){
                ans[s.pop()]=arr[i];
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            ans[s.pop()]=-1;
        }
       for(int i=0;i<n;i++){
          System.out.print(ans[i]+" ");
       }
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        nextLargerElement(arr,n);
    }
}