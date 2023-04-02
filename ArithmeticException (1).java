
/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/

  import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
   
      if(b==0){
        try {
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } 
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
      }
       
      else {
        System.out.println("enter second number zero to get arthematic exception");
      }
   
        }
    public static int divide(int a, int b)throws Exception {
        return a / b;
    }
}
/* ArithmeticException is the predefined exception where num divide with zero we will get ArithmeticException.*/