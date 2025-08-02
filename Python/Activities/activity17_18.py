import pandas as pd
data = {
    "Username" : ["admin","Charles","Deku"],
    "Password" : ["password1","password2","password3"]
}
df=pd.DataFrame(data) #convert data to dataframe
df.to_csv("./sample.csv",index=False) #. before ./sample means current folder

input_data=pd.read_csv("./sample.csv")

#print entire data frame
#print(input_data)
#input_data["Permissions"]=["Read","Write","Read only"]
#input_data["Username"][0]="Admin"
new_row={"Username": "new_user","Passwords":"new_password"}
#input_data.append["Username"][0]="Admin"
#print only Usernames
print(input_data["Username"])
#print username and password of second row
print("==========Second row data========")
print(input_data["Username"][1],"|", input_data["Password"][1])
print("=========ascending order=========")
print(input_data["Username"].sort_values)
print("=========descending order=========")
#print(input_data["Password"].sort_values,ascending=False)