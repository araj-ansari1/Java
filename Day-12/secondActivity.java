class A{



	// Return Type
		
	int calculate(int l, int b){  		//  Formal Parameter
		int area=l*b;
		return area;
	}
}
public class secondActivity{
	public static void main(String args[]){
		A obj =new A();

		System.out.println("Area: = "+obj.calculate(10,20)); 		// Actual Parameter
	}
}