def checkexpo(n):
  c=0
  while(n!=0 and n%2==0):
    c+=1
    n=n/2
  return c
n=int(input())
m=int(input())
tem=-1
tem1=0
for i in range(n,m+1):
  x=checkexpo(i)
  if(x>tem):
    tem=x
    tem1=i
print(tem1)