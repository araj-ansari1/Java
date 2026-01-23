// Intropection of a class 
// Class Vairable is stored as single copy in a class 
// So this copy can be accessed through object & class






class Room{


	//Intance Variable
	int length=10;


	// Class Vairable
	static int breadth=20;
}
public class thirdActivity{

	public static void main(String args[]){

		Room obj=new Room();
	
		System.out.println("Length= "+obj.length);
		
		System.out.println("Through class Name:: "+Room.breadth);
		
		System.out.println("Through Obejct:: "+obj.breadth);
	}
}