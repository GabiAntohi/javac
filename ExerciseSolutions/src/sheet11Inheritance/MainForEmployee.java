package sheet11Inheritance;

import java.time.LocalDate;
import java.time.Month;



public class MainForEmployee {

	public static void main(String[] args) {
	Boss b= new Boss("John","Malone", LocalDate.of(1998, Month.DECEMBER, 2), 700);
	b.getEarnings();
	System.out.println(b);
	System.out.println("---------------------");
	CommissionWorker c = new CommissionWorker("Dan","Joe", LocalDate.of(1988, Month.FEBRUARY, 2), 23, 30, 300);
	c.getEarnings();

	System.out.println(c);
	System.out.println("---------------------");
	PieceWorker p = new PieceWorker("Danny","Gray", LocalDate.of(1956, Month.NOVEMBER, 3), 60, 20);
	p.getEarnings();
	System.out.println(p);
	System.out.println("---------------------");      
	HourlyWorker h = new HourlyWorker("Steve","Jobs", LocalDate.of(1980, Month.AUGUST, 20), 41, 40);
	h.getEarnings();
	System.out.println(h);
	System.out.println("---------------------");    
       
	Employee[] allEmployees = {b, c, p, h};
	printEmployee(allEmployees);

	}

	public static void printEmployee(Employee[] allEmployees){
		for(Employee one:allEmployees)
		{System.out.println(one.getEarnings());}
		
	}
	
	
}
