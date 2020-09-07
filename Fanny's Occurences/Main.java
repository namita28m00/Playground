str=input()
char=input()
for i in str:
  if(i==char):
    str=str.replace(i,"")
print(str)