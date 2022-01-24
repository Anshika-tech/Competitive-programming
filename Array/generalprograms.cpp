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
#include<bits/stdc++.h>
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
}
