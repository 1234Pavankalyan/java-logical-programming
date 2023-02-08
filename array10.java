//sorting of an array
import java .util.*;
class array10{
  public static void main(String args[]){
    int t;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int n=sc.nextInt();
    System.out.println("enter array");
    int a[]=new int[n];
   System.out.println( "enter array elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
     System.out.println("the elements before sorting are ");
    for(int i=0;i<n;i++){
     
      System.out.println("\t" +a[i]);
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n-1;j++){
        if(a[j]>a[j+1]){
          t=a[j];
          a[j]=a[j+1];
          a[j+1]=t;
        }
      }
    }
    System.out.println("the elements after sorting are ");
    for(int i=0;i<n;i++){
      
      System.out.println("\t" +a[i]);
    }
  }
}