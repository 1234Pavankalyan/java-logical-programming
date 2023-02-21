import java.util.*;
class except1{
  Scanner sc=new Scanner(System.in);
  int a,b,c;
  void division(){
    try{
      System.out.println("enter a,b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=a/b;
      System.out.println("the division is" +c);
       }
    catch(ArthematicException ae)
      {
      System.out.println("the exceptional");
              System.out.println("the exceptional" +ae);
              System.out.println("the exceptional" +ae.getmessage());
        
      }
    }
  public static void main(String args[])
   {
     ArthException ae1 = new ArthException();
 ae1.division();
 }
}
  
