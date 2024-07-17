import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MavenPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int id;
		String name;
		int age;
		System.out.println("Enter the student id");
		id=sc.nextInt();
		System.out.println("Ener student name");
		name=sc.next();
		System.out.println("Enter student age");
		age=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/maventest","root","root");
			String query="insert into maventest.mavenpractice values(?,?,?)";
			PreparedStatement pt=con.prepareStatement(query);
			pt.setInt(1,id);
			pt.setString(2,name);
			pt.setInt(3, age);
			pt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
