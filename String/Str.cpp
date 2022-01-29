//Write an efficient program to print all the duplicates and their counts in the input string 
/*#include<bits/stdc++.h>
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
*/
//A Program to check if strings are rotations of each other or not
//(eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)
#include<bits/stdc++.h>
using namespace std;
bool rotation(string s1,string s2){
    if(s1.length()!=s2.length()){
        return false;
    }
    string str=s1+s1;
    return (str.find(s2)!=string::npos);
}
int main(){
   string s1,s2;
   cin>>s1>>s2;
   if(rotation(s1,s2)){
       cout<<"Strings are rotations of each other";
   }
   else
     cout<<"Strings are  not rotations of each other";
     return 0;

}

