package question2;

public class Lion {
	
	String name;
	 boolean isHungry;
	 int age;
	
	static int totalDeaths;
	
	static void printKillings() {
		System.out.println("Total killings by lions in jungle = "+ totalDeaths);
	}
	
	 void thinking() {
		
		if(isHungry = false) {
			System.out.println(name + "is sleeping");
		}
		
		else if(isHungry = true && age>12) {
			totalDeaths += 2;
			System.out.println("Lion2 has eaten two animal");
		}
		
		else if(isHungry = true && age<=12 && age>=2 ) {
			totalDeaths += 1;
			System.out.println("Lion3 has eaten one animal");
		}
		
		else if(isHungry=true && age<2 ) {
			System.out.println("Lion4 is calling Mom");
		}
	}
	
	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.name = "Lion1";
		l1.isHungry = false;
		l1.age = 13;
		l1.thinking();
		
		Lion l2 = new Lion();
		l2.name = "Lion2";
		l2.isHungry =  true;
		l2.age = 2;
		l2.thinking();
		
		l2.printKillings();
	}
}
