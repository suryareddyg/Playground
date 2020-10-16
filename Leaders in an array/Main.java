n=int(input())
for _ in range(n):
  x=int(input())
  a=list(map(int,input().split()))
  z=[]
  z.append(a[-1])
  i=x-2
  while(i>=0):
    if(a[i]>=z[-1]):
      z.append(a[i])
    i=i-1
    
  print(*z[::-1],end=" ")
  print()
  