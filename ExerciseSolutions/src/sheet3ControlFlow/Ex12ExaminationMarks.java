package sheet3ControlFlow;
public class Ex12ExaminationMarks{
    public static void main(String [] args){
		Ex12ExaminationMarks ex12 = new Ex12ExaminationMarks();
		double ex1=30;
	    double ex2=70;
		double ex3=50;
		double average=(ex1+ex2+ex3)/3;
		ex12.indicatePassOrFail(ex1,ex2,ex3, average);
	
	}
	public void indicatePassOrFail(double ex1, double ex2, double ex3, double average){	
	
		if(ex1>=40 && ex2>=40 && ex3>=40){
			System.out.printf("congrats you have passed with an average of %.2f%%", average);}
		else if(ex1>=40 && ex2>=40 && ex3<40 && average>=50) {
			System.out.printf("congrats you have passed with an average of %.2f%%",  average);}
		else if(ex1>=40 && ex2<40 && ex3>=40 && average>=50) {
			System.out.printf("congrats you have passed with an average of %.2f%%",  average);}
		else if(ex1<40 && ex2>=40 && ex3>=40 && average>=50) {
			System.out.printf("congrats you have passed with an average of %.2f%%",  average);}	
		else  {
		System.out.printf("congrats you have NOT passed with an average of %.2f%%",  average);}
		
		
	}
	}
	