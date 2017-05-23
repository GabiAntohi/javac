package sheet4Arrays;
public class Ex3Arrays{
	public static void main(String [] args){
		Ex3Arrays ex3=new Ex3Arrays();

		int[]num2={1,2,3,4,5,6,5,8};
		int[]num3={8,7,9,5,4,3,2,1};
		int[]total = new int[num2.length];
		ex3.makeSum(num2 , num3 , total);
 
	}		


	public void makeSum(int []num2 , int  []num3 , int []total ){
		System.out.println("Num2" + "\t\t" + "Num3" + "\t\t" +"Total");
		for (int i = 0; i < num2.length;i++) {
			total[i] = num2[i] + num3[i];
			//System.out.println("The sum is " + total[i]);
			System.out.println(num2[i] + "\t\t" + num3[i] + "\t\t" + (num2[i] + num3[i]));
		}

	}

}

//method shares same area in memory
//create a method to print all contents of all arrays
