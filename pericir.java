import java.util.Scanner;
class peri{
  double peri;
  void display(double pi,double r){
    peri =2*pi*r;
    System.out.println("the perimeter of circle " +peri);
  }
}
class pericir{
  public static void main(String args[]){
    double peri,pi,r;
    Scanner sc=new Scanner(System.in);
    System.out.println("the pi value of circle");
    pi=sc.nextDouble();
        System.out.println("the r value of circle");
    r=sc.nextDouble();
    peri p=new peri();
    p.display(pi,r);
  }
}