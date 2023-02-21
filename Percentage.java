//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 69.0%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
public class Percentage {
  public static void main(String args[]){
  int maximum_marks, total_marks;
  Scanner sc=new Scanner(System.in);
  
  float Percentage;
  System.out.println("Enter the maximum_marks:");
  maximum_marks=sc.nextInt();
  System.out.println("Enter total_marks possible: ");
  total_marks=sc.nextInt();
   Percentage =(float)Math.round(((total_marks*100)/maximum_marks));
  System.out.println("Percentage = "+Percentage);
}
}
//Define the main method

//Declare the variables

//Use the scanner class to provide total_marks and maximum_marks at execution time
/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the total marks");
total_marks= scanner.nextInt();
System.out.println("Enter maximum marks possible "); 
maximum_marks=scanner.nextInt(); 
*/


//Calculate the percentage of marks

//Print the Result

