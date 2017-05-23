package sheet5Classes;

public class Ex3Classes {
	private String name;
	private int number;
	private double cost;
	private int frequency;
	public static int membershipCounter = 100;
	public static final int ONEOFF=1;
	public static final int YEARLY=2;
	public static final int MONTHLY=3;

	
	public Ex3Classes() {
		number=membershipCounter;
		membershipCounter++;

	} //how many customers
	//constructor
	public Ex3Classes(String name, int frequency) {
		this();  
		setFrequency(frequency);
		setName(name);//calls method!!!!!!!
		setCost(cost);
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFrequency(int frequency) {
			this.frequency = frequency;

	}
	
	public void setCost(double cost) {
		if (frequency==ONEOFF)cost=25;
	else if (frequency==YEARLY)cost=200;
	else if (frequency==MONTHLY)cost=30;
	else frequency=MONTHLY;
			this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public double getCost() {
	return cost;
	}
	public int getFrequency() {
		return frequency;
	}
	 public String getFrequencyAsString() {
         
	        switch (frequency) {
	        case YEARLY:
	            return "yearly";
	        case ONEOFF:
	            return "oneoff";
	        case MONTHLY:
	            return "monthly";
	        default:
	            return "choose a type";
	        }
	 }
	//to print

	public String toString() {
		return "\nName: " + name +
				"\nCost: €"+ cost +
				"\nPeriod: " + getFrequencyAsString() +
				"\nMembership no:" + membershipCounter;
	}
}
