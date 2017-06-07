package sheet14Trainees;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Trainee {
	private String name;
	private LocalDate dateOfBirth;
	private String ppsNumber;
	
	public Trainee(){
		
	}
	public Trainee(String name, LocalDate dateOfBirth, String ppsNumber) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.ppsNumber = ppsNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPpsNumber() {
		return ppsNumber;
	}
	public void setPpsNumber(String ppsNumber) {
		this.ppsNumber = ppsNumber;
	}
	@Override
	public String toString() {
		return "\nName: " + name + 
				"\nPPS Number: " + ppsNumber +
				"\nDate of Birth: " + String.format("%d/%02d/%d", 
						dateOfBirth.get(ChronoField.DAY_OF_MONTH),
						dateOfBirth.get(ChronoField.MONTH_OF_YEAR),
						dateOfBirth.get(ChronoField.YEAR)
						);
	}
	
	
}
class Electrician extends Trainee implements Apprentice{
	private int phase;
	private String employersName;
	public Electrician() {
		super();
		}

	public Electrician(String name, LocalDate dateOfBirth, String ppsNumber, int phase, String employersName) {
		super(name, dateOfBirth, ppsNumber);
		setPhase(phase);
		this.employersName = employersName;	
	}

	public String getEmployersName() {
		return employersName;
	}

	public void setEmployersName(String employersName) {
		this.employersName = employersName;
	}
	
	public void setPhase(int phase){
		if (phase==Apprentice.PHASE_ONE||phase==PHASE_TWO||phase==PHASE_THREE||phase==PHASE_FOUR||phase==PHASE_FIVE||phase==PHASE_SIX)
			this.phase = phase;	
			else System.out.println("Invalid phase");
	}
	public int getPhase(){
		return phase;
	}

	@Override
	public String toString() {
		return "Electrician: "+ super.toString()+
			"\nPhase: " + phase+
			"\nName of manager: "+ employersName;
	}
		
}
class Carpenter extends Trainee implements Apprentice{
	int phase;
	private String employersName;
	public Carpenter() {
		super();
	}

	public Carpenter(String name, LocalDate dateOfBirth, String ppsNumber, int phase, String employersName) {
		super(name, dateOfBirth, ppsNumber);
		setPhase(phase);
		this.employersName = employersName;
	}

	public void setEmployersName(String name){}
	public String getEmployersName(){
		return employersName;
	}
	public void setPhase(int phase){
		if (phase==PHASE_ONE||phase==PHASE_TWO||phase==PHASE_THREE||phase==PHASE_FOUR||phase==PHASE_FIVE||phase==PHASE_SIX)
		this.phase = phase;	
		else System.out.println("Invalid phase");
		
	}
	public int getPhase(){
		return phase;
	}
	@Override
	public String toString() {
		return "Carpenter: " + super.toString() + 
				"\nPhase: " + phase+
				"\nName of manager: "+ employersName;
	}
}
class ComputerAidedDesign extends Trainee{



	public ComputerAidedDesign() {
		super();
		
	}

	public ComputerAidedDesign(String name, LocalDate dateOfBirth, String ppsNumber) {
		super(name, dateOfBirth, ppsNumber);
		
	}

	@Override
	public String toString() {
		return "Computer Aided Design: " + super.toString();
	}
	
	
}
class SoftwareDeveloper extends Trainee{

	public SoftwareDeveloper() {
		super();
	
	}

	public SoftwareDeveloper(String name, LocalDate dateOfBirth, String ppsNumber) {
		super(name, dateOfBirth, ppsNumber);
	
	}

	@Override
	public String toString() {
		return "Software Developer: "+  super.toString();
	}
	
	
	
}


