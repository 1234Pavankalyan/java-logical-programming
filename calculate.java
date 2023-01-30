import java.util.Scanner;
class add{
  int a,b,c;
  void addition()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a");
    a=sc.nextInt();
     System.out.println("enter b");
    b=sc.nextInt();
    c=a+b;
     System.out.println("the addition is" +c);
  }
}
class calculate{
  public static void main(String args[]){
    sum s=new sum();
    s.addition();
  }
}