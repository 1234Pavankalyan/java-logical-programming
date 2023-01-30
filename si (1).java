//write the si,total amount,ci
// with  argumuments and with no parameter 
import java.util.Scanner;
class si1{
  float si,p,t,r,totalamount,ci;
  Scanner sc=new Scanner(System.in);
  void display(){
   System.out.println("enter p");
    p=sc.nextFloat();
    System.out.println("enter t");
    t=sc.nextFloat();
    System.out.println("enter r");
    r=sc.nextFloat();
    si=(p*t*r)/(100);
    totalamount=p+si;
    ci=p-si;
     System.out.println(si);
     System.out.println(totalamount);
    System.out.println(ci); 
  }
}
class si{
  public static void main(String args[]){
    si1 s=new si1();
    s.display();
  }
}