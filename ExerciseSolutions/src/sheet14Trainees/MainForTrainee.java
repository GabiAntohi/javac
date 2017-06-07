package sheet14Trainees;

import java.time.LocalDate;
import java.time.Month;

public class MainForTrainee {

	public static void main(String[] args) {
		Electrician  e = new Electrician("Dan Stan", LocalDate.of(1988, Month.FEBRUARY, 2), "23ffgbg");
		System.out.println(e);
		System.out.println("-----------------------");
		Carpenter c = new Carpenter ("Mark Markinson", LocalDate.of(1976, Month.JANUARY, 10), "sdghshdbg", 5, "Stephan");
		System.out.println(c);
		System.out.println("-----------------------");
		ComputerAidedDesign cad = new ComputerAidedDesign ("James Doe", LocalDate.of(1965, Month.MAY, 22), "hsdgsdfg", 7, "Camille");
		System.out.println(cad);
		System.out.println("-----------------------");
		SoftwareDeveloper sd = new SoftwareDeveloper ("Mark Markinson", LocalDate.of(1976, Month.JANUARY, 10), "sdghshdbg");
		System.out.println(sd);
		System.out.println("-----------------------");
		
		
	}

}
