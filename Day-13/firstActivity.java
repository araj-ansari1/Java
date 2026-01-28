

// Class-----------------Object

// Obeject Creation = (1) class is loaded into jvm + (2) constructor excuted




class Room{

	Room(){
		System.out.println("Room............");
	}
	static{
		System.out.println("Static Initialization Block Executed.....");
	}
}

public class firstActivity{
	public static void main(String args[]){

		Room obj=new Room();
	}
}