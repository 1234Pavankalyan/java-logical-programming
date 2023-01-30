//with no arguements and with no parameter
import java.util.Scanner;
class rec{
  double l,b,area,peri;
   Scanner sc=new Scanner(System.in);
  void display()
  {
    System.out.println("enter l and b");
    l=sc.nextDouble();
    b=sc.nextDouble();
    area =l*b;
    System.out.println(area);
  }
   void display1()
  {
    System.out.println("enter l and b");
    l=sc.nextDouble();
    b=sc.nextDouble();
    peri =2*(l+b);
    System.out.println(peri);
  }
}
class rect1{
  public static void main(String args[]){
    rec r=new rec();
    r.display();
    r.display1();
  }
}