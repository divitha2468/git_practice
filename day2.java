import java.util.*;
// class A{
//     int id,age;
// 	String sal,desig;
//     A()
//     {
// 	Scanner sc=new Scanner(System.in);
// 	System.out.println("enter id :");
// 	id=sc.nextInt();
// 	System.out.println("enter age :");
// 	age=sc.nextInt();
// 	System.out.println("enter sal :");
// 	sal=sc.next();
// 	System.out.println("enter desig :");
// 	desig=sc.next();
// 	}
	
// 	void display()
// 	{
// 		System.out.println(id+"\n"+age+"\n"+sal+"\n"+desig);
// 	}
// }
// class B extends A{
//     B(){}
    
// }
// class C extends A{
//     C(){}
// }

// public class day2{
// 	public static void main(String args[]){
//         B b =new B();
//         b.display();
//         C c =new C();
//         c.display();
//     }
// }


//constructor overloading

class A{
    
    A()
    {
	System.out.println("normal A");
	}
	A(int a)
    {
	System.out.println("int A");
	}
    A(int a ,int b)
    {
	System.out.println("double int A");
	}
	
}

public class day2{
	public static void main(String args[]){
        A obj =new A(10);
        
        
    }
}