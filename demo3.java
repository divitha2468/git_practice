class A{
int a=100;
int b=200;
void aclass()
{
System.out.println("Aclass");
}
}
class B extends A{
int a=10;
int c=300;
void bclass(int a){
System.out.println("hi"+(a+b));
System.out.println("hi"+(this.a+b));
System.out.println("hi"+(super.a+b));
}
}
public class demo3{
	public static void main(String args[]){
 B b =new B();
 b.bclass(1000);
}
}