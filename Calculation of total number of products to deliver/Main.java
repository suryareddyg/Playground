#include <iostream>
using namespace std;
int sumofdigits(int n){
  int sum=0;
  while(n>0){
    sum+=n%10;
    n=n/10;
  }
  return sum;
}
int main() 
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];
  cout << sumofdigits(a[i])<<" ";
  }
    return 0;
}