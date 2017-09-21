package random;
import java.util.*;
public class JustLooping {
	
	private int j;
	void showJ(){
		while(j<=5){ //0, 1, 2, 3, 4, 5


			//1
			for(int j=1; j <= 5;){
				System.out.print(j+" "); //1, 2, 3, 4, 5
				j++; 
			}
			
			
			
			
			j++;} 
	} 


	public static void main(String[] args) {
		new JustLooping().showJ();
		
		 int m = 0;
	      for (m=1 ;  m<5  ; m++) continue;  //(1)
	      for (m=0 ;       ; m++) break;       //(2)
	      for (    ; m<5?false:true ;    ); 
	      
	      
	      
		List<String> birds = new ArrayList<>();
		birds.add("hawlk");
		birds.add("blah");
		birds.add("hawlk");
		//birds.add(Boolean.FALSE);
		System.out.println();
		System.out.println(birds.size() + "   size");
		System.out.println(birds.remove(1));
		System.out.println(birds.remove("ah"));
		System.out.println(birds.contains("ah") + "  contains");
		
		System.out.println(birds.remove("bbllah"));
		System.out.println(birds.remove(0));
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		birds.clear();
		System.out.println(birds.size());
		
		
		
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		List<String> three = new ArrayList<>();
		System.out.println(one==two); //f
		System.out.println(one.equals(two) + " one.equals(two)"); //t
		one.add("abc");
		one.add("bcd");
		two.add("abc" + "bcd");
		three.add("abcbcd");
		System.out.println(one.equals(two) + "  one.equals(two)"); //f
		System.out.println(one);
		System.out.println(two);
		System.out.println(two.equals(three) + " two.equals(three)");
		
		
		String a = "bb";
		String b = "bb";
		String c = "b" + "b";
		String d = "b"; //a == d, false
		d +="b";
		String e = new String ("bb");
		System.out.println((a==b) + "  a==b ");//t
		System.out.println((a.equals(b)) + "  a.equals(b)");//t
		System.out.println((a==c) + " a==c"); //t
		System.out.println(a.equals(c)+ "  a.equals(c)");//t
		System.out.println((a==d) + " a==d"); //f
		System.out.println(a.equals(d) + "  a.equals(d)");//t
		System.out.println(a.equals(e) + "  a.equals(e)");//t
		
		
		
		
		StringBuilder sb1 = new StringBuilder("ha");
		StringBuilder sb2 = new StringBuilder();
		sb2.append("ha");
		StringBuilder sb4=sb2.append("1");
		StringBuilder sb3 = new StringBuilder("ha");
		System.out.println((sb1==sb3) + " sb1==sb3");//f
		System.out.println(sb1.equals(sb3)  + " sb1.equals(sb3)");// uses == f
		System.out.println((sb2==sb4) + " sb2==sb4");//t
		System.out.println((sb1.toString()));
		
		String t = "hello";
		String n = t.replace('l', 'x').toUpperCase().substring(3);//watch out for upper/lowercase
		System.out.println(n);
		
	}
}
//1 2 3 4 5    
//1 2 3 4 5    1 2 3 4 5    1 2 3 4 5    1 2 3 4 5    1 2 3 4 5    6 times