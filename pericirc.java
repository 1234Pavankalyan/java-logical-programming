
 // with no arguements and with no parameter find the perimeter of circle
import java.util.Scanner;
class peri1{
  double pi,r,peri;
   Scanner sc=new Scanner(System.in);
  void display()
  {
   System.out.println("enter pi");
    pi=sc.nextDouble();
    System.out.println("enter r");
    r=sc.nextDouble();
    peri=2*pi*r;
    System.out.println(peri);
  }
}
class pericir{
  public static void main(String args[]){
    peri1 p=new peri1();
    p.display();
  }
}