//with parameter with out return
import java.util.*;
class array{
  void arr(int x[]){
    int n,i;
    System.out.println("the  array elements are");
    for(i=0;i<x.length;i++){
       System.out.println(x[i]);
    }
  }
}
class array14{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size");
    int n=sc.nextInt();
    System.out.println("enter array");
    int a[]=new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      }
     array a1=new array();
    a1.arr(a);
  }
}