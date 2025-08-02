List1=input("Enter numbers for list1").split(',')
List2=input("Enter numbers for list2").split(',')
List3=[]
for i in List1:
   if( int(i) % 2 == 0):
    List3.append(i)

for ii in List2:
  if(int(i) % 2 !=0):
    List3.append(ii)

print(List3)


