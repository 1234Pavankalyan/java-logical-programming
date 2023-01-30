//Create a class that simulates a simple calculator, with methods for addition, subtraction, multiplication, and division.
import java.util.*;
class simplecalculator{
  Scanner sc=new Scanner(System.in);
 int add;
  int sub;
  int mul;
  float div;
  float remainder;
  void display(){
  System.out.println("enter number one");
    int num1=sc.nextInt();
    System.out.println("enter number two");
    int num2=sc.nextInt();
  }
    void add(int num1,int num2)
  {
      int add=num1+num2;
    System.out.println("the addition" +add);
    }
   void sub(int num1,int num2)
  {
      int sub=num1+num2;
    System.out.println("the subraction" +sub);
    }
  void mul(int num1,int num2)
  {
      int mul=num1*num2;
    System.out.println("the multiplication" +mul);
    }
  void rem(int num1,int num2)
  {
      float rem=num1%num2;
    System.out.println("the remainder" +rem);
    }
  void div(int num1,int num2)
  {
      float div=num1/num2;
    System.out.println("the division" +div);
    }
}
class calculator1{
  public static void main(String args[]){
    simplecalculator s=new simplecalculator();
      s.add(10,20);
      s.sub(20,10);
       s.mul(2,3);
      s.div(6,2);
       s.rem(9,3);
  }
}