#include <iostream>
using namespace std;

int main() 
{
  string s;
  cin>>s;
   int n=s.length();
   for(int i=0;i<n;i++){
     for(int j=0;j<n;j++){
       	if(i==j){
          cout<<s[i];
        }
       	else if(j==n-i-1){
          	cout<<s[j];
        }
        else
          	cout<<" ";
     }
     cout<<"\n";
   }
       	
    return 0;
}