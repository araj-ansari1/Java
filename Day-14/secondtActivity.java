class Room{
	public int length=10;
	
	int lengthAria(){
		return length;
	}
	
}
public class secondtActivity{
	public static void main(String args[]){
		Room obj=new Room();
		
		System.out.println("Length= "+obj.lengthAria());
	}
}