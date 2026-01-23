
class Room{


	// Instance
	int length;
	int breadth;



	//Constructor is used to initialize tha Object
	//Here tha term initialization means givin the relevent value to the variable of object


	Room(int l, int b){
		length=l;
		breadth=b;
	}



	//Instance Function
	
	int calculateAria(){
		return length*breadth;
	}
}



// Object is a real world whitch has identity charactristic and behavourj



public class firstActivity{
	public static void main(String args[]){
		

		Room obj=new Room(10,20);
		System.out.println("Lenght= "+obj.length);
		
		System.out.println("Bredth= "+obj.breadth);
		
		System.out.println("Aria= "+obj.calculateAria());

	}
}