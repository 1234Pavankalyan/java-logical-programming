import java.util.Scanner;
class swap2{
  public static void main(String args[]){
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a");
    a=sc.nextInt();
    System.out.println("enter b");
    b=sc.nextInt();
    System.out.println("the value  a before swaping" +a);
    System.out.println("the value of b before swaping" +b);
    a=a+b;
    b=a-b;
    a=a-b;
     System.out.println("the value  a after swaping" +a);
    System.out.println("the value of b after swaping" +b);
  }
}