/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.Scanner;

public class Palindrome {

  //main method
  public static void main(String args[]){
  //declare varible
  String s,reverse="";
  //take input from user
  Scanner sc=new Scanner(System.in);
  s=sc.nextLine();

  /* 
   divide the whole string into two halves and compare each character   in the 
   first half with each character in the second half in reverse.  
   If both are equal then it is a palindrome else print it is not a     palindrome 
  */
  int strLength = s.length();

  for (int i = (strLength - 1); i >=0; --i) {
    reverse = reverse + s.charAt(i);
    }

  if (s.toLowerCase().equals(reverse.toLowerCase())) {
    System.out.println(s + " is a Palindrome");
    }
    else {
      System.out.println(s + " is not a Palindrome");
    }
  }

}