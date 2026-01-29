class A{
	int length=10;
	void sayHello(){
		System.out.println("Hello..........");
	}
}
class B extends A{
	
}
public class thirdAcrivity{
	public static void main(String args[]){
		B obj=new B();
		System.out.println("Length= "+obj.length);
	
		obj.sayHello();
	}
}