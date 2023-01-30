// Q, Write a Java Program to enter Consumer Number , Consumer Name , Present Month Reading, Last Month Reading,
// Calculate Total units & Electricity bill and print the report.
// Note: Cost per unit is 3.80
 
// int cno,pmr,lmr,tu;
// String cname;
// float cbill;
 
 
// tu=pmr-lmr;
// cbill=tu*3.80;
 
// cno
// cname
// pmr
// lmr
// tu
// cbill


 import java.util.Scanner;
   class current1{
       float num,pmr,lmr,cost,ebill,total;
       String name;
      Scanner sc=new Scanner (System.in);
     void display(){
       System.out.println("enter name");
       name=sc.next();
       System.out.println("enter number");
       num=sc.nextFloat();
       System.out.println("enter present month bill");
       pmr=sc.nextFloat();
       System.out.println("enter last month bill");
       lmr=sc.nextFloat();
        System.out.println("enter cost");
      cost=sc.nextFloat();
       total=pmr-lmr;
       ebill=total*cost;
       System.out.println("the name"  +name);
       System.out.println("the number"  +num);
       System.out.println("the present month bill"  +pmr);
       System.out.println("the last month bill"  +lmr);
       System.out.println("the total units"  +total);
       System.out.println("the electricity bill"  +ebill);
       System.out.println("the charge of cost units "  +cost);
     }
   }
class current{
public static void main(String args[]){
  current1 c=new current1();
    c.display();
}
}
