//number of digits in a number
import java.util.Scanner;
class digits{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
    int num=sc.nextInt();
    int i=1;
    int count=0;
      while(i<=num){
      num=num/10;
      count++;
      }
     System.out.println("the count is"  +count);
  }
}