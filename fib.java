import java.util.Scanner;
class fib{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number");
  int num=sc.nextInt();
  int sum=0,sum2=0;
  
  for (int i=1;i<=num;i++){
   int sum1=sum+num; 
    sum=num;
    num=sum1;
    System.out.println(sum1); 
  }  
 
}
}