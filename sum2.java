//94.write a java program to print sum of first and last digit.
import java.util.*;
class sum2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num");
    int num=sc.nextInt();
   int rem=num%10;
    int sum=0,n1,first;
    while(num>=9)
    {
       num=num/10;
    }
   first=num;
     sum=first+rem;
    System.out.println(sum);
  }
}