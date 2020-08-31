import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter in the mass of the water, in grams");
	double mass = reader.nextDouble();
	System.out.println("Enter the initial temperature, in Celsius");
	double initialTemp = reader.nextDouble();
	if(initialTemp < -273.14)
	   initialTemp = -273.14;
	System.out.println("Enter the final temperature, in Celsius");
	double finalTemp = reader.nextDouble();
	if(finalTemp < -273.14)
	    finalTemp = -273.14;
	    
	System.out.println("Mass: " + mass + "g");
	System.out.println("Initial Temperature: " + initialTemp + "C");
	System.out.println("Final Temperature: " + finalTemp + "C");
	
	}
}
