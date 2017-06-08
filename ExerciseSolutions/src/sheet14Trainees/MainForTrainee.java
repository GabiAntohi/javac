package sheet14Trainees;

import java.time.LocalDate;
import java.time.Month;

public class MainForTrainee {

	public static void main(String[] args) {
		Electrician  e = new Electrician("Dan Stan", LocalDate.of(1988, Month.FEBRUARY, 2), "23ffgbg", Apprentice.PHASE_TWO, "Camille");
		System.out.println(e);
		System.out.println("-----------------------");
		Carpenter c = new Carpenter ("Mark Markinson", LocalDate.of(1976, Month.JANUARY, 10), "sdghshdbg", Apprentice.PHASE_ONE, "Stephan");
		System.out.println(c);
		System.out.println("-----------------------");
		Carpenter c1 = new Carpenter ("Steve O'Brady", LocalDate.of(1950, Month.JUNE, 10), "4553fch",9, "Stephan");
		System.out.println(c1);
		System.out.println("-----------------------");
		ComputerAidedDesign cad = new ComputerAidedDesign ("James Doe", LocalDate.of(1965, Month.MAY, 22), "hsdgsdfg");
		System.out.println(cad);
		System.out.println("-----------------------");
		ComputerAidedDesign cad2 = new ComputerAidedDesign ("Dean Silva", LocalDate.of(1980, Month.DECEMBER, 5), "hdghgvhs");
		System.out.println(cad2);
		System.out.println("-----------------------");
		SoftwareDeveloper sd = new SoftwareDeveloper ("Mark Markinson", LocalDate.of(1976, Month.JANUARY, 10), "sdghshdbg");
		System.out.println(sd);
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		
		Trainee [] alltrainees = {e, c, c1, cad, cad2, sd};
	
		for(Trainee one:alltrainees){
			if (one instanceof Apprentice &&((Apprentice)one).getPhase()==2){
			((Apprentice)one).getPhase();	
		    System.out.println("Phase 2: "+"\nEmployer name: " + ((Apprentice)one).getEmployersName() + "\nEmployee name: " + one.getName());}
		
		
	         	/*for(Trainee one:alltrainees){
				
				if (one instanceof Apprentice)
			    System.out.println("Employee name: " +((Trainee)one).getName());
				if (one instanceof Apprentice)
				System.out.println("Manager's name: " + ((Apprentice)one).getEmployersName());}
				*/
			
	}

}}
