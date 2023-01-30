import java.util.Scanner;
class equal
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a");
     int  a=sc.nextInt();
      System.out.println("enter b");
     int b=sc.nextInt();
      System.out.println("enter c");
     int c=sc.nextInt();
      if(a==b&&b==c&&c==a)
      {
       System.out.println("all variables are equal");  
      }
      else
      {
       System.out.println("all variables are not equal"); 
      }
    }
  }