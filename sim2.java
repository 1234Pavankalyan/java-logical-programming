import java.util.Scanner;
class sim2{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int i=sc.nextInt();
    int n=sc.nextInt();
   i=1;
    while(i<=n){
      System.out.print("\t"+i);
      i++;
    }
  }
}