class Room{
	int length;
	int breadth;
	
	Room(int l, int b){
		length=l;
		breadth=b;
	}
	int calculateAria(){
		return length*breadth;
	}
}
public class secondActivity{
	public static void main(String args[]){	

		Room obj =new Room(50,10);
	
		System.out.println("Length= "+obj.length);
		System.out.println("Breadth= "+obj.breadth);
		
		System.out.println("Aria= "+obj.calculateAria());
	}
}