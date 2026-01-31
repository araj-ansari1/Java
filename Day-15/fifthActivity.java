class A{
	void sayHello(){
		System.out.println("Hello......A ");
	}
}
class B extends A{
	void sayHello(){
		super.sayHello();
		System.out.println("Hello......B ");
	}
}
public class fifthActivity{
	public static void main(String args[]){
		A obj=new B();
		obj.sayHello();
	}
}