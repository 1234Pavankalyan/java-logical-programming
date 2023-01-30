// Write a program that takes an age as input and checks if the person is a teenager (between 13 and 19 inclusive)
//   or an adult (20 and above) using nested if statements.
import java.util.Scanner;

class age {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter age");
    int age = sc.nextInt();
    if (age >= 13)
    {
      if (age <= 19) 
      {
        System.out.println("person is teenager");
      } 
      else
      {
        System.out.println("person is adult");
      }
    } 
    else
    {
       System.out.println("person is not adult or teenager");
    }
  }
}
