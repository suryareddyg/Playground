#include<bits/stdc++.h>
using namespace std;

int main() 
{
   long long int a,b,c;
  cin>>a>>b>>c;
   int d=pow(a,b);
    int x=pow(d%10,c);
  cout<<x%1000000007;
    return 0;
}