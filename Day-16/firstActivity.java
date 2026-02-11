class A {
	void sayHello(){
		System.out.println("Hello..........Class A ");
	}
}
public class firstActivity{
	public static void main(String args[]){
		A obj=new A(){
			void sayHello(){
				System.out.println("Hello..........Again ");
			}
	
		};
		obj.sayHello();
		(new A(){
			void sayHello(){
				System.out.println("Hello......Doing Again..!!!");
			}
		}).sayHello();
	}
}
		