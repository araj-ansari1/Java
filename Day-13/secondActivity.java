

// Class-----------------Object

// Obeject Creation = (1) class is loaded into jvm + (2) constructor excuted




class Room{

	Room(){
		System.out.println("Room............");
		System.out.println("...................");
	}
	static{
		System.out.println("Static Initialization Block Executed.....");
	}


	{
		System.out.println("Instance Initilization Block.....");
	}

}

public class secondActivity{
	public static void main(String args[]){

		Room obj=new Room();
		Room obj1=new Room();
		Room obj2=new Room();
		Room obj3=new Room();
		Room obj4=new Room();

	}
}