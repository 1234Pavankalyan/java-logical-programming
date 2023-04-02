/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

//import scanner
import java.util.Scanner;
import java.lang.*;
//main class
public class SubStringWithoutInbuilt {
  //main method
public static void main(String args[])
{
  //declare variables

    String s;
    String s1;
  //take input from user

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string:");
     s=sc.nextLine();
    System.out.print("Enter the word to be searched:");
     s1=sc.next();
  //compare two strings if the search string found or not without using inbuilt method isSubString()

//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false

    boolean result=false;
    for(int i=0;i<s.length();i++)
    {
        for(int j=0;j<s1.length();j++)
        {
            if(s1.charAt(j)==s.charAt(i))
            {
                if(j!=s1.length()-1 &&i!=s.length()-1)
                {
                    if(s1.charAt(j+1)==s.charAt(i+1))
                    {
                        result=true;
                    }
                }
            }
        }
    }
    if(result==true)
    {
        System.out.println("Excepted output:"+s1+" is found");
    }
    else
    {
        System.out.println("Excepted output:"+s1+" is not found");
    }
}
}