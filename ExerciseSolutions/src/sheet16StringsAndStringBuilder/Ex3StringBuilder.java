package sheet16StringsAndStringBuilder;

public class Ex3StringBuilder {


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
			
			StringBuilder sb=new StringBuilder("Hello ");  
			sb.append("Java");//now original string is changed  
			System.out.println(sb);//prints Hello Java  
			
			StringBuilder sb1=new StringBuilder("Wednesday's Menu: Roast Turkey with homemade turkey gravy, potatoes and veg of the day");  
			sb1.replace(0,5,"Thur");   //use index of
			System.out.println(sb1); 
			
			StringBuilder sb2=new StringBuilder("Wednesday's Menu: Roast Turkey with homemade turkey gravy, potatoes and veg of the day");  
			sb2.replace(24,30,"beef"); //replace letters start-end point  
			System.out.println(sb2); 
			
			StringBuilder sb3=new StringBuilder("Wednesday's Menu: Roast Turkey with homemade turkey gravy, potatoes and veg of the day");  
			sb3.append(". Jelly and icecream for desert."); 
			System.out.println(sb3);
			
			StringBuilder sb4=new StringBuilder("Wednesday's Menu: Roast Turkey with homemade turkey gravy, potatoes and veg of the day. Jelly and icecream for desert.");  
			sb4.delete(sb4.indexOf("and icecream"),sb4.indexOf("for"));
			System.out.println(sb4);
			
			
		}

	}


