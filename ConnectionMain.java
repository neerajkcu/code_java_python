// Java Program to Establish Connection in JDBC

// Importing database
import java.sql.*;
// Importing required classes
import java.util.*;

// Main class
class ConnectionMain {

	// Main driver method
	public static void main(String a[])
	{

		// Creating the connection using Oracle DB
		// Note: url syntax is standard, so do grasp
		String url = "jdbc:mysql://localhost:3306/mysql";

		// Username and password to access DB
		// Custom initialization
        String username = "root"; // MySQL credentials
		String password = "Sanskriti";

		// Entering the data
		Scanner k = new Scanner(System.in);

		System.out.println("Enter NAME");
		String name = k.next();

		System.out.println("ENTER ID");
		int id = k.nextInt();

		System.out.println("ENTER AGE");
		String age = k.next();

        System.out.println("ENTER ADDRESS");
		String address = k.next();

        System.out.println("ENTER COURSE");
		String course = k.next();

        System.out.println("ENTER FEE");
		String fee = k.next();

		// Inserting data using SQL query
		String sql = "insert into student values('" + name
					+ "'," + id + "," + age + ",'" + address + "','" + course + "' ," + fee +" )";
           //         String sql = "insert into student1 values('" + name
           //         + "'," + roll + ",'" + cls + "')";Mm

		// Connection class object
		Connection con = null;

		// Try block to check for exceptions
		try {

			// Registering drivers
		
                Class.forName(
                    "com.mysql.cj.jdbc.Driver"); // Driver name
                 con = DriverManager.getConnection(
                    url, username, password);
			// Reference to connection interface
		

			// Creating a statement
			Statement st = con.createStatement();

			// Executing query
			int m = st.executeUpdate(sql);
			if (m == 1)
				System.out.println(
					"inserted successfully : " + sql);
			else
				System.out.println("insertion failed");

			// Closing the connections
			con.close();
		}

		// Catch block to handle exceptions
		catch (Exception ex) {
			// Display message when exceptions occurs
			System.err.println(ex);
		}
	}
}
