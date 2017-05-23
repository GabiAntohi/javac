package sheet5Classes;

public class MainForEx2Classes {

	public static void main(String[] args) {
		Ex2Classes ex2 = new Ex2Classes();
		ex2.setBreed("dog2");
		ex2.setColour("green");
		ex2.setOwnerName("john");
		System.out.println("Breed : " + ex2.getBreed());
		System.out.println("Color: " + ex2.getColour());
		System.out.println("Owner Name: " + ex2.getOwnerName());

		System.out.println("-------------------------");

		Ex2Classes ex3 = new Ex2Classes("dog3", "beige", "daniel");
		System.out.println(ex3);  // c3.toString()

		Ex2Classes ex4 = new Ex2Classes("dog4", "red", "jane");
		System.out.println(ex4);  // c4.toString()

		Ex2Classes ex5 = new Ex2Classes("dog11", "black", "jenny");
		System.out.println(ex5);  // c5.toString()
		
		System.out.println("number of dogs: " + 
				Ex2Classes.dogCounter);
	}

}
