import java.util.Scanner;
class big
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a");
      int a=sc.nextInt();
      System.out.println("enter b");
      int b=sc.nextInt();
      if(a>b)
      {
       System.out.println(" a is big"); 
      }
      else 
      {
       System.out.println(" b is big");  
      }
    }
  }