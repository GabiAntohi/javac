package sheet11Inheritance;

import java.time.LocalDate;
import java.time.temporal.ChronoField;


public abstract class Employee {
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public Employee(){

	}
	public Employee(String firstName, String lastName, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public abstract double getEarnings();
	@Override
	public String toString() {
		return "\nFirst Name: " + firstName + 
				"\nLast Name: " + lastName +
				"\nEarnings: "  + getEarnings()+
				"\nDate of Birth: " + String.format("%d/%02d/%d", 
						dateOfBirth.get(ChronoField.DAY_OF_MONTH),
						dateOfBirth.get(ChronoField.MONTH_OF_YEAR),
						dateOfBirth.get(ChronoField.YEAR)
						);
	}
}
final class Boss extends Employee{
	private double salary;
	private double weeklySalary;

	public Boss() {

	}

	public Boss(String firstName, String lastName, LocalDate dateOfBirth, double weeklySalary ) {
		super(firstName, lastName, dateOfBirth);	
        this.weeklySalary = weeklySalary;
	}

	public void setWeeklySalary(){

	}
	public double getWeeklySalary(){
		return weeklySalary;

	}
	public double getEarnings(){
		salary=weeklySalary*52;
		return salary;
	}

	@Override
	public String toString() {
		return "BOSS " +super.toString() + "\nYearly Salary: " +  salary + "\nWeekly Salary: " + weeklySalary;
	}

}

final class CommissionWorker extends Employee{
	private double commission;
	private int quantity;
	private double salary;
	
	public CommissionWorker() {	
	}

	public CommissionWorker( String firstName, String lastName, LocalDate dateOfBirth, int quantity, double commission, double salary) {
		super(firstName, lastName, dateOfBirth);
		setQuantity(quantity);	
		this.commission=commission;
		this.salary=salary;
	}

	public double getSalary() {	
		return salary;
	}

	public void setSalary(double salary) {	
		this.salary = salary;
	}

	public int getQuantity() {	
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity>0)
			this.quantity = quantity;
		else{System.out.println("invalid quantity");}
	}

	public void setCommission(double commission) {
		this.commission=commission;
		
	}
	
	public double getCommission() {
		return commission;
	}

	public double getEarnings(){
		//flat base salary + percentage of sales
		return salary=commission*quantity;
	}

	@Override
	public String toString() {
		return "Commission Worker " +super.toString() + 
				"\nNumber of items sold: " + quantity + 
				"\nCommission: "+  commission;
	}
}

final class PieceWorker extends Employee {
	private double wagePerPiece;
	private int quantity;
	private double wage;
	public PieceWorker() {

	}
	public PieceWorker(String firstName, String lastName, LocalDate dateOfBirth, int quantity, double wagePerPiece  ) {
		super(firstName, lastName, dateOfBirth);
		setQuantity(quantity);
		this.wagePerPiece=wagePerPiece;
	}

	public double getWagePerPiece() {
		return wagePerPiece;
	}
	public void setWagePerPiece(double wagePerPiece) {
		this.wagePerPiece = wagePerPiece;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity>0)
			this.quantity = quantity;
		else{System.out.println("invalid quantity");}
	}
	public double getEarnings(){
		//paid by no of pieces produced
		wage=wagePerPiece*quantity;
		return wage;
	}
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public String toString() {
		return "Piece Worker " +super.toString() + 
				"\nNumber of Items produced: " + quantity;
	}

}


final class HourlyWorker extends Employee {
	private int hours;
	private double wage;
	private double earnings;

	public HourlyWorker() {

	}
	public HourlyWorker(String firstName, String lastName, LocalDate dateOfBirth, int hours, double wage ) {
		super(firstName, lastName, dateOfBirth);
		setHours(hours);
		this.wage=wage;
	}

	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if(hours>0)
			this.hours = hours;
		else{System.out.println("invalid hours");}
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getEarnings(){
		//by hour + overtime
	 if (hours>40)
			earnings=(wage*40 + (wage*(hours-40)*3/2));
		else earnings=wage*hours;
		return earnings;
	}

	public String toString() {
		return "Hourly Worker " +super.toString() + 
				"\nHours Worked: " + hours;
	}
}