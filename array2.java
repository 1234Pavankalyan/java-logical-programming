import java.util.Scanner;
class array2{
  public static void main(String args[]){
    int i,size;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    size=sc.nextInt();
     System.out.println("enter array ");
    int a[]=new int[size];
    System.out.println("enter array elements ");
    for(i=0;i<size;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("the array elements are"); 
    for(i=0;i<size;i++){
      System.out.println(a[i]); 
  }
}
}