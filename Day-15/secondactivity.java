class A{
	void sayHello(){
		System.out.println("Hello.........A ");
	}
}
class B extends A{
	void sayHello(){
		System.out.println("Hello..........B ");
	}
}
public class secondactivity{
	public static void main(String args[]){
		A obj=new A();
		obj.sayHello();
	}
}