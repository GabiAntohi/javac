package sheet9Inheritance;

public class MainForEx1Furniture {

	public static void main(String[] args) {
		
	
		System.out.println("Table:");
		Table t = new Table("red","nylon", Table.IS_NOT_EXPANDABLE, "square");
		System.out.println(t);
		System.out.println("--------------------");
		System.out.println("Bed:");
		Bed b = new Bed("blue", "pine", "double", Bed.Headboard.YES );
		System.out.println(b);
		System.out.println("--------------------\n");
		System.out.println("Chair:");
		Chair c = new Chair("red","nylon", true, "square");
		System.out.println(c);
		System.out.println("--------------------\n");
		
	}

}
