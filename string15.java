//palindrome
import java.util.*;
class string15{
  public static void main(String args[]){
    Scanner sc=new Scanner( System.in);
    System.out.println("enter string");
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
}