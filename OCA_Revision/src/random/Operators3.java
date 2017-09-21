package random;

public class Operators3 {

	public static void main(String[] args) {
		 int i = 1; //i=1
		 int j = i++; //j=1, i=2
		 if( (i==++j) | (i++ == j) ){ // i=2, j=2, i = 3, j = 2
		    i+=j;
		  }
		  System.out.println(i);

	}

}
