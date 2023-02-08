//concat scan
import java.util.Scanner;
class string8a{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    System.out.println("enter string1");
    String st1=sc.nextLine();
    System.out.println("enter string2");
    String st2=sc.nextLine();
   System.out.println(st1+st2);
    System.out.println(st1.concat(st2));
  }
}