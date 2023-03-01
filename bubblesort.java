import java.util.*;
class test{
   Scanner sc=new Scanner(System.in);
  void kite(int a[],int n){
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
   void kite1(int a[],int n){
      System.out.println("before sorting");
    for(int i=0;i<n;i++){
    System.out.println(a[i]);
    }
  }
  void kite2(int a[],int n,int t){
    for(int i=0;i<n-1;i++){
       for(int j=0;j<n-1-i;j++){
         if(a[j]>a[j+1]){
           t=a[j];
           a[j]=a[j+1];
           a[j+1]=t;
         }
       }
     }
  }
  void kite3(int a[],int n){
      System.out.println("after sorting");
    for(int i=0;i<n;i++){
    
    System.out.println(a[i]);
    }
  }
      
}
class bubblesort{
  public static void main(String args[]){
      
    Scanner sc=new Scanner(System.in);
   int t=0;
     System.out.println("enter size");
    int n=sc.nextInt();
   System.out.println("enter array");
    int a[]=new int[n];
    test t1 =new test();
    t1.kite(a,n);
     t1.kite1(a,n);
     t1.kite2(a,n,t);
     t1.kite3(a,n);
  }
}
    