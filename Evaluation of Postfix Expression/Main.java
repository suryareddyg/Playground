#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int a;
  cin>>a;
  while(a--){
   string s;
  cin>>s;
    int x=s.length();
    stack<int> st;
    st.push(-100);
    for(int i=0;i<x;i++){
      if(isdigit(s[i])){
        st.push(s[i] - '0');
      }
         else
         {
            int c=st.top();
             st.pop();
            int d=st.top();
             st.pop();
             switch(s[i]){
               case '+':{
                 st.push(c+d);
                 break;
               }
                case '-':{
                 st.push(d-c);
                 break;
                }
                case '*':{
                 st.push(c*d);
                 break;
                }
                 case '/':{
                  st.push(d/c);
                  break;
                 }
             
           }
         }
    }
         cout<<st.top()<<"\n";
         }
}