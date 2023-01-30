//Create a program that uses a switch case statement to determine the number of days in a month based on the month number.


import java.util.Scanner;
class month{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter day number");
    int day=sc.nextInt();
    System.out.println("enter choice");
    int choice=sc.nextInt();
    switch(choice){
      case 1:
        if (day==31){
        System.out.println("it is january");
           System.out.println("it is march");
           System.out.println("it is may");
         System.out.println("it is july");
          System.out.println("it is august");
           System.out.println("it is october");
           System.out.println("it is december");  
        }
        break;
        case 2:
        if (day==28){
        System.out.println("it is february");
        }
        break;
        case 3:
         if (day==30){
        System.out.println("it is april");
        System.out.println("it is june");
        System.out.println("it is september");
         System.out.println("it is november ");
        }
        break;
        default :
          System.out.println("invalid month");
    }
  }
}