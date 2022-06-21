package employee_pack1;
import java.sql.*;
/*import java.sql.Connection;
 import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;*/
import java.util.Scanner;

public class Employee

 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your requirement:");
		int value=scan.nextInt();
		switch(value) {
		case 1:
			view_employee();
			break;
		case 2:
			insert();
			break;
		case 3:
			read();
			break;
		case 4:
			update();
			break;
		case 5:
			delete();
			break;
			
		default:
				System.out.println("Select the Correct Option...");
		}
	
		scan.close();
	}

	private static void view_employee() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moni","root","*");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee_report");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
			}
			}
		catch(Exception e) {System.out.println(e.toString());
		}
		
		
	}

	private static void insert() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moni","root","*");
			Statement st=con.createStatement();
			int rs=st.executeUpdate("insert into employee_report values(.....)");
			if(rs==0) {System.out.println("DATA IS NOT INSERTED");}
			else {System.out.println("DATA IS INSERTED");}
			}
	
		catch(Exception e) {System.out.println(e.toString());
		}
		
	}

	private static void read() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moni","root","*");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee_report");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
			}
			}
		catch(Exception e) {System.out.println(e.toString());
		}
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moni","root","MoniBabu619#");
			Statement st=con.createStatement();
			int rs=st.executeUpdate("update employee_report set experience=15 where designation='trainer' ");
			if(rs==0) {System.out.println("DATA IS NOT UPDATED");}
			else {System.out.println("DATA IS UPDATED");}
			}
		catch(Exception e) {System.out.println(e.toString());
		}
		
	}

	private static void delete() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moni","root","*");
			Statement st=con.createStatement();
			int rs=st.executeUpdate("delete from employee_report where..... ");
			if(rs==0) {System.out.println("DATA IS NOT DELETED");}
			else {System.out.println("DATA IS DELETED");}}
		catch(Exception e) {System.out.println(e.toString());
		}
		
		}}

