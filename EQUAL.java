import java.util.Scanner;
class EQUAL {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a");
    int a = sc.nextInt();
    System.out.println("enter b");
    int b = sc.nextInt();
    System.out.println("enter c");
    int c = sc.nextInt();
    if (a==b) {
      if (a==c)
      {
        System.out.println("all are equal;");
      } else
      {
        System.out.println("not equal to c");
      }
    }
    else
    {
      System.out.println("invalid input");  
    }
  }
}