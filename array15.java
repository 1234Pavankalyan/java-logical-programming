//with return & with parameter
import java.util.Scanner;
class array{
  int[] arr(int x[]){
    int m[]=new int[x.length];
      for(int i=0;i<x.length;i++){
        m[i]=x[i];
      }
    return m;
  }
}
  class array15{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int n=sc.nextInt();
   
    int a[]=new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
      array h=new  array();
   int   k[]=h.arr(a);
      System.out.println("the entered array elements");
      for(int i=0;i<n;i++){
       System.out.println(k[i]);
    }
    }
  }

  