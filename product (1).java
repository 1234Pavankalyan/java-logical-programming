//product of a given number
import java.util.Scanner;  
public class product 
{  
public static void main(String args[])  
{  
int number, digit, product = 1;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = sc.nextInt();  
while(number > 0)  
   {      
digit = number % 10;   
product= product * digit;    
number = number / 10;  
  }  
System.out.println("products of Digits: "+product);  
}  
}