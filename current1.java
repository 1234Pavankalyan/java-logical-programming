//Q, Write a Java Program to enter Consumer Number , Consumer Name , Present Month Reading, Last Month Reading,
//Calculate Total units & Electricity bill and print the report. 

//    1-50          ------->   1.45
//    51-100      ------>     2.56
//    100-200    ------->    3.50
//    200-300   -------->   4.67
//    above 300 -------->  5.67
 
  import java.util.Scanner;
   class current1{
     public static void main(String args[]){
       float num,pmr,lmr,total;
       String name;
       double ebill;
       Scanner sc=new Scanner (System.in);
       System.out.println("enter name");
       name=sc.next();
       System.out.println("enter number");
       num=sc.nextFloat();
       System.out.println("enter present month bill");
       pmr=sc.nextFloat();
       System.out.println("enter last month bill");
       lmr=sc.nextFloat();
       total=pmr-lmr;
       if(total<=50){
      ebill=(total*1.45);
      System.out.println("the electricity bill is :"+ebill);
    }
     else if(total<=100){
      ebill=((50*1.45)+((total-50)*2.56));
      System.out.println("the electricity bill is :"+ebill);
     }
     else if(total<=200)
     {
      ebill=((50*1.45)+(100*2.56)+(total-100)*3.50);
     System.out.println("the electricity bill is :"+ebill);
     }
       else if(total<=300)
     {
      ebill=(50*1.45)+(100*2.56)+(200*3.50)+(total-200)*4.67;
     System.out.println("the electricity bill is :"+ebill);
     }
    else{
      ebill=(50*1.45)+(100*2.56)+(200*3.50)+(300*4.67)+(total-300)*5.67;
      System.out.println("the electricity bill is :"+ebill);
    } 
       System.out.println("the name"  +name);
       System.out.println("the number"  +num);
       System.out.println("the present month bill"  +pmr);
       System.out.println("the last month bill"  +lmr);
       System.out.println("the total units"  +total);
       System.out.println("the electricity bill"  +ebill);
     }
   }