package sheet2Methods;
public class Ex45678MethodsReturn{
    public static void main(String [] args){
	Ex45678MethodsReturn m = new Ex45678MethodsReturn();
	
	double answer = m.getAverage(2.1,3.2,5);
		System.out.println("result: " + answer);
	answer = m.getTotal(5.8,7.6,2);
		System.out.println("result: " + answer);
	answer = m.calculateVolume(5.8,7.6,2.5);
	System.out.println("result: " + answer);
	//salary
	answer = m.getMonthlySalary(50000);
	System.out.println("result: " + answer);
	answer = m.getWeeklySalary(38000);
	System.out.println("result: " + answer);
	answer = m.getSalaryAfterPayRise(40000,7.1);
	System.out.println("result: " + answer);
}

	public double getAverage(double a, double b, int c){
	double result;
	result = (a+b+c)/3;
	return result;
	}
	public double getTotal(double a, double b, int c){
	double result;
	result = a + b + c;
	return result;
	}
	//volume
	public double calculateVolume(double depth, double width, double breadth){
	double result = depth*width*breadth;
	return result;
	}
	//salary
	public double getMonthlySalary(int yearlySalary){
	double result = yearlySalary/12;
	return result;
	}
	public double getWeeklySalary(int yearlySalary){
	double result = yearlySalary/52;
	return result;
	}
	public double getSalaryAfterPayRise(int salary, double payIncreasePercentage){
	double payIncrease = salary*payIncreasePercentage/100;
	double result = payIncrease+salary;
	return result;
	}
	
	
	}
	