/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/
import java.util.*;
public class ArithmeticException {

    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      System.out.println("enter number one");
      int num1=sc.nextInt();
       System.out.println("enter number two");
      int num2=sc.nextInt();
       System.out.println("enter option");
      int option=sc.nextInt();
      switch(option){
        case 1:
          {
            int c=num1+num2;
            System.out.println(c);
          }
            break;
          case 2:
          {
            int c=num1-num2;
            System.out.println(c);
          }
            break;
          case 3:
          {
            int c=num1*num2;
            System.out.println(c);
          }
          break;
          case 4:
          {
            try{
            int c=num1/num2;
            System.out.println(c);
            }
            catch(Exception e){
               System.out.println("exception by   "  +e.getMessage());
            }
          }
          break;
          default :{
            System.out.println("wrong choice");
          }
      }
    }
}