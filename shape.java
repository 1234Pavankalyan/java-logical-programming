//Create a program that uses a switch case statement to determine the area of a shape based on the shape's name in JAVA.
import java.util.*;
class area1{
void shape1(){
  int l,b;
  double area;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter shape");
  String shape=sc.next();
   System.out.println("enter length");
   l=sc.nextInt();
   System.out.println("enter  breadth");
   b=sc.nextInt();
  System.out.println("enter radius");
  float r=sc.nextFloat();
  System.out.println("enter  side");
  int  s=sc.nextInt();
  
switch(shape){
  case "rectangle":  
   area=(l*b);
    System.out.println("the rectangle area is" +area);
   break;
  case "square":
   area=(s*s);
    System.out.println("the square area is" +area);
   break ;
  case "triangle":
   area=(0.5*l*b);
    System.out.println("the triangle area is" +area);
   break;
  case "circle":
   area=(3.14*r*r);
    System.out.println("the circle area is" +area);
   break;
  default:
    System.out.println("invalid input");
}
}
}
class shape{
  public static void main(String args[]){
    area1 a=new area1();
    a.shape1();
  }
}