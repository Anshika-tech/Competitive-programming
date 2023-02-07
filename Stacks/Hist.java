import java.util.*;
public class Hist{
    public static long getMaxArea(long arr[], int n) 
    {
        // your code here
        Stack<Integer>st=new Stack<>();
        long ans=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
                int r=i;
                long h=arr[st.pop()];
                if(st.isEmpty()){
                    ans=Math.max(ans,h*r);
                }
                else{
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=arr.length;
          while(!st.isEmpty()){
                long h=arr[st.pop()];
                if(st.isEmpty()){
                    ans=Math.max(ans,h*r);
                }
                else{
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
            }
            return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getMaxArea(arr,n));
    }
}