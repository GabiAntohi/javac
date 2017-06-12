package sheet16StringsAndStringBuilder;

public class Ex2UpdateMenu {

	public static void main(String[] args) {
		String todayMenu="Wednesday's Menu: Roast Turkey with homemade turkey gravy, potatoes and veg of the day";
		todayMenu=todayMenu.replace ("Wedne" , "Thur");
		System.out.println(todayMenu);
		todayMenu=todayMenu.replace ("Wednesday" , "Thursday");
		System.out.println(todayMenu);
		todayMenu=todayMenu.replace ("turkey" , "beef");
		System.out.println(todayMenu);
		todayMenu=todayMenu.concat(". Jelly and icecream for desert.");
		System.out.println(todayMenu);
		todayMenu=todayMenu.replace ("and icecream" , "");
		System.out.println(todayMenu);
		System.out.println("...................");
		todayMenu=todayMenu.concat(". Jelly and icecream for desert.");
		System.out.println(todayMenu);
		todayMenu=todayMenu.substring(85);
		System.out.println(todayMenu);
		todayMenu=todayMenu.replace (".." , ".");
		System.out.println(todayMenu);
	}

}
