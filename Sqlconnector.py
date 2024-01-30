import mysql.connector

conn = mysql.connector.connect(
    host="localhost",
    database="mysql",
    user="root",
    password="Sanskriti" )

mycursor = conn.cursor()

mycursor.execute("SELECT * FROM student")

myresult = mycursor.fetchall()

for x in myresult:
  print(x)