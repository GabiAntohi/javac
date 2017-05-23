package sheet6ArraysOfObjects;

public class Ex1Car {
	private String make;//private member variables, accessor methods
	private String model;
	private double engineSize;
	//static/class variables, one per class, once in memory
		public static int carCounter;//how many objects are created
		//increment the counter!!
		public Ex1Car() {
			carCounter++;
		} 
		

		public Ex1Car(String make, String model, double engineSize) {
	//no-args constructor, code for all objects, constructors can call each other using this(),
			this();   //must be first line Toyota
			//this.make=make; (just calls it, does not perform validation inside setMake)
			setMake(make);
			this.model = model;
			setEngineSize(engineSize);//calls method

		}
		
		
		 /* Getters and setters: accessors. Often a setter is accompanied by a getter 
	     * (also known as an accessor), which returns the value of the 
	     * private member variable.*/
		public void setMake(String make) {
			/* Perform any validation */
			switch (make) {
			case "Audi": 
			case "Toyota":
			case "Mitsubishi":
			case "Ford":
			case "Honda":
			case "Alpha Romeo":
			case "BMW":
			case "Mercedes":
			case "Volkswagen":
			case "Opel":
				this.make = make;
				break;
			default:
				System.out.println(make + " is not a valid make");
				break;
			}
		}

		public void setModel(String model) {
			this.model = model;
		}

		public void setEngineSize(double size) {
			if (size >= 1 && size <= 2.3)
				this.engineSize = size;
			else
				System.out.println(size + " is not a valid engine size");
		}

		
		
		
		public String getMake() {
			return make;
		}

		public String getModel() {
			return model;
		}

		public double getEngineSize() {
			return engineSize;
		}
		 /* The toString() method should return a String of all the member
			     * variable's values.  */

		public String toString() {
			return "\nMake: " + make + 
					"\nModel: "+ model; 
					//"\nEngine Size: " + engineSize;
		}
}
