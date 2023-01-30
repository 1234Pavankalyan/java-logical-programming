import java.util.Scanner;
class scan{
  public static void main(String args[]){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the integer a");
    a=sc.nextInt();
      System.out.println("enter the integer b");
    b=sc.nextInt();
    System.out.println("the integer value1 " +a);
    System.out.println("the integer value2 " +b);
    System.out.println("the addition integer values " +a+ "and" +b+ "is" +"  " +(a+b));
  }
}