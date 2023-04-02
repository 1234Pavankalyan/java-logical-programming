/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/
import java.util.*;
public class NumberFormatException {

    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
      long msum=0,rem=0;
      System.out.println("enter first name");
    String  fname=sc.next();
       System.out.println("enter last name");
    String  lname=sc.next();
       System.out.println("enter  mobile number");
    String  mnumber=sc.next();
      System.out.println("first name length is" +fname.length());
       System.out.println("first name length is" +lname.length());
      try{
     long  lmnumber =Long.parseLong(mnumber);
        while(lmnumber>0){
          rem=lmnumber%10;
          msum+=rem;
          lmnumber=lmnumber/10;
        }
         System.out.println("The enter  mobile number sum is  " +msum);
      }
      catch(Exception e){
         System.out.println(e);
      }
      
    }
}