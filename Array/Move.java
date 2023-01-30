import java.util.*;
public class Move{
    public static void negative(int[] arr,int n){
        int j=0;
        int temp;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                 if(i!=j){
                     temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                 }
                j++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        negative(arr,n);
    }
}