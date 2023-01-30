// Create a program that prompts the user for a day of the week, and then prints out whether it is a weekday or a weekend using conditional statements.
import java.util.Scanner;
class days{
  String day;
  Scanner sc=new Scanner(System.in);
  void mon(String day){
   day=sc.next();
    System.out.println("it is week day" +" "+day);
  }
  void tues(String day){
   day=sc.next();
    System.out.println("it is week day"  +" "+day);
  }
  void wed(String day){
   day=sc.next();
    System.out.println("it is week day" +" "+day);
  }
  void thur(String day){
   day=sc.next();
    System.out.println("it is week day" +" " +day);
  }
  void fri(String day){
   day=sc.next();
    System.out.println("it is week day" +" "+day);
  }
  void sat(String day){
   day=sc.next();
    System.out.println("it is weekend day" +" "+day);
  }
  void sun(String day){
   day=sc.next();
    System.out.println("it is weekend day" +" "+day);
  }
}
class week2{
  public static void main(String args[]){
    days d=new days();
    
    d.mon("monday");
    d.tues("tuesday");
    d.wed("wednesday");
    d.thur("thursday");
    d.fri("friday");
    d.sat("saturday");
    d.sun("sunday");  
  }
}