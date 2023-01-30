// with no arguments and with no parameter
//write employee name and employee detaills,salary
import java.util.Scanner;
class employe{
   int a;
    String s;
    double d;
    Scanner sc= new Scanner(System.in);
  void display(){
    System.out.println("enter employee name");
     System.out.println("enter employee salary");
     System.out.println("enter employee id");
    s=sc.next();
    d=sc.nextDouble();
    a=sc.nextInt();
     System.out.println("enter employee name is " +s);
     System.out.println("enter employee salary is " +d);
     System.out.println("enter employee id is " +a);
    System.out.println("the employee name is " +s  +" " +"salary is" +d +" " +"id is" +a);
  }
}
class employee{
  public static void main(String args[]){
    employe e=new employe();
    e.display();
  }
}