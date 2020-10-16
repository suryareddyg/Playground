#include<bits/stdc++.h>
using namespace std;
string  balancedparenthesis(string s){
  stack<char> a;
  for(int i=0;i<s.length();i++){
    if(s[i]=='{' || s[i]=='[' || s[i]=='('){
      	a.push(s[i]);
    }
    else if(s[i]=='}'){
      if(!a.empty() &&'{'==a.top()){
              	a.pop();
            }
       else{
        	return "Not Balanced";
       }
    }
   else if(s[i]==']'){
      if(!a.empty() && '['==a.top()){
              	a.pop();
            }
       else{
        	return "Not Balanced";
       }
  }
 else if(s[i]==')'){
      if(!a.empty() &&'('==a.top()){
              	a.pop();
            }
       else{
        	return "Not Balanced";
       }
  }
    
  }
  return "Balanced";   
  }
int main()
{
  string s;
  cin>>s;
  cout<<balancedparenthesis(s);
}