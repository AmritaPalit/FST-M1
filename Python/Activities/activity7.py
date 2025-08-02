#num1=input("Enter first number in list:")
#num2=input("Enter second number in list:")
#num3=input("Enter third number in list:")
#num4=input("Enter forth number in list:")
numlist=input("Enter the list of number").split(",")
#numlist=[num1,num2,num3,num4]
sum = 0
for i in numlist:
    sum= sum + int(i)
print(sum)