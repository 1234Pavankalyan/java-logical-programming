import java.util.*;
class circlescan{
  public static void main(String args[]){
    float r;
    double area ;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius");
    r=sc.nextFloat();
    area=(3.14*r*r);
    System.out.println("the radius of circle is " +area);
  }
}