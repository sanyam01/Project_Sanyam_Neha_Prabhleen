public class Converter {
//Your names go here:
/*
* @Author: Name of the first student
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
public static void main(String[] args) {
//TODO: The first student will implement this method.
// Call CelsiusToFahrenheit to convert 180 Celsius to Fahrenheit value.
// Call FahrenheitToCelsius to convert 250 Fahrenheit to Celsius value.
}
}