//linear search

import java.util.Scanner;
class array6{
  public static void main(String args[]){
    int i,size,index=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    size=sc.nextInt();
     System.out.println("enter array ");
    int a[]=new int[size];
    System.out.println("enter array elements ");
    for(i=0;i<size;i++){
      a[i]=sc.nextInt();
    }
     System.out.println("enter array element to search");
   int search=sc.nextInt();
    for(i=0;i<size;i++){
      if(search==a[i]){
        System.out.println("element found");
      }
      else{
         System.out.println("element not found");
      }
    }
  }
}