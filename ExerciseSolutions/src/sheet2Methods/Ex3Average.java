package sheet2Methods;
public class Ex3Average{
    public static void main(String [] args){
	Ex3Average m = new Ex3Average();
	
	m.getAverage(2.1,3.2,5);
	m.getTotal(5.8,7.6,2);
	m.calculateVolume(5.8,7.6,2.5);
	m.printMonthlySalary(50000);
	m.printWeeklySalary(38000);
	m.salaryAfterPayRise(40000,7.1);
	int yearlySalary = 80000;
	m.printMonthlySalary(yearlySalary);
	m.printWeeklySalary(yearlySalary);
	m.salaryAfterPayRise(yearlySalary,4);
	m.salaryAfterPayRise(yearlySalary,6);
	
}

	public void getAverage(double a, double b, int c){
	System.out.printf("The average of a,b and c is %f\n", (a+b+c)/3);
	}
	public void getTotal(double a, double b, int c){
	System.out.printf("The total of a,b and c is %f\n", (a + b + c));
	}
	//volume
	public void calculateVolume(double depth, double width, double breadth){
	double volume = depth*width*breadth;
	System.out.printf("Having a depth of %.2f, a width of %.2f and a breadth of %.2f gives you a volume of %.2f:\n",depth, width, breadth, volume);
	}
	//salary
	public void printMonthlySalary(int yearlySalary){
	double monthlySalary = yearlySalary/12;
	System.out.printf("a Yearly salary of %d means a monthly salary of %.2f\n", yearlySalary, monthlySalary);
	}
	public void printWeeklySalary(int yearlySalary){
	double weeklySalary = yearlySalary/52;
	System.out.printf("a Yearly salary of %d means a weekly salary of %.2f\n", yearlySalary, weeklySalary);
	}
	public void salaryAfterPayRise(int salary, double payIncreasePercentage){
	double payIncrease = salary*payIncreasePercentage/100;
	double newSalary = payIncrease+salary;
	System.out.printf("A pay rise of %.1f percent to a salary of %d means an increase of %.2f and a new salary of %.1f\n", payIncreasePercentage, salary, payIncrease, newSalary);
	}
	}
	