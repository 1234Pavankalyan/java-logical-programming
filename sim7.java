import java.util.Scanner;
class sim7{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number1");
    int n1=sc.nextInt();
    int fact=1;
    int i=sc.nextInt();
    while (i>=n1){
      fact=fact*i;
    
      i--;
    }
      System.out.println(fact);
  }
}