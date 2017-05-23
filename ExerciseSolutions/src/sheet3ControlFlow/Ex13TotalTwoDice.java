package sheet3ControlFlow;
public class Ex13TotalTwoDice{
    public static void main(String [] args){
		Ex13TotalTwoDice ex13 = new Ex13TotalTwoDice();
		int num = (int)(Math.random()*6)+1;
		System.out.print("print a number "+ num);
		int num2 = (int)(Math.random()*6)+1;
		System.out.print("\nprint a number "+ num2);
		
		ex13.pointsDiceThrow(num, num2);
	
	}
	public void pointsDiceThrow(int num, int num2){	
	
		System.out.print("\ntotal "+ (num*num2));
		
	}
	}
	