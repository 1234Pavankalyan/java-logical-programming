/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/


import java.util.Scanner;

public class SubStringWithInbuilt {

  //main method
  public static void main(String args[]){
  //declare variables
  String s1,s2,s3;
//take input from user
    Scanner sc=new Scanner(System.in);
    s1=sc.nextLine();
    s2=sc.nextLine();
    s3=sc.nextLine();

//check if the string contains substring or not if contains print found else print not found
    int result = s1.indexOf(s2);
    if(result == -1) {
      System.out.println(s2 + " is not found");
    }
    else {
      System.out.println(s2 + " is found");
    }
    result = s1.indexOf(s3);
    if(result == -1) {
      System.out.println(s3 + " is not found");
    }
    else {
      System.out.println(s3 + " is found");
    }
  }

}