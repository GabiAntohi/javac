package sheet8BankAccount;



public class MainForEx1BankAccount {

	public static void main(String[] args) {
		Ex1BankAccount bc1 = new Ex1BankAccount("Jack Jones", "112 North Circular Road, Dublin 8", 40_000);
		System.out.println(bc1); 
		bc1.moneyDeposit(200);
		System.out.println("Money after deposit: "+bc1.getBalance()); 
		bc1.moneyWithdrawal(400);
		System.out.println("Money after withdrawal: " + bc1.getBalance()); 
		bc1.checkBalance();
		System.out.println("Current Balance: " + bc1.checkBalance()); 
		
		System.out.println("--------------------");

		Ex1BankAccount bc2 = new Ex1BankAccount("Anna Jones", "45 South Circular Road, Dublin 7", 20_000);
		System.out.println(bc2); 
		bc2.moneyDeposit(500);
		System.out.println("Money after deposit: "+bc2.getBalance()); 
		bc2.moneyWithdrawal(700);
		System.out.println("Money after withdrawal: " + bc2.getBalance()); 
		bc2.checkBalance();
		System.out.println("Current Balance: " + bc2.checkBalance()); 
		System.out.println("--------------------");
		
		
		Ex1BankAccount bc3 = new Ex1BankAccount("Abby Carter", "2 Kildare St, Dublin 2", 200);
		System.out.println(bc3); 
		bc3.moneyDeposit(300);
		System.out.println("Money after deposit: "+ bc3.getBalance()); 
		bc3.moneyWithdrawal(700);
		System.out.println("Money after withdrawal: " + bc3.getBalance()); 
		bc3.checkBalance();
		System.out.println("Current Balance: " + bc3.checkBalance()); 
		System.out.println("--------------------");
		
		
		Ex1BankAccount bc4 = new Ex1BankAccount("James Dean", "44 South Circular Road, Dublin 8", 30_000);
		System.out.println(bc4); 
		bc4.moneyDeposit(1_000);
		System.out.println("Money after deposit: "+bc4.getBalance()); 
		bc4.moneyWithdrawal(31_900);
		System.out.println("Money after withdrawal: " + bc4.getBalance()); 
		bc4.checkBalance();
		System.out.println("Current Balance: " + bc4.checkBalance()); 
		System.out.println("--------------------");
		
		
	}

}
