import java.util.Scanner;
class sim3{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int sum=0;
    int i1=sc.nextInt();
    int n=sc.nextInt();
    while (i1<=n){
       sum=sum+i1;
      System.out.println(sum);
      i1++;
    }  
   
  }
}