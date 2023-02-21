import java.util.*;
class Exceptions2{
  Scanner sc=new Scanner(System.in);
  String s,s2="";
  void Palindrome(){
    try{
      System.out.println("enter your string :");
      s=sc.nextLine();
      if (!s.matches("^[a-zA-Z]+$")) { throw new NumberFormatException(); }
     for(int i=s.length()-1;i>=0;i--){
       s2+=s.charAt(i);
     }
      if(s.equalsIgnoreCase(s2))
      System.out.println(s+" its palindrome");
      else
         System.out.println(s+" its  not palindrome");
    }
   
    catch(NumberFormatException be){
      System.out.println("exception occur due to invalid input ");
    }
    
  }
  public static void main(String args[]){
    Exceptions2 d=new Exceptions2();
    d.Palindrome();
  }
}