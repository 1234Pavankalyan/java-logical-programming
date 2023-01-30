import java.util.*;
class periscan{
  public static void main(String args[]){
    float r;
    double peri ;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius");
    r=sc.nextFloat();
    peri=(3.14*2*r);
    System.out.println("the perimeter of circle is " +peri);
  }
}