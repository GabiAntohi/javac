package random;

public class Methods{
    static int a = 0;
	int b = 5;
	
	public void foo(){
		while(b>0){
		b--;
		a++;
		}
		System.out.println("blah");
		}
	public static int method1(long... b){
		System.out.println(b);
		return 1;
	}
		 

	public static void main(String[] args) {
		Methods p1 = new Methods();
		p1.foo();
		//Methods p2 = new Methods();
		//p2.foo();
		System.out.println(p1.a+" ");//statics instantiated just once
		System.out.println(a+" "+p1.b);
		method1(null);
	
	}
	}
