import java.util.Scanner;
class rect{
  double area;
  double peri;
  void area12(double l,double b)
  {
    area=l*b;
    System.out.println("the area of rectangle" +area);
  }
   void peri12(double l,double b)
  {
    peri=2*(l+b);
    System.out.println("the perimeter of rectangle" +peri);
  }
}
class rectangle{
  public static void main(String args[]){
    double l,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter l,b");
    l=sc.nextDouble();
    b=sc.nextDouble();
    rect r=new rect();
    r.area12(l,b);
    r.peri12(l,b);
  }
}