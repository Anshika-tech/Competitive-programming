//Reverse an array.
//1.iterative method.
#include<bits/stdc++.h>
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