class A{
	void sayHello(){
		System.out.println("Hello.....A ");
	}
}
//Overrinding through anonymous
public class sixActivity{
	public static void main(String args[]){
		A obj=new B(){
			void sayHello(){
				System.out.println("Hello.....Try Agains....");
			}
		};
		obj.sayHello();
	}
}