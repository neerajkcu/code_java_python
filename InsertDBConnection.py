import mysql.connector
mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="Sanskriti",
  database="mysql"
)
 # INSERT INTO STUDENT ( NAME,ID, AGE,ADDRESS,COURSE,FEE) VALUES ("Nikhilesh",1,28,"DELHI","BTECH",12000);
mycursor = mydb.cursor()

name = str(input("Enter the NAME\n"))
id = int(input("Enter the ID\n"))

age= int(input("Enter the AGE\n"))
address = str(input("Enter the ADDRESS\n"))
course = str(input("Enter the COURSE\n"))
fee = int(input("Enter the FEE\n"))
values = (name,id,age,address,course,fee)
sqlQuery = "INSERT INTO STUDENT VALUES (%s,%s,%s,%s,%s,%s)"
cursor = mydb.cursor()

cursor.execute(sqlQuery, values)
mydb.commit()

cursor.close()
mydb.close()
print('inserted in db')


#if a == 1:
 # print ("Success")
#else:
  
  #print  ("Fail")