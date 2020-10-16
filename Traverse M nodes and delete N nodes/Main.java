#include <iostream>
using namespace std;
struct node{
  int data;
  struct node *next;
};

int main() 
{
   struct node *head=(struct node*)malloc(sizeof(struct node));
   struct node *temp=(struct node*)malloc(sizeof(struct node));
   int a,i,d,m,n;
   scanf("%d%d%d",&a,&m,&n);
    for(i=0;i<a;i++){
      if(i==0){
        scanf("%d",&d);
      	head->data=d;
      	head->next=NULL;
      	temp=head;
      }
      else{
          scanf("%d",&d);
           temp->next=(struct node*)malloc(sizeof(struct node));
        	temp=temp->next;
            temp->data=d;
          }
     }
   struct node *prev,*current,*del;
  current=head;
  prev=current;
  while(current!=NULL){
    for(i=0;i<m;i++){
      if(current==NULL)
        	break;
      printf("%d ",current->data);
      prev=current;
      current=current->next;
    }
     if(current==NULL)
        	break;
    for(i=0;i<n;i++){
       if(current==NULL)
        	break;
      current=current->next;
    }
    prev=current;
}
}
  