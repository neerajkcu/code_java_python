import mysql.connector
mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="Sanskriti",
  database="mysql"
)
 
mycursor = mydb.cursor()
 
# sql = "INSERT INTO editorial (name, email) VALUES (%s, %s)"
sql = "INSERT INTO STUDENT ( NAME,ID, AGE,ADDRESS,COURSE,FEE) VALUES (%s,%s,%s,%s,%s,%s)";
val = ("NAKUL", "81" , "17", "DELHI", "BTESH", "12000")
mycursor.execute(sql, val)
mydb.commit()
print(mycursor.rowcount, "record inserted.")