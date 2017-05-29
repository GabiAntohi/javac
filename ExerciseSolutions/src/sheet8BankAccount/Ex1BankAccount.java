package sheet8BankAccount;

public class Ex1BankAccount {
	private String name;
	private String address;
	private int accountNo;
	private double balance;
	public static double interestRate = 0.03;
	public static int bankAccountNoCounter =0;
	public static int accountNoCounter =10000;
	private Ex1BankAccount() {
		accountNo=accountNoCounter;
		accountNoCounter++;
		bankAccountNoCounter++;
	}
	public Ex1BankAccount(String name, String address, double balance){
		this();
		setName(name);
		setAddress(address);
		setBalance(balance);
	}

	public Ex1BankAccount(double balance){
		this();
		setBalance(balance);	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//methods
	public void moneyDeposit(double deposit){
		if (deposit>0)
		balance+=deposit; 
		else {System.out.println("no negative deposits alowed");}
	}
	public void moneyWithdrawal(double withdrawal){
		if(withdrawal<=balance)
			balance-=withdrawal;
		else{System.out.println("not enough funds, input different amount");}
	}
	
	public double addInterest(){
		balance=balance+balance*interestRate; 
		return balance;
	}
	public void moneyWithdrawalAll(){
		balance=balance-balance;
	}
	public double checkBalance(){
		return balance;
			}
	
	@Override
	public String toString() {
		return "New Account \nCustomer no: " + bankAccountNoCounter+
				"\nName of holder: " + name + 
				" \nAddress: " + address +
				" \nAccount Number: " + accountNo + 
				" \nBalance: "+ getBalance() + 
				"\nInterest rate: " + interestRate+ 
				"\nBalance with interest: "+ addInterest()
				;
	} 



}
