import java.util.Scanner;
class prime{
  public static void main(String args[])
  {
    int i=1,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number1");
     i=sc.nextInt();
     System.out.println("enter number2");
    int num=sc.nextInt();
   
    while (i<=num){
      if(num%i==0){
      count++;  
      }
      i++;
    }
    if(count==2){
      System.out.println("it is a prime number");
    }
    else{
       System.out.println("it is not a prime number");
    }
    
  }
}