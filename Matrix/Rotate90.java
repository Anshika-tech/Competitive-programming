//Rotate array 90 clockwise;
import java.util.*;
public class Rotate90{
    public static void reverse(int[][] arr,int i){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int t=arr[i][l];
            arr[i][l]=arr[i][h];
            arr[i][h]=t;
            l++;
            h--;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
      
        int[][] arr=new int[n][m];
        int[][] B=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                B[i][j]=arr[j][i];
            }
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
      for(int i=0;i<n;i++){
          reverse(B,i);
         }
      System.out.println("");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(B[i][j]+" ");
        }
        System.out.println("");
    }     
    }
}