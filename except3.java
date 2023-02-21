// Write a Java program that takes input from the user in the form of a string and checks whether 
//   it is a palindrome or not.
//   Your program should use exception handling to handle the following situations:
// If the user inputs a non-string value, the program should catch the exception and display
//   an error message to the user.
import java.util.*;
class except3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    try{
      String s=sc.nextLine();
      String k="";
    for(int i=s.length()-1;i>=0;i--){
      k=k+s.charAt(i);
    }
    
    if(s.equals(k)){
    System.out.println("the string is palindrome"); 
    }
    else
     System.out.println("the string is not palindrome"); 
    }
    catch(Exception a){
      System.out.println("exception is" +a.getMessage());
    }
    
  }
}
