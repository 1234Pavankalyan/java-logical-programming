import java.util.Scanner;
class even2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int num=sc.nextInt();
      System.out.println("enter case");
       int case1=sc.nextInt();
      switch(case1){
        case 1:
          if (num%2==0){
            System.out.println("it is even");
          }
          else {
            System.out.println("it is odd");
          }
          break;
        default:
          System.out.println("it is invalid");
          
      }
    }
  }