//with no parameter with no arguments
import java.util.Scanner;
class Sphere{
  double area,r;
  void area12()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter radius r");
    r=sc.nextDouble();
    area =3.14*r*r;
    System.out.println(area);
  }
}
class circle1{
  public static void main(String args[]){
   Sphere s=new Sphere();
    s.area12();
  }
}