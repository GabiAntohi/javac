package sheet7EmployeeAndClockClasses;

public class Ex1EmployeeClass {
	private String name;
	private int age;
	private double salary;
	private int noSickDays;
	private int employeeNumber;


	public static int employeeCounter = 10;//counter
	public Ex1EmployeeClass() {//constructors
		salary=32000;
		age=27;
		noSickDays=0;
		//default
		employeeCounter++;
	} 

	public Ex1EmployeeClass(String name, int age, int noSickDays){
		this();
		setName(name);
		setAge(age);
		setNoSickDays(noSickDays);
	
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if (age>=18&&age<=67)
	     this.age=age;
		else {System.out.println("not valid age");}
	}
	public int getAge() {
		return age;
	}
	

	public double calculateSalary() {
		salary=32000;
		if(age>=18&&age<25)salary=32000;
		else if  (age>=25&&age<=30)salary=(salary+salary*7/100);
		else if (age>30&&age<=40)salary=(salary+salary*15/100);
		else if (age>40&&age<=67)salary=(salary+salary*35/100);
		else {salary=salary-2000;}
		salary=salary-(noSickDays*(salary/260));
		return salary;
	
	}
	public int getNoSickDays() {
		return noSickDays;
	}
	public void setNoSickDays(int noSickDays) {
		this.noSickDays = noSickDays;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public double increaseSalary(){
		double increasedSalary=(salary+(salary*8/100));	
		return increasedSalary;
	}

	@Override
	public String toString() {
		return "Name of employee: " + name + 
				"\nAge: " + age +
				String.format("\nSalary:%.2f ",  calculateSalary()) + 
				"\nSick Days: " + noSickDays +
				String.format("\nIncreased Salary:%.2f  ", increaseSalary()) +
				"\nHow many employees: " + employeeCounter + "\n";
	}




}
