//write the si,total amount,ci
// with  argumuments and with no parameter 
import java.util.Scanner;
class si6{
  float si,totalamount,ci;
  
  void display(float p,float t,float r){
    si=(p*t*r)/(100);
    totalamount=p+si;
    ci=p-si;
     System.out.println(si);
     System.out.println(totalamount);
    System.out.println(ci); 
  }
}
class si1{
  public static void main(String args[]){
     float si,p,t,r,totalamount,ci;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter p");
    p=sc.nextFloat();
    System.out.println("enter t");
    t=sc.nextFloat();
    System.out.println("enter r");
    r=sc.nextFloat();
    si6 s=new si6();
    s.display(p,t,r);
  }
}