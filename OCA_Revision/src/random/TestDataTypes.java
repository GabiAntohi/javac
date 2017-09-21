package random;


 public class TestDataTypes{
		   private Object o;
		   void doSomething(Object s){  o = s;   }

		   public static void main(String args[]){
		      Object obj = new Object(); // 1
		      TestDataTypes tc = new TestDataTypes(); //2
		      tc.doSomething(obj); //3
		      obj = new Object();    //4
		      obj = null;    //5
		      tc.doSomething(obj); //6 becomes eligible for garbage collection
		      
		      
		      //int b = 0, c = 0; 
		      //int a = b = c = 100;
		      
		     // int b, c; 
		     // int a = b = c = 100;
		     // System.out.println(a);
		      
		      
		      int b, c, a; 
		      a = b = c = 100;
		      System.out.println(a);
		      
		      
		      
		      //float d = 0 * 1.5f;  //prints 0
		      float d = 0 * (float)1.5; 
		      System.out.println(d);
		      

		      int i = 1;
		      int j = i++;
		      if( (i==++j) | (i++ == j) ){
		        i+=j;
		      }
		      System.out.println(i);
		   }
		      
		      void switchtest(int x){
		    	  switch(x)
		    	{case 1:
		    	case 2:
		    	case 0:
		    	default :
		    	case 4: 
		    	
		    	}
		    	  
		    	  
		    	 // boolean b1 = false;
		    	 // boolean b2 = false; 
		    	//  if (b2 != b1 = !b2){System.out.println("true"); } //compile time error 
		    	//  else{System.out.println("false"); }
		    	  
		    	  
		    	  
		    	
		   }
		   

		}
	 

	 
	 
	/*class Square {
	    private double side = 0;
	    String color;
	    public Square(double length){
	        this.side = length;
	    }
	    public double getSide() {  return side;    }

	    public void setSide(double side) {  this.side = side;   }
	    
	}

	public class TestClass {
	    public static void main(String[] args) throws Exception {
	        Square mysq = new Square(10);
	        mysq.color = "red";
	        
	        //set mysq's side to 20
	    }
	}*/

