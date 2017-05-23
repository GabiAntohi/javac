package sheet6ArraysOfObjects;


public class MainForEx1Car {
int i=0;
	
		public static void main(String[] args) {

			Ex1Car c1 = new Ex1Car();
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

			Ex1Car c2 = new Ex1Car("Audi", "A4", 2.0);
			System.out.println(c2);  // c2.toString()
			Ex1Car c3 = new Ex1Car("Toyota", "A4", 2.0);
			System.out.println(c3);  

			Ex1Car c4 = new Ex1Car("Mercedes", "A4", 2.0);
			System.out.println(c4);  
			
			Ex1Car c5 = new Ex1Car("Toyota", "A4", 2.0);
			System.out.println(c5);  // c2.toString()
			Ex1Car c6 = new Ex1Car("Opel", "A4", 2.0);
			System.out.println(c6);  // c2.toString()


			System.out.println("Number of car objects created: " + 
					Ex1Car.carCounter);
			System.out.println("-------------------------");
			System.out.println("-------------------------");
			
			
			
			Ex1Car [] allCars = {c1, c2, c3, c4, c5, c6 };	
	         printEx1CarArray(allCars);
		}

	
		public static void printEx1CarArray( Ex1Car [] arrayOfCars){
			for(Ex1Car onecar:arrayOfCars)
				System.out.println(onecar.getMake() +"\t\t"+ onecar.getModel());

		
		}
		
}
