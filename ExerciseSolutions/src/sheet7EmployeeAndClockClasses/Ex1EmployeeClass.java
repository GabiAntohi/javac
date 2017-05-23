package sheet7EmployeeAndClockClasses;

public class Ex1EmployeeClass {
private String name;
private int age;
private double salary;
private int noSickDays;
private int employeeNumber;

public static int employeeCounter;//counter
public Ex1EmployeeClass() {//constructors
	employeeCounter++;
	salary=32000;//default
} 
public Ex1EmployeeClass(String name){
	setName(name);	
}
public Ex1EmployeeClass(int age, int noSickDays, int employeeNumber){
	setAge(age);
	setNoSickDays(noSickDays);
	setEmployeeNumber(employeeNumber);
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void calculateSalary(double salary, int age, int noSickDays) {
	salary=32000;
	if  (age>=25&&age<=30)salary=(salary+salary*2/100);
	else if 
	
	
	
	
	
	
	
	
	
	this.salary = salary;
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
	return "name of employee=" + name + 
			"\nage=" + age +
			"\nsalary=" + salary +
			"\nnoSickDays=" + noSickDays +
			"\nemployeeNumber=" + employeeNumber +
			"\n getName()=" + getName() + 
			"\n getAge()=" + getAge()
			+ ", getSalary()=" + getSalary() +
			"\ngetNoSickDays()=" + getNoSickDays() + 
			"\n getEmployeeNumber()="+ getEmployeeNumber() + 
			"\n increaseSalary()=" + increaseSalary();
}

	
	
	
}
