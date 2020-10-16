#include <bits/stdc++.h>
using namespace std;

int main() 
{
   string s1,s2;
  cin>>s1>>s2;
    int i=0,j=0;
  for(i=0;i<s1.length();i++){
     if(s1[i]==s2[j])
     {	j++;
     }
    else{
      cout<<s1[i];
    }
  }
  if(s1==s2){
    cout<<"NA";
  }
    return 0;
}