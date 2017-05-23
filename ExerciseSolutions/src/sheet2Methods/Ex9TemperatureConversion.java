package sheet2Methods;
public class Ex9TemperatureConversion{
    public static void main(String [] args){
		Ex9TemperatureConversion m = new Ex9TemperatureConversion();
	
		double answer = m.getFahrenheitFromCelsius(8.1);
		System.out.println("result: " + answer);
		answer = m.getCelsiusFromFahrenheit(5.5);
		System.out.println("result: " + answer);


}

	public double getFahrenheitFromCelsius(double c){
	 double result;
	 result = (c*9/5)+32;
	 return result;
	 }
	 public double getCelsiusFromFahrenheit(double f){
	 double result;
	 result = (f-32)*5/9;
	 return result;
	 }
	
	}
	