package sheet15Exceptions;

public class MainForEx1EmployeeClass {

	public static void main(String[] args) {
		Ex1EmployeeClass em1;
		try {
			em1 = new Ex1EmployeeClass("Mark",88, 5);
			System.out.println(em1);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		Ex1EmployeeClass em2;
		try {
			em2 = new Ex1EmployeeClass("John",50, 7);
			System.out.println(em2);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
		Ex1EmployeeClass em3;
		try {
			em3 = new Ex1EmployeeClass("Eddy",37, 20);
			System.out.println(em3);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
				
		Ex1EmployeeClass em4;
		try {
			em4 = new Ex1EmployeeClass("June",20, 0);
			System.out.println(em4);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}

}
