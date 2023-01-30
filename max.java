import java.util.Scanner;
class max{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b,c");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if (a>b){
      System.out.println("a is big");
    }
    if(b>c){
     System.out.println("b is big"); 
    }
    if(c>a){
     System.out.println("c is big"); 
    }
  }
}