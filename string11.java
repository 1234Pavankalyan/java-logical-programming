//replace
import java.util.Scanner;
class string11{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("enter string1");
    String s=sc.next();
    String st1=s;
     String st2=s;
  
    System.out.println(st1.replace('a','e'));
  }
}