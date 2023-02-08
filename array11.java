// removing duplicate elements in the array elements

import java .util.*;
class array11{
  public static void main(String args[]){
    int j=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int n=sc.nextInt();
    System.out.println("enter array");
    int a[]=new int[n];
   System.out.println( "enter array elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
     System.out.println( "the  array elements are");
    for(int i=0;i<n;i++){
     
      System.out.println("\t" +a[i]);
    }
   
    for(int i=0;i<n-1;i++){
     
       if(a[j]!=a[i])
       {
         a[++j]=a[i];
       }
        
    }
      
    
   System.out.println( "after removing duplicate elements in the array elements are");
    for(int i=0;i<=j;i++){
      
      System.out.println (a[i]);
    }
    
  }
}