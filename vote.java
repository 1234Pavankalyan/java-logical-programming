import java.util.Scanner;
class vote
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter age");
      int age=sc.nextInt();
      if (age>18)
      {
       System.out.println("he/she is eligible"); 
      }
      else
      {
       System.out.println("he/she is not eligible");  
      }
    }
  }