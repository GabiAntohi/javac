package random;


class Sum{

int add(int a, int b) {
return (a+b);   
}

public static void main (String args[]){
    System.out.println(" using Sum class");
    Sum a = new Sum();
    System.out.println("Sum is :" + a.add(5, 10));
    }


public static void main (int i){
    System.out.println(" Using Sum class main function with integer argument");
    Sum a = new Sum();
    System.out.println("Sum is :" + a.add(20, 10));
    }
}

class DefClass {

public static void main (String args[]){
    System.out.println(" using DefClass");
    Sum a = new Sum();
    System.out.println("Sum is :" + a.add(5, 10));
    Sum.main(null);
    Sum.main(1);
}
}

public class Test{
	public static void main (String args[]){	
		System.out.println("TEST2");
	}
}
class Testing{
	public static void main (String args[]){	
		System.out.println("TEST");
	}
}




/*When we compile the code Test.java it will generate 2 .class files 
 * (viz Sum.class and DefClass.class) and if we run Test.java we cannot run it as it won't find any main class with the name Test. 
 * Instead if we do java Sum or java DefClass both will give different outputs using different main().
 *  To use the main method of Sum class we can use the class name Sum.main(null) or Sum.main(1)//Passing integer value in the DefClass main().
 */

/*In a class scope we can have only one public static void main (String args[]) per class since a static method of a class belongs
 *  to a class and not to its objects and is called using its class name. Even if we create multiple objects and call the same static
 *   methods using them then the instance of the static method to which these call will refer will be the same.
 */

/*We can also do the overloading of the main method by passing different set of arguments in the main. The Similar example is provided
 *  in the above code but by default the control flow will start with the public static void main (String args[]) of the class file which
 *   we have invoked using java classname. To invoke the main method with other set of arguments we have to explicitly call it from other classes.*\
 */

