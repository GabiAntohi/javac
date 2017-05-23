package sheet5Classes;

public class MainForEx4EmailAccount {

	public static void main(String[] args) {
	//String address="first.last@somwwhere.com";
		
		Ex4EmailAccount g4 = new Ex4EmailAccount("Mary", "mary@marycom", "glmb", Ex4EmailAccount.STORAGE_1_T);
		System.out.println(g4); 
	
		Ex4EmailAccount g5 = new Ex4EmailAccount("John", "blah@marycom", "glmb", Ex4EmailAccount.STORAGE_255_GB);
		System.out.println(g5);  

		Ex4EmailAccount g6 = new Ex4EmailAccount("Dean", "yep@mary.com", "   55555555555glmfhdfhgvyrb", Ex4EmailAccount.STORAGE_500_GB);
		System.out.println(g6);  

		Ex4EmailAccount g7 = new Ex4EmailAccount("Sam", "no@mary.com", "glmb", Ex4EmailAccount.STORAGE_255_GB);
		System.out.println(g7);  


		
		
		
	}

}
