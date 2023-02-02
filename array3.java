//sum of arrays
import java.util.Scanner;
class array3{
  public static void main(String args[]){
    int i,size,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    size=sc.nextInt();
     System.out.println("enter array ");
    int a[]=new int[size];
    System.out.println("enter array elements ");
    for(i=0;i<size;i++){
      a[i]=sc.nextInt();
     
    }
    System.out.println("the sum of array elements are"); 
    for(i=0;i<size;i++)
    {
       sum=sum+a[i];
     
  }
      
     System.out.println(sum);
  }
}