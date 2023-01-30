//sum  of a,b with arguments and no parameters
import java.util.Scanner;
class practice12{
  int c;
  void display(int a,int b){
    c=a+b;
    System.out.println(c);
  }
}
class practice{
  public static void main(String args[]){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b");
    a=sc.nextInt();
    b=sc.nextInt();
    practice12 p=new practice12();
    p.display(a,b);
  }
}