//Write a program to find the roots of a quadratic equation.

import java.util.Scanner;
class equa{
  int res;
  int resu(int a,int b,int c)
  {
    res=Math.Sqrt(b*b-4*a*c);
    return res;
  }
}
class equation{
  public static void main(String args[]){
    int a,b,c,q;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b,c");
    a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
    equa e=new equa();
    q=e.resu(a,b,c);
    System.out.println("the result is" +q);
  }
}