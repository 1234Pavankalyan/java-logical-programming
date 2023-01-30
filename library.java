// This program takes the day of the week and the current time as input and uses nested if statements to check if the library is open. If the day is not Saturday or Sunday and the current time is between 9:00 AM and 8:00 PM, it will print "The library is open." Otherwise, it will print "The library is closed."
// inputs:
//         ----> day: Monday
//        ----> Time: 11:00
// output:
//            Library is open 
          
// inputs:
//         ----> day: Sunday
//        ----> Time: 11:00AM
 
// output:
//            Library is Closed
import java.util.Scanner;
class library{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter week day");
    int day=sc.nextInt();
     System.out.println("enter TIME");
    int time=sc.nextInt();
   if(time>=9&&time<=21){
    if(day==1){
      System.out.println("it is sunday");
       System.out.println("library is closed");
    }
   else if(day==2){
      System.out.println("it is monday");
      System.out.println("library is open from 9.00am to 8.00pm");
    }
     else if(day==3){
      System.out.println("it is tuesday");
        System.out.println("library is open from 9.00am to 8.00pm");
    }
     else if(day==4){
      System.out.println("it is wednesday");
        System.out.println("library is open from 9.00am to 8.00pm");
    }
     else if(day==5){
      System.out.println("it is thursday");
        System.out.println("library is open from 9.00am to 8.00pm");
    }
     else if(day==6){
      System.out.println("it is friday");
        System.out.println("library is open from 9.00am to 8.00pm");
    }
     else if(day==7){
      System.out.println("it is saturday");
        System.out.println("library is closed");
    }
    else{
       System.out.println("It is not the right time & day to enter in library");
    }
  }
}
}