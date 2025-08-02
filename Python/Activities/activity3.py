user_name1=input("Enter the name of user1")
user_name2=input("Enter the name of user2")

user_input1=input(user_name1+"what do you want to choose, Rock,paper or scissor").lower
user_input2=input(user_name2+"what do you want to choose, Rock,paper or scissor").lower

if user_input1=='rock':
    if user_input2=='paper':
        print("paper wins")
        
if user_input1=='paper':
    if user_input2=='scissor':
        print("Scissor wins")

if user_input1=='rock':
     if user_input2=='scissor':
        print("rock wins")


else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")

