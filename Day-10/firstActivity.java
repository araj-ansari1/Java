public class firstActivity{
	public static void main(String args[]){
		String[] countries={"India","Japan","England","Pakistan","Rassia","New Zealand"};
		
		for(int i=0; i<countries.length; i++){
			System.out.println(i+" ------- "+countries[i]);
		}
		System.out.println(" --------------- ");
		for(String value:countries){
			System.out.println(value);	
		}
	}
}