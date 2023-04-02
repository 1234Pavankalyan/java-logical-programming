
/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;

public class NumberFormatException {
  public static void display() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string 1");
    String s1 = sc.next();
    System.out.println("enter a string 2");
    String s2 = sc.next();
    try {
      int n1 = Integer.parseInt(s1);
      int n2 = Integer.parseInt(s2);
    } 
    catch (Exception k) {
      System.out.println("exception" + k.getMessage());
    }
  }

  public static void main(String args[]) {
    display();
  }
}
