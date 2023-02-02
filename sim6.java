import java.util.Scanner;
class sim6{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int fact=1;
    int i1=sc.nextInt();
    int n=sc.nextInt();
    while (i1<=n){
       fact=fact*i1;
     
      i1++;
    }  
    System.out.println(fact);
  }
}