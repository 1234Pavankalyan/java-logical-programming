//with parameter and with return
//Write a program to check if a given number is a perfect square or not.
import java.util.Scanner;
class perf{
  double res;
  Scanner sc=new Scanner(System.in);
 
  double resu(double a)
  {
     
   double res=Math.sqrt(a) ;
     if (res*res==a){
      System.out.println("it is a perect number");
    }
    else
      System.out.println("it is not a perect number");
    return res;   
  }
}
class perfect1{
  public static void main(String args[]){
    double q;
    double res;
    Scanner sc=new Scanner(System.in);
         System.out.println("enter a");
    double a=sc.nextDouble();
    res=Math.sqrt(a) ;
    perf e=new perf();
   q= e.resu(a);
   System.out.println("the square root of"  +q); 
  }
}