package sheet2Methods;
public class Ex1AddAndMultiply{
    public static void main(String [] args){
	Ex1AddAndMultiply m = new Ex1AddAndMultiply();
	
		m.add(7,3);
		m.multiply(3,7);
		//m.divide(9,3);
		m.subtract(8,7);
		//m.remainder(8,7);
		m.divide(7,3);
		m.remainder (17,5);
	
}

	public void add(int a,int b){
		int result; // declares double variables called result
		result = a + b; //adds a and b
		System.out.printf("The totals of %d and %d is %d\n", a, b, result);
	}
	public void multiply(int a,int b){
		int result; // declares double variables called result
		result = a * b; 
		System.out.printf("Multiplying %d and %d is %d\n", a, b, result);
	}
	public void divide(int a,int b){
		double result; // declares double variables called result
		result = a/b; 
		System.out.printf(" %d divided by %d is %f\n", a, b, result);//the result is int, made a mistake!!!
	}
	public void subtract(int a,int b){
		int result; // declares double variables called result
		result = a - b; 
		System.out.printf("Subtract %d from %d to get %d\n", b, a, result);
	}	
	public void remainder(int a,int b){
		int result; // declares double variables called result
		result = a % b; 
		System.out.printf("the remainder from %d divided by %d is %d\n", a, b, result);
	
	}
	
	
	
	
	
	
	}
	