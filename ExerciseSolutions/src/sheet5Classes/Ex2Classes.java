package sheet5Classes;

public class Ex2Classes {
	private String breed;
	private String colour;
	private String ownerName;

	public static int dogCounter;
	public Ex2Classes() {
		dogCounter++;
	} //how many dogs

	public Ex2Classes(String breed, String colour, String ownerName) {

		this();  
		setBreed(breed);

		this.colour = colour;
		setOwnerName(ownerName);//calls method

	}

	public void setBreed(String breed) {
		switch (breed) {
		case "dog1": 
		case "dog2":
		case "dog3":
		case "dog4":
		case "dog5":
		case "dog6":
		case "dog7":
		case "dog8":
		case "dog9":
		case "dog10":
			this.breed = breed;
			break;
		default:
			System.out.println(breed + " is not a valid make");
			break;
		}

	}
	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	
	
	
	public String getBreed() {
		return breed;
	}

	public String getColour() {
		return colour;
	}

	public String getOwnerName() {
		return ownerName;
	}
	
	//to print
	public String toString() {
		return "\nBreed: " + breed + 
				"\nColor: "+ colour +
				"\nOwner Name: " + ownerName;
	}
}
