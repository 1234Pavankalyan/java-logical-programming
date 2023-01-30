// Write a program that takes a temperature as input and prints out whether it is above or below freezing, as well as whether it is above or below boiling,
// using nested if statements.
import java.util.Scanner;
class temp12{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in); 
    System.out.println("enter temperature");
    float temp=sc.nextFloat();
    if (temp>=100)
    {
      System.out.println("it is boiling");
    }
    else if(temp<0)
    {
       System.out.println("it is freezing");
    }
    else
    {
       System.out.println("it is moderate temperature");
    }
}
}