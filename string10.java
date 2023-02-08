//buffer class
import java.util.Scanner;
class string10{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("enter string1");
    String s=sc.nextLine();
    StringBuffer st1=new StringBuffer();
    StringBuffer st2=new StringBuffer(s);
    System.out.println(st1);

 System.out.println("The Default Capacity is:"+st1.capacity());
 System.out.println("The Capacity of St2:"+st2.capacity());
    System.out.println("The Given String 2 is:"+st2);
    System.out.println("The Reverse of the given String is:"+st2.reverse());
  }
}

