package sheet4Arrays;
public class Ex1Arrays{
	public static void main(String [] args){

		int []nums = new int [10];
		for (int i = 0, value = 2; i<nums.length; i++, value +=2){
			nums[i] = value;

		}

		for (int i = 0;  i<nums.length; i++){
			System.out.println(nums [i]);

		}


	}
}
