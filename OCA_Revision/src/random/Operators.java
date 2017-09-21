package random;

public class Operators {
	static boolean a;
	static boolean b;
	static boolean c;
	public static void main(String[] args) {
		
		 boolean bool = (a = true) || (b = true) && (c = true); 
		 System.out.print(a + ", " + b + ", " + c);
		 System.out.println("does not evaluate the right hand side statement - T || will not be evaluated and be deemed F");
		
		// String s = 63 + new Integer(10); needs a string for concat
		
		
		  char v;
          LOOP: for (v=0;v<5;v++){
              switch(v++){
              
                  case '0': System.out.println("A");
                  case 1: System.out.println("B"); break LOOP;
                  case 2: System.out.println("C"); break;
                  case 3: System.out.println("D"); break;
                  case 4: System.out.println("E");
                  case 'E' : System.out.println("F");
                  
                  //prints CEF
              }
              
              
             
          }

		//  if (args[0].equals("open"))
			//  if (args[1].equals("someone")) 
			//	  System.out.println("Hello!"); 
			//  else System.out.println("Go away "+ args[1]);  //the command line : java Test closed, prints nothing
		  
		  
		
		
		
		  
		  
	}

}
