//max-min of arrays
import java.util.Scanner;
class array5{
  public static void main(String args[]){
    int i,size,sum=0,max,min;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    size=sc.nextInt();
     System.out.println("enter array ");
    int a[]=new int[size];
    System.out.println("enter array elements ");
    for(i=0;i<size;i++){
      a[i]=sc.nextInt();
     
    }
     min=max=a[0];
    for(i=0;i<size;i++){
   if (a[i]>max){
     max=a[i];
   }
  if (a[i]<min){
    min=a[i];
    }
    }
    sum=max-min;
    System.out.println(max);
   System.out.println(min);
    System.out.println(sum);
  }
}