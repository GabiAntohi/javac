package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

	public static void main(String[] args) {
		String s1 = "One";
        String s2 = "Two";
        String s3 = "Three";
        String s4 = "Four";
        String s5 = "Five";
        String s6 = "Six";
        String s7 = "One";

    
       
       // for(String f:strings )System.out.println(f);
        ArrayList<String> strList = new ArrayList<>();
        strList.add(s1);
        strList.add(s2);
        strList.add(s3);
        strList.add(s4);
        strList.add(s5);
        strList.add(s6);
        System.out.println(strList);
        ArrayList<String> strList1 = new ArrayList<>();
       String[] strings = {s1, s2, s3, s4, s5, s6};
         strList1.addAll(Arrays.asList(strings));
        System.out.println(strList);
	}

}
