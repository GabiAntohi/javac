package sheet5Classes;

public class MainForEx1Classes {


	public static void main(String[] args) {

		Ex1Classes c1 = new Ex1Classes();
		/*
		 *              make = "Ford"
		 *      c1 -->   model = "Focus"
		 *              engineSize = 1.4
		 */
		c1.setMake("Ford");
		c1.setModel("Focus");
		c1.setEngineSize(1.4);

		System.out.println("Make : " + c1.getMake());
		System.out.println("Model: " + c1.getModel());
		System.out.println("Engine size: " + c1.getEngineSize());

		System.out.println("-------------------------");

		Ex1Classes c2 = new Ex1Classes("Audi", "A4", 2.0);
		System.out.println(c2);  // c2.toString()


		System.out.println("Number of car objects created: " + 
				Ex1Classes.carCounter);
	}

}
