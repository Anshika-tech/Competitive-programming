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
#include<bits/stdc++.h>
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


