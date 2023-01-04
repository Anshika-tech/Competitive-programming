/*The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

 

Example 1:

Input: n = 3, k = 3
Output: "213"
Example 2:

Input: n = 4, k = 9
Output: "2314"
Example 3:

Input: n = 3, k = 1
Output: "123"
*/

import java.util.*;
public class Permu{
    public static String getPermutation(int n, int k) {
        ArrayList<Integer>a=new ArrayList<>();
        int f=1;
        for(int i=1;i<n;i++){
            f=f*i;
            a.add(i);
        }
        a.add(n);
        k=k-1;
        String ans="";
        while(true){
            ans=ans+a.get(k/f);
            a.remove(a.get(k/f));
            if(a.size()==0){
                break;
            }
            k=k%f;
            f=f/a.size();
        }
        return ans;
    }
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int k=sc.nextInt();
         System.out.println(getPermutation(n,k));

    }
}