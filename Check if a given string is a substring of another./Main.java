def stringmat(a,b):
  for i in range(len(a)):
    x=a[i:i+len(b):]
    if(x==b):
      return 1 
  return 0
n=int(input())
for _ in range(n):
  a,b=map(str,input().split())
  c=stringmat(a,b)
  if(c==1):
    print("Yes")
  else:
    print("No")