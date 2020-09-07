arr=input().split()
count=0
for i in arr:
  
  if (i==i[::-1]):
    
    count+=1;
  else: pass
print(count)