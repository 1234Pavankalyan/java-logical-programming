//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/
import java.util.Scanner;
public class BooleanOperation {

public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  //read input

   boolean value=sc.nextBoolean();
  System.out.println(!value);//print false
}
  }

