package random;

class TestClass{

	   public static void main(String args[]){
	      boolean b = false;
	      int i = 1;
	      do{
	         i++ ; //2  3
	      } while (b = !b); // true, false prints 3
	      System.out.println( i );
	   }
 

	}