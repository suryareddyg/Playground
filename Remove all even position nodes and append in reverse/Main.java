#include <iostream>
using namespace std;
struct node{
  int data;
  struct node *next;
};
void printlistinreverse(struct node *y){
  	if(y==NULL){
      return;
    }
  printlistinreverse(y->next);
  cout<<y->data<<" ";
}
int main() 
{
   int n,d;
  cin>>n;
  struct node *temp,*head;
  if(n==1){
    cin>>d;
    cout<<d;
}
  else{
  for(int i=1;i<=n;i++)
  {
    cin>>d;
    if(i%2!=0){
      cout<<d<<" ";
    }
    else if(i==2){
      head=(struct node *)malloc(sizeof(struct node ));
      head->data=d;
      head->next=NULL;
      temp=head;
    }
    else{
      temp->next=(struct node *)malloc(sizeof(struct node ));
      temp=temp->next;
      temp->data=d;
      temp->next=NULL;
    }
  }  printlistinreverse(head);
  }
}