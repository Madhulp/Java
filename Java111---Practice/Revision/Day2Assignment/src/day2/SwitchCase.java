package day2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String city = "Bangalore";
		
		switch (city) {
		case "Mumbai": 
			System.out.println("Financial city");
			break;
			
		case "Kokata" :
			System.out.println("City of Joy");
			break;
			
		case "Delhi" :
			System.out.println("Capital of the country");
			break;
			
		case "Bangalore" :
			System.out.println("Cyber city");
			break;
			
		default :
			System.out.println("May be other Indian City");

		}
	}
}
