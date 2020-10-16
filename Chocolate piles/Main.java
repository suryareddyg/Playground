from math  import *
c=int(input())
a=list(map(int,input().split()))
n=int(input())
a.sort()
x=-1
for i in range(n):
  a[x]=int(sqrt(a[x]))
  a.sort()
print(sum(a))

  
