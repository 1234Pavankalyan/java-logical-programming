// Create a program that prompts the user for a day of the week, and then prints out whether it is a weekday or a weekend using conditional statements.
import java.util.Scanner;
class days{
  String day;
  Scanner sc=new Scanner(System.in);
  void display(){
     System.out.println("enter week day");
  day=sc.next();
     switch(day){
      case "monday":
        System.out.println("weekday it is monday");
        break;
        case "tuesday":
        System.out.println("weeekday it is tuesday");
        break;
        case "wednesday":
        System.out.println("weeekdayit is wednesday");
        break;
        case "thursday":
        System.out.println("weeekdayit is thursday");
        break;
        case "friday":
        System.out.println("weeekday it is friday");
        break;
        case "saturday":
        System.out.println("week end it is saturday");
        break;
        case "sunday":
        System.out.println("week end it is sunday");
        break;
        default :
          System.out.println("invalid day");
    }
  }
}
class week4{
  public static void main(String args[])
  {
    days d=new days();
    d.display();
   
  }
}