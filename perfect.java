//with no parameter and no return
//Write a program to check if a given number is a perfect square or not.
import java.util.Scanner;
class per{
  double res;
  Scanner sc=new Scanner(System.in);
 
  void resu()
  {
     System.out.println("enter a");
    int a=sc.nextInt();
   double res=Math.sqrt(a) ;
    if (res*res==a){
      System.out.println("it is a perect number");
     
    }
    else
      System.out.println("it is not a perect number");
    
  }
}
class perfect{
  public static void main(String args[]){
    per e=new per();
    e.resu(); 
  }
}