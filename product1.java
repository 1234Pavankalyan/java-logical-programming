// with  arguments and no parameter
// Q. Write a Program to Enter Product Number, Product Name, Product Cost, Product Quantity, calculate Bill Amout and print the report?

import java.util.Scanner;
class bill{
    float pnumber,pcost,pquantity,pbill;
    String pname; 
  void display(float pcost,float pquantity)
  {
    pbill=pcost*pquantity;
     System.out.println("the report");
   System.out.println("the bill" +pbill);
    System.out.println("th pname" +pname);
  System.out.println("the pnumber" +pnumber);
  System.out.println("the pquantity" +pquantity);
    System.out.println("the pcost" +pcost);
  }
}
class product1{
  public static void main(String args[]){
    float pnumber,pcost,pquantity,pbill;
    String pname;
     Scanner sc=new Scanner(System.in);
    System.out.println("enter pnumber");
    pnumber=sc.nextFloat();
    System.out.println("enter pcost");
    pcost=sc.nextFloat();
    System.out.println("enter pquantity");
    pquantity=sc.nextFloat();
    System.out.println("enter pname");
    pname=sc.next();
  bill b=new bill();
    b.display(pcost,pquantity);
}
}