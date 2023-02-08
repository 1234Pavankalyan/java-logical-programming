//no return & no arguement
import java.util.Scanner;
class array{
  Scanner sc=new Scanner(System.in);
  void arr(){
    System.out.println("enter size");
    int n=sc.nextInt();
    System.out.println("enter array");
    int a[]=new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
     System.out.println("the  array elements are");
    for(int i=0;i<n;i++){
       System.out.println(a[i]);
    }
  }
}
class array13{
  public static void main(String args[]){
    array a=new array();
    a.arr();
  }
}