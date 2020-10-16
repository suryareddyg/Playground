n=input()
c=0
for i in range(len(n)):
  if(n[i]!=n[-1]):
    c+=1
  else:
    break
print(c)