class A{
	int length=10;
	void sayHello(){
		System.out.println("Hello.....A  ");
	}
} 
class B extends A {
	int breadth=20;
	void sayHii(){
		System.out.println("Hello.......B  ");
	}
}
public class firstActivity{
	public static void main(String args[]){
		B obj=new B();
		
		System.out.println("Length= " + obj.length);
		System.out.println("Breadth= " +obj.breadth);

		obj.sayHello();
		obj.sayHii();

	}
}