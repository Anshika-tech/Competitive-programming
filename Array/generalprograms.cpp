//Reverse an array.
//1.iterative method.
/*#include<bits/stdc++.h>
using namespace std;
void reverse_array(int a[],int start,int end){
    while(start<end){
        int t=a[start];
        a[start]=a[end];
        a[end]=t;
        start++;
        end--;
    }
}
void print_Array(int a[],int size){
    for(int i=0;i<size;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
}
int main(){
    int a[]={1,2,3,4,5,6};
    int n=sizeof(a)/sizeof(a[0]);
    cout<<"print the array"<<endl;
    print_Array(a,n);
    reverse_array(a,0,n-1);
    cout<<"print the reverse array"<<endl;
    print_Array(a,n);
    return 0;
}
2.Recursive call method.
#include<bits/stdc++.h>
using namespace std;
void reverse_Array(int a[],int start,int end){
    if(start>=end)
       return;
    int t=a[start];
    a[start]=a[end];
    a[end]=t;
    reverse_Array(a,start+1,end-1);
}
void print_Array(int a[],int size){
    for(int i=0;i<size;i++){
        cout<<a[i]<<" ";
    }
    cout<<endl;
}
int main(){
    int a[]={1,2,0,4,9,6};
    int n=sizeof(a)/sizeof(a[0]);
    cout<<"print the array"<<endl;
    print_Array(a,n);
    reverse_Array(a,0,n-1);
    cout<<"print the reverse array"<<endl;
    print_Array(a,n);   
}*/
//Rotation of array.
//q Write a function to rotate an array of size n by d elements.
//Method 1.
/*#include<bits/stdc++.h>
using namespace std;
void RotateArray(int a[],int n){
    int t=a[0];
    for(int i=0;i<n;i++){
      a[i]=a[i+1];
    }
    a[n-1]=t;
}
void RA(int a[],int d,int n){
    for(int i=0;i<d;i++)
        RotateArray(a,n);
}
void printArray(int a[],int n){
    for(int i=0;i<n;i++)
        cout<<a[i]<<" ";
    cout<<"\n";
}
int main(){
    int n,d;
    cout<<"Enter the size of array"<<endl;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
        cin>>a[i];
    cout<<"Enter the no of elements by which array rotated"<<endl;
    cin>>d;
    cout<<"starting Array:"<<endl;
    printArray(a,n);
    RA(a,d,n);
    cout<<"Array after rotating "<<endl;
    printArray(a,n);
   return 0; 
}

//Method 2 (Reversal algorithm)
#include<bits/stdc++.h>
using namespace std;
void reverseArray(int arr[],int start,int end){
    while(start<end){
        int t=arr[start];
        arr[start]=arr[end];
        arr[end]=t;
        start++;
        end--;
    }
}
void rotate(int arr[],int d,int n){
    if(d==0)
        return;
    d=d%n;
    reverseArray(arr,0,d-1);
    reverseArray(arr,d,n-1);
    reverseArray(arr,0,n-1);
}
void printArray(int arr[],int n){
    for(int i=0;i<n;i++)
        cout<<arr[i]<<" ";
    cout<<"\n";
}
int main(){
    int arr[]={1,2,3,4,5,6,7};
    int n=sizeof(arr)/sizeof(arr[0]);
    int d;
    cin>>d;
    rotate(arr,d,n);
    cout<<"Rotated Array"<<endl;
    printArray(arr,n);
    return 0;
}*/
//Move all negative numbers to beginning and positive to end with constant extra space
/*#include<bits/stdc++.h>
using namespace std;
void move(int a[],int n){
    int j=0;
    for(int i=0;i<n;i++){
        if(a[i]<0){
            if(i!=j)
               swap(a[i],a[j]);
            j++;
        }
    }
}
int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    move(a,n);
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
}*/
//union of two arrays
/*Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
#include<bits/stdc++.h>
using namespace std;
int dounion(int a[],int n,int b[],int m)
{
     set<int> s;
        for(int i=0;i<n;i++){
            s.insert(a[i]);
        }
         for(int i=0;i<m;i++){
            s.insert(b[i]);
        }
        return s.size();
}
int main(){
    int n,m;
    cin>>n>>m;
    int a[n],b[m];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    for(int i=0;i<m;i++){
        cin>>b[i];
    }
    cout<<dounion(a,n,b,m);
return 0;
}
*/
//Given an array, rotate the array by one position in clock-wise direction.
/*Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4

#include<bits/stdc++.h>
using namespace std;
void rotatecyclic(int a[],int n){
    int t=a[n-1];
    for(int i=n-1;i>0;i--){
        a[i]=a[i-1];
    }
    a[0]=t;
}
int main(){
    int a[]={1,2,3,4,5};
    int n=sizeof(a)/sizeof(a[0]);
    rotatecyclic(a,n);
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }
}
*/
//Kadane's algorithm
/*Given an array Arr[] of N integers. 
Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray
*/
#include<bits/stdc++.h>
using namespace std;
int sub_array(int a[],int n){
     int curr_sum=0;
        int max_sum=INT_MIN;
        for(int i=0;i<n;i++){
            curr_sum=curr_sum+a[i];
            if(curr_sum>max_sum){
                max_sum=curr_sum;   
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max_sum;
}
int main(){
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<sub_array(a,n);
}
