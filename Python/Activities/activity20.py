import pandas as pd
from pandas import ExcelWriter
data={
    'FirstName' : ["Satvik","Neha","Rohan"],
    'LastName' : ["Khan","Palit","Chopra"],
    'Email':["abc@gmail.com","def@gmail.com","rft@gmail.com"],
    'Phonenumber' : ["43536373","35474847","64673484"]

}
#Convert the dataset into Dataframe
df=pd.DataFrame(data)
#create an excel writer object
writer=ExcelWriter("./sample.xlsx")
#Write the Dataframe to an excel file
df.to_excel(writer,sheet_name='Sheet1',index=False)
writer.close() #close the writer
