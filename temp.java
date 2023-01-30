//Create a program that converts Fahrenheit to Celsius using the formula (C = (F - 32) * 5/9).
 
// Ask the user to input a temperature in Fahrenheit.
// Declare a double variable to store the Fahrenheit value.
// Use the variable to calculate the equivalent temperature in Celsius and store the result in a double variable.
// Print the result.
import java.util.Scanner;
class temp{
  public static void main(String args[]){
    double f,C;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter fahrenheit temperature");
    f=sc.nextDouble();
    C = (f - 32) * 5/9;
    System.out.println("the celcius is" +C);
     System.out.println("the result temperatures");
     System.out.println("the celcius temperature is" +C);
     System.out.println("the fahrenheit temperature is " +f);
  }
}