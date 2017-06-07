package sheet13Pets;

public abstract class Pets {
 
	private String name;
	protected String breed;
	private int age;
	private String colour;
	private boolean isFemale;
	public static final boolean FEMALE = true;
	public static final boolean MALE = false;


	public Pets(){

	}
	public Pets(String name, String breed, int age, String colour, boolean isFemale) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isFemale = isFemale;


	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isFemale() {
		return isFemale;
	}
	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	public abstract String getTypeOfAnimal();
	@Override
	public String toString() {
		return "\nName: " + name +
				", Breed: " + breed + 
				", Age: " + age + 
				", Colour: " + colour + 
				", Gender: " + String.format(isFemale ? "female" : "male");
	}

}
//end superclass


class Snake extends Pets{
	public Snake(){

	}

	public Snake(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);

	}

	public String getTypeOfAnimal(){
		String type="";
		if(breed.equals("python"))
			type="nonvenomous snake";
			return type;
	}

	@Override
	public String toString() {
		return "Snake: " + super.toString()+
				", Type of animal: " + getTypeOfAnimal();
	}

}
class Cat extends Pets implements Mammal{
public void sleep(){
		
		System.out.println(getName()+" is sleeping");
	}
	public void eat(){
		System.out.println(getName()+" is eating");
		}
	private String microChipNumber;
	private boolean isMicroChipped;
	private int numOfLives;
	public static int numOfLivesCounter = 9;

	public Cat(){

	}
	public Cat(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);
	}
	public Cat(String name, String breed, int age, String colour, boolean isFemale, String microChipNumber, boolean isMicroChipped, int numOfLives) {
		super(name, breed, age, colour, isFemale);
		this.microChipNumber = microChipNumber;
		this.isMicroChipped = isMicroChipped;
		this.numOfLives = numOfLives;
	}
	public String getMicroChipNumber() {
		return microChipNumber;
	}
	public void setMicroChipNumber(String microChipNumber) {
		this.microChipNumber = microChipNumber;
	}
	public boolean isMicroChipped() {
		return isMicroChipped;
	}
	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}
	public int getNumOfLives() {
		return numOfLives;
	}
	public void setNumOfLives(int numOfLives) {
		this.numOfLives = numOfLives;
	}
	public void justLostALife(){
		numOfLives=numOfLivesCounter;
		numOfLivesCounter--;
	}
	public String getTypeOfAnimal(){
		String type="";
		if(breed.equals("burmese"))
		type="Feline";
		return type;
	}
	@Override
	public String toString() {
		return "Cat: " + super.toString() + 
				", Microchip Number: " + microChipNumber + 
				", Microchipped: " + String.format(isMicroChipped ? "yes" : "no") +
				", Type of animal: " + getTypeOfAnimal() + 
				", Number of Lives: "+ numOfLives;
	}


}
class Dog extends Pets implements Mammal{
	private String microChipNumber;
	private boolean isMicroChipped;
	public static final boolean IS_MICRO_CHIPPED = true;
	public static final boolean IS_NOT_MICRO_CHIPPED = false;
	
public void sleep(){
		
		System.out.println(getName()+" is sleeping");
	}
	public void eat(){
		System.out.println(getName()+ " is eating");
		}
	public Dog(){

	}

	public Dog(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);

	}

	public Dog(String name, String breed, int age, String colour, boolean isFemale, String microChipNumber) {
		super(name, breed, age, colour, isFemale);
		this.microChipNumber = microChipNumber;
	}

	public String getMicroChipNumber() {
		return microChipNumber;
	}

	public void setMicroChipNumber(String microChipNumber) {
		this.microChipNumber = microChipNumber;
	}

	public boolean isMicroChipped() {
		return isMicroChipped;
	}

	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}
	public String getTypeOfAnimal(){
		String type="";
		if(breed.equals("husky"))
			type= "Canine";
		else if (breed.equals("cocker"))
			type="Canine";
			return type;

	}
	@Override
	public String toString() {
		return "Dog: " + super.toString() +
				", Type of animal: " + getTypeOfAnimal() +
				", Microchip Number: " + microChipNumber;
	}

}
class Hamster extends Pets implements Mammal{
	public void sleep(){
		
		System.out.println(getName()+" is asleep");
	}
	public void eat(){
		System.out.println(getName()+" is eating");
		}
	public Hamster(){
	}

	public Hamster(String name, String breed, int age, String colour, boolean isFemale) {
		super(name, breed, age, colour, isFemale);

	}
	public String getTypeOfAnimal(){
		String type="";
		if(breed.equals("rat"))
			type="Rodent";
			return type;	
	}
	public String toString() {
		return "Hamster: " + super.toString() +
		", Type of animal: " + getTypeOfAnimal();
		
	}
}