package sheet4Arrays;

public class Ex6ExamRezults {

	public static void main(String[] args) {
		int i=0;
		int sum=0;
		int average=0;
		boolean bool1;
		bool1=true;

		int[] exam1 = {50,60,70};
		int[] exam2 = {39,75,41};
		int[] exam3 = {45,40,33};
		Ex6ExamRezults ex6= new  Ex6ExamRezults();
		ex6.printMyArray(exam1);
		ex6.printMyArray(exam2);
		ex6.printMyArray(exam3);
		//ex6.printResult(int[]results);
		
		boolean result= ex6.calculateResult(exam1,sum,average,bool1);
		System.out.print("Result 1:  "+ "\t");
		for ( i = 0; i < exam1.length; i++) 
			System.out.print(exam1[i] + " \t");
		if (result==true) {System.out.print("pass");}
		else{System.out.print("fail");}
		
		result=ex6.calculateResult(exam2,sum,average,bool1);
		System.out.print("\n" +"Result 2: " + "\t");
		for ( i = 0; i < exam1.length; i++) 
			System.out.print(exam2[i] + " \t");
		if (result==true) {System.out.print("pass");}
		else{System.out.print("fail");}
		
		result=ex6.calculateResult(exam3,sum,average,bool1);
		System.out.print("\n" +"Result 3: " + "\t");
		for ( i = 0; i < exam1.length; i++) 
			System.out.print(exam3[i] + " \t");
		if (result==true) {System.out.print("pass");}
		else{System.out.print("fail");}
		
	}
//	private void printResult(){
		
		
		
		
		
//	}

	public void printMyArray(int [] myArray) {
		for (int i = 0; i < myArray.length; i++) 
			System.out.print( myArray[i] + " \t");
		System.out.println();
	}

	public boolean calculateResult(int []exam, int sum, int average, boolean bool1){
		for( int num : exam) {
			sum += num;
			average = sum/3;	
		}
		if (average>=50){bool1=true;}
		else{bool1=false;}
		Boolean result;
		result=bool1;
		return result;
	}

}

