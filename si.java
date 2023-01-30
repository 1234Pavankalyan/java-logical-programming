import java.util.Scanner;
class si{
  public static void main(String args[]){
    float p,t,r,si,totalamount,ci;
    Scanner sc=new Scanner(System.in);
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