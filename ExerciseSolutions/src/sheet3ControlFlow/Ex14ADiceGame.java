package sheet3ControlFlow;
public class Ex14ADiceGame{
	public static void main(String [] args){
		Ex14ADiceGame ex14 = new Ex14ADiceGame();
		int num1 = (int)(Math.random()*6)+1;
		System.out.println("print a number "+ num1);
		int num2 = (int)(Math.random()*6)+1;
		System.out.println("print a number "+ num2);
		int total=0;
		ex14.pointsDiceThrow(num1, num2,total);

	}
	public void pointsDiceThrow(int num1, int num2, int total){	
		if(num1==6&&num2==6){
			total=num1+num2;
			System.out.println("when the two num are 6 the total is " + total);}
		else if(num1==6&&num2!=6) {
			total=num1+num2;
			System.out.println("when one num is 6 the total is " + total);}
		else if(num1!=6&&num2==6) {
			total=num1+num2;
			System.out.println("when one num is 6 the total is " + total);}
		else if(num1==3&&num2==3) {
			total=num1*num2+20;
			System.out.println("when both nums are 3 the total is " + total);}
		else if(num1!=3&&num2==3) {
			total=num1*num2+10;
			System.out.println("when one num is 3 the total is " + total);}
		else if(num1==3&&num2!=3) {
			total=num1*num2+10;
			System.out.println("when one num is 3 the total is " + total);}
		else if(num1==5&&num2==5) {
			total=num1*num2-8;
			System.out.println("when two nums are 5 the total is " + total);}
		else if(num1==5&&num2!=5) {
			total=num1*num2-4;
			System.out.println("when one num is 5 the total is " + total);}
		else if(num1!=5&&num2==5) {
			total=num1*num2-4;
			System.out.println("when one num is 5 the total is " + total);}
		else{
			total=num1*num2;
			System.out.println("your dice throw " + total);}
	}
}
