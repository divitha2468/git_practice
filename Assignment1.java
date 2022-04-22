import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
abstract class app
{
	public static void create() {
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter accoutnname :");
		int num=sc.nextInt();
		System.out.print("\n Enter IFSC :");
		String ifsc=sc.next();
		System.out.print("\n Enter name :");
		String name=sc.next();
		System.out.print("\n Enter phone number :");
		int phon=sc.nextInt();
		System.out.print("\n Enter balance :");
		int balance=sc.nextInt();
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Pass@123");
            PreparedStatement ps = con.prepareStatement("insert into bank values(?,?,?,?,?)");
            ps.setInt(1, num);
            ps.setString(2, ifsc);
            ps.setString(3, name);
            ps.setInt(4, phon);
            ps.setInt(5, balance);
            ps.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
	}
	public static void display()
	{
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Pass@123");
           Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from bank");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" :"+rs.getString(2)+" :"+rs.getString(3)+" :"+rs.getInt(4)+":"+rs.getInt(5));
            }
        } catch (Exception e) {
        		System.out.println(e);
        }
	}
	public static  void update()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter accout num of sender :");
		int number=sc.nextInt();
		System.out.print("\n Enter the account num of reciever :");
		int number2=sc.nextInt();
		System.out.print("\n Enter the ammount to be sent :");
		int amount=sc.nextInt();
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Pass@123");
            Statement stmt=con.createStatement();
//            PreparedStatement ps = con.prepareStatement("update emp set salary = ? where id = ?");
//            Scanner sc = new Scanner(System.in);
            PreparedStatement ps2 = con.prepareStatement("Select balance from bank where accountnum=?");
	           ps2.setInt(1, number);
	           ResultSet rs1=ps2.executeQuery();
            while(rs1.next())
	            {
	                System.out.println(rs1.getInt(1));
	            }
            int balance1=rs1.getInt(1)-amount;
            System.out.println(balance1);
            ResultSet rs2=stmt.executeQuery("Select balance from bank where accountnum="+number2);       
            int balance2=rs2.getInt(1)+amount;
            System.out.println(balance2);
            stmt.execute("update bank set balance = "+balance1+" where accountnum ="+number);
            stmt.execute("update bank set balance = "+balance2+" where accountnum ="+number2);
            System.out.println("update done");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }	
	}
	public static  void secondpage()
	
	{
		int ch2;
		do{
			System.out.println("--------------------------------");
			System.out.println("1.create account");
			System.out.println("2.balance");
			System.out.println("3.tranfer");
			System.out.println("4.Exit");
			System.out.println("--------------------------------");
			System.out.println("Enter your Choice: ");
			Scanner sc2=new Scanner(System.in);
			ch2=sc2.nextInt();
			switch(ch2){
				case 1:
					app.create();
					break;
				case 2:
					app.display();
					break;
				case 3:
					app.update();
					break;
				}
		}while(ch2!=4);
	}

}
public class Assignment1 {
	public static void main(String args[])
	{
		int ch1=0,ch2=0;
//		app e=new app();
		//Emp e[]=new Emp[100];
//		ArrayList<Emp> list=new ArrayList<Emp>();
		do{
		System.out.println("--------------------------------");
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("3.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);
		ch1=sc1.nextInt();
		if(ch1==2){

			Scanner sc=new Scanner(System.in);
			System.out.print("\n Enter firstname :");
			String n1=sc.next();
			System.out.print("\n Enter lastname :");
			String n2=sc.next();
			System.out.print("\n Enter phone number :");
			int ph=sc.nextInt();
			System.out.println(ph);
			System.out.print("\n Enter passowrd :");
			String password=sc.next();
			try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = null;
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Pass@123");
	            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?)");
	            ps.setString(1, n1);
	            ps.setString(2, n2);
	            ps.setInt(3, ph);
	            ps.setString(4, password);
	            ps.execute();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
			System.out.println("registration done");
			app.secondpage();
			
		}
		if(ch1==1)
		{
			
			System.out.println("login");
			Scanner sc=new Scanner(System.in);
			System.out.print("\n Enter firstname  :");
			String first=sc.next();
			System.out.print("\n Enter password :");
			String pass=sc.next();
			try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	           Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Pass@123");
//	           Statement stmt=con.createStatement();
	           PreparedStatement ps2 = con.prepareStatement("Select * from register where FirstName=? and password=?");
	           ps2.setString(1, first);
	           ps2.setString(2, pass);
	           ResultSet rs1=ps2.executeQuery();
	            if (rs1!=null)
	            {
	            	app.secondpage();
	            }
	           
	        } catch (Exception e) {
	        		System.out.println(e);
	        }
		}
		}while(ch1!=3);
		
	}
}
