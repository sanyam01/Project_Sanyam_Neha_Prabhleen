// This is the development branch 
public class Converter {
//Your names go here:
/*
* @Author: Sanyam
* Neha Singh
* Prabhleen Kaur
*
*/
private double celsiusToFahrenheit(double C){
// TODO: The third student will implement this method
	double fahrenheit = (9.0/5.0)*C + 32;
    System.out.println("Temperature in Fahrenheit is : "+fahrenheit);
	return fahrenheit;

}
private double fahrenheitToCelsius(double F){
// TODO: The second student will implement this method
	double celsius = ((5 * (F - 32.0)) / 9.0);
	System.out.println(F + " degree Fahrenheit is equal to " + celsius + " in Celsius");
	return celsius;
}

private double kilometersToMiles(double km) {
	
	double miles = km * 0.62137;
	return miles;
	
}


public static void main(String[] args) {
//TODO: The first student will implement this method.
	Converter obj = new Converter();
// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
	obj.celsiusToFahrenheit(180);
// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
	obj.fahrenheitToCelsius(250);
	
	double miles = obj.kilometersToMiles(30);
	System.out.println("Dis in miles " +  miles);
}
}