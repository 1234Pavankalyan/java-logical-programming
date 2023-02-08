//equals through scan
import java.util.Scanner;
class string3a{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    System.out.println("enter string1");
    String st1=sc.nextLine();
     System.out.println("enter string2");
    String st2=sc.nextLine();
    if(st1.equals(st2)){
          System.out.println("both are equals");
    }
    else{
     System.out.println("both are not equals"); 
    }
  }
}