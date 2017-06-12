package sheet16StringsAndStringBuilder;

public class Ex1Equals {

	public static void main(String[] args) {
		String A = "Monday";
        String B = new String("Monday");
        String C = "Tuesday";
        String D = C;
        String E =  new String("Tuesday");
        System.out.println("A == B: " + (A == B));
        System.out.println("C == D: " + (C == D));
        System.out.println("A == B: " + (A.equals(B)));
        System.out.println("C .equals D: " + (C.equals(D)));
        System.out.println("E == D: " + (E == D));
         C = C.toUpperCase();
         System.out.println(C);
         System.out.println("C == D: " + (C == D));//C == D: false
         System.out.println("C .equals D: " + (C.equals(D)));//C .equals D: false
        
        
	}

}
