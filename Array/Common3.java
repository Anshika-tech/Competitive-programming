import java.util.*;
public class Common3{
    public static void commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        int i=0,j=0,k=0;
        while(i<n1&&j<n2&&k<n3){
            if(A[i]==B[j]&&B[j]==C[k]){
                System.out.print(A[i]+" ");
                i++;
                j++;
                k++;
            }
            else if(A[i]<B[j]){
                i++;
            }
            else if(B[j]<C[k]){
                j++;
            }
            else{
                k++;
            }
            
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();  
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        int[] arr3=new int[n3];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n3;i++){
            arr3[i]=sc.nextInt();
        }
       commonElements(arr1,arr2,arr3,n1,n2,n3);
    }
}