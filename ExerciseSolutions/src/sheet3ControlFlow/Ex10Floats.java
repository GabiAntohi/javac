package sheet3ControlFlow;


public class Ex10Floats {

	public static void main(String[] args) {
	float num1 = 10;
	float num2 = 13;
	float num3 = 5;
	Ex10Floats ex10 = new Ex10Floats();
	ex10.sameOrDifferent(num1,num2,num3);
	ex10.largestAndSmallest(num1,num2,num3);

	}
	public void sameOrDifferent(float a, float b, float c){
	if (a==b&&a==c)
		System.out.printf("The numbers  %.2f and %.2f and %.2f are the same", a, b, c);
	else if (a!=b&&b!=c)
		System.out.printf("The numbers  %.2f and %.2f and %.2f are different", a, b, c);
	else 
		System.out.printf("Two numbers are the same");
	//if (a==b||b==a||c==b) if two or more are the same
	
		
	}
	public void largestAndSmallest(float a, float b, float c){
		float largest = a;
		if (b>largest)
			largest=b;
		if (c>largest)
			largest=c;
		System.out.println("\nThe largest is " + largest);
		
		float smallest = a;
		if (b<smallest)
			smallest=b;
		if (c>smallest)
			smallest=c;
		System.out.println("The smallest is " + smallest);
	}
	

}
