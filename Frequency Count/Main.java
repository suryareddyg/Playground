#include <bits/stdc++.h>
using namespace std;

int main() 
{
   string s;
  cin>>s;
  int a[26]={0};
  for(int i=0;i<s.length();i++){
    a[char(s[i]-'a')]++;
  }
  for(int i=0;i<26;i++){
    if(a[i]>0){
     cout<<char(97+i)<<a[i];
    }
  }
    return 0;
}