//amstrong num
import java.util.Scanner;
class amstrong{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int temp=n;
    int count=0,rem,sum=0;
    while(temp>0){
       temp=temp/10;
      count++;
    }
    temp=n;
    while(temp>0){
      rem=temp%10;
     sum=sum+(int)(Math.pow(rem,count));
      temp=temp/10;
    }
    if (n==sum)
    {
      System.out.println("amstrong number"); 
    }
    else
      System.out.println("not a amstrong number"); 
  }
}