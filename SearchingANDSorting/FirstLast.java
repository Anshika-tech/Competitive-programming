import java.util.*;
public class FirstLast{
      public static void first(long arr[],int x){
        int lo=0;
        int hi=arr.length-1;
        long res=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==x){
                 res=mid;
                hi=mid-1;
            }
            else if(arr[mid]<x){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
      System.out.println("First ocurrence of target "+res);
    }
     public static void Last(long arr[],int x){
        int lo=0;
        int hi=arr.length-1;
        long res=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==x){
                 res=mid;
                lo=mid+1;
            }
            else if(arr[mid]<x){
                 lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
         System.out.println("Last ocurrence of target "+res);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        first(arr,x);
        Last(arr,x);
    }
}