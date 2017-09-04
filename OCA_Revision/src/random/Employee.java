package random;


interface HR{
	void printPaySlips();
}


public abstract class Employee {
void clockIn(){}
void clockOut(){}
	
	public static void main(String[] args) {
		//Employee e = new Employee(); an abstract class cannot be instantiated
		Employee p = new Programmer();
		//Employee c = new Consultant(); not a child of Employee
		HR a = new Administrator();
		//HR p1 = new Programmer(); programmer does not implement HR
		HR c1 = new Consultant();
	//	Adminstrator a1 = new Programmer(); do not know of eachother
		Programmer p2 = new Programmer();

		p.clockIn();
		//p.writeCode(); employee reference
		//a.clockIn(); HR reference
		a.printPaySlips();
		//c.printPaySlips(); did not compile above
		//c.clockOut(); not in same hierarchy
		
		((Administrator)a).clockIn();
		//((Employee)p2).writeCode();//becomes an employee, the method writeCode() is no longer available
		((Programmer)p).writeCode();
		//((HR)p2).printPaySlips(); does not implement HR
		((HR)a).printPaySlips();
		((Employee)p2).clockOut(); 
		
		
		
	}

}


class Programmer extends Employee{
void writeCode(){}		
}

class Administrator extends Employee implements HR{
	public void printPaySlips(){}
	void printReports(){}
}


class Consultant implements HR{
	public void printPaySlips(){}

}