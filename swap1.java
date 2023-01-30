import java.util.Scanner;
class swap1{
  public static void main(String args[]){
    int a,b,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enters the value a");
     a=sc.nextInt();
     System.out.println("Enters the value b");
     b=sc.nextInt();
          System.out.println(" the value a before swapping" +a);
          System.out.println("the value b before swapping " +b);
           temp=a;
           a=b;
           b=temp;
     System.out.println(" the value a after swapping" +a);
          System.out.println("the value b after swapping " +b);
  }
}