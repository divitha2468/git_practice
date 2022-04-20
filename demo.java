import java.util.*;

class manager
	{
	int id,age;
	String s,desig;
	void create{
	desig="manager";
	s="1,00,000";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id :");
	id=sc.nextInt();
	System.out.println("enter age :");
	age=sc.nextInt();
	}
	
	void display()
	{
		System.out.println(id+age+s+desig);
	}
}
	
class developer{
	{
	int id,age;
	String s,desig;
	void create()
	{
	desig="developer";
	s="50000";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id :");
	id=sc.nextInt();
	System.out.println("enter age :");
	age=sc.nextInt();
	}
	void display()
	{
		System.out.println(id+age+s+desig);
	}
}
class tester
	{
	int id,age;
	String s,desig;
	void create{
	String desig="tester";
	String s="40000";
	int id,age;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id :");
	id=sc.nextInt();
	System.out.println("enter age :");
	age=sc.nextInt();
	
	}
	void display()
	{
		System.out.println(id+age+s+desig);
	}
}
class demo
{
	public static void main(String args[])
	{
		System.out.println("1.create \n 2.display \n 3.raise sal \n 4.exit");
		Scanner sc=new Scanner(System.in);
		int fin,sin;
		fin=sc.nextInt();
		manager m=new manager();
		dev d=new dev();
		tester t=new tester();
		
		if (fin==1)
		{
			System.out.println("1.manager \n 2.developer \n 3.tester \n 4.exit");
			sin=sc.nextInt();
			if(sin==1)
			{
			m.create();
			
			}
			else if(sin==2)
			{
			d.create();
			}
			else if(sin==3)
			{
			t.tester();
			}
			else if(sin==4)
			{
			System.exit(0);
			}
		}
		if (fin==2){
			m.display()
		}
	}
}