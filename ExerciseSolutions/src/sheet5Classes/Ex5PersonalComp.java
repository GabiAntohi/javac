package sheet5Classes;

public class Ex5PersonalComp {
	private int memory;
	private int hard;
	private String system;
	private int monitorsize;
	private double cost;
	public static int numberCounter = 0;
	public static final int RAM_2_GB=2;
	public static final int RAM_4_GB=4;
	public static final int RAM_8_GB=8;

	public static final int HARD_125_GB=125;
	public static final int HARD_255_GB=255;
	public static final int HARD_500_GB=500;
	public static final int HARD_1_T=7;

	public static final int MONITOR_10_INCH=8;
	public static final int MONITOR_13_INCH=9;
	public static final int MONITOR_15_INCH=10;

	public  Ex5PersonalComp() {
		memory = RAM_2_GB;
		hard = HARD_125_GB;
		monitorsize= MONITOR_10_INCH;
		cost = 350;
		
		numberCounter++;

	} //how many people

	public Ex5PersonalComp(int memory, int hard, String system, int monitorsize, double cost) {
		this();  
		setMemory(memory);
		setHard(hard);//calls method!!!!!!!
		setSystem(system);
		setMonitorsize(monitorsize);
		calculateCost(cost);
	}
	public void setMemory(int memory) {
		if (memory==RAM_2_GB || memory==RAM_4_GB || memory==RAM_8_GB )
		this.memory = memory;
		else{System.out.println("not valid");}
	}
	public void setHard(int hard) {
		if (hard==HARD_125_GB || hard==HARD_255_GB || hard==HARD_500_GB || hard==HARD_1_T  )
		this.hard = hard;
		else{System.out.println("not valid");}
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public void setMonitorsize(int monitorsize) {
		switch (monitorsize){
		case MONITOR_10_INCH:
		case MONITOR_13_INCH:
		case MONITOR_15_INCH:
			this.monitorsize = monitorsize;
			break;
			default:
				System.out.println(("Invalid monitor size, setting to efault of 17\""));
				break;
		}
	
	}

	public void calculateCost(double cost) {

		if (memory==RAM_2_GB&&hard==HARD_125_GB&&monitorsize==MONITOR_10_INCH)cost=4425;
		else if(memory==RAM_2_GB&&hard==HARD_255_GB&&monitorsize==MONITOR_10_INCH)cost=4430;
		else if(memory==RAM_2_GB&&hard==HARD_500_GB&&monitorsize==MONITOR_10_INCH)cost=55435;
		else if(memory==RAM_2_GB&&hard==HARD_1_T&&monitorsize==MONITOR_10_INCH)cost=4440;

		else if (memory==RAM_4_GB&&hard==HARD_125_GB&&monitorsize==MONITOR_10_INCH)cost=4535;
		else if(memory==RAM_4_GB&&hard==HARD_255_GB&&monitorsize==MONITOR_10_INCH)cost=3340;
		else if(memory==RAM_4_GB&&hard==HARD_500_GB&&monitorsize==MONITOR_10_INCH)cost=4500;
		else if(memory==RAM_4_GB&&hard==HARD_1_T&&monitorsize==MONITOR_10_INCH)cost=2250;

		else if (memory==RAM_8_GB&&hard==HARD_125_GB&&monitorsize==MONITOR_10_INCH)cost=365;
		else if(memory==RAM_8_GB&&hard==HARD_255_GB&&monitorsize==MONITOR_10_INCH)cost=535;
		else if(memory==RAM_8_GB&&hard==HARD_500_GB&&monitorsize==MONITOR_10_INCH)cost=620;
		else if(memory==RAM_8_GB&&hard==HARD_1_T&&monitorsize==MONITOR_10_INCH)cost=780;

		else if (memory==RAM_8_GB&&hard==HARD_125_GB&&monitorsize==MONITOR_13_INCH)cost=395;
		else if(memory==RAM_8_GB&&hard==HARD_255_GB&&monitorsize==MONITOR_13_INCH)cost=505;
		else if(memory==RAM_8_GB&&hard==HARD_500_GB&&monitorsize==MONITOR_13_INCH)cost=200;
		else if(memory==RAM_8_GB&&hard==HARD_1_T&&monitorsize==MONITOR_13_INCH)cost=750;

		else if (memory==RAM_8_GB&&hard==HARD_125_GB&&monitorsize==MONITOR_15_INCH)cost=350;
		else if(memory==RAM_8_GB&&hard==HARD_255_GB&&monitorsize==MONITOR_15_INCH)cost=550;
		else if(memory==RAM_8_GB&&hard==HARD_500_GB&&monitorsize==MONITOR_15_INCH)cost=600;
		else if(memory==RAM_8_GB&&hard==HARD_1_T&&monitorsize==MONITOR_15_INCH)cost=700;

		else if (memory==RAM_4_GB&&hard==HARD_125_GB&&monitorsize==MONITOR_15_INCH)cost=350;
		else if(memory==RAM_4_GB&&hard==HARD_255_GB&&monitorsize==MONITOR_15_INCH)cost=550;
		else if(memory==RAM_4_GB&&hard==HARD_500_GB&&monitorsize==MONITOR_15_INCH)cost=500;
		else if(memory==RAM_4_GB&&hard==HARD_1_T&&monitorsize==MONITOR_15_INCH)cost=2000;

		else {System.out.println("no such thing");};
		this.cost = cost;			
	}
	public int getMemory() {
		return memory;
	}
	public int getHard() {
		return hard;
	}
	public String getSystem() {
		return system;
	}
	public int getMonitorSize() {
		return monitorsize;
	}
	public double getCost(){
		return cost;	
	}

	public String getMonitorSizeAsString() { 
		switch (monitorsize) {
		case MONITOR_10_INCH:
			return "10 inch Monitor";
		case MONITOR_13_INCH:
			return "13 inch Monitor";
		case MONITOR_15_INCH:
			return "15 inch Monitor";
		default:
			return "choose a DIFFERENT SIZE ";
		} 
	}

	public String toString() {
		return "\nMemory: " + memory + "Gb"+
				"\nHard Drive: "+ hard + "Gb"+
				"\nSystem: " + system +
				"\nSize of monitor: " + getMonitorSizeAsString() + 
				"\nCost €" + cost +
				"\nNumber of customers:" + numberCounter;
	}
}
