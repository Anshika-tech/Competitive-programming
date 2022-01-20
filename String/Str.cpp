//Write an efficient program to print all the duplicates and their counts in the input string 
#include<bits/stdc++.h>
using namespace std;
void counts(string s){
    unordered_map<char,int>m;
    for(int i=0;i<s.length();i++){
        m[s[i]]++;
    }
    for(auto it : m){
        if(it.second>1){
            cout<<it.first<<" count is: "<<it.second;
        }
        cout<<"\n";
    }
}
int main(){
    string s;
    cin>>s;
    counts(s);
    return 0;
}