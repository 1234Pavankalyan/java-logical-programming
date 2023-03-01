import java.util.*;
class test{
   Scanner sc=new Scanner(System.in);
  void white(int a[],int n){
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
   void white1(int a[],int n){
      System.out.println("before sorting");
    for(int i=0;i<n;i++){
    System.out.println(a[i]);
    }
  }
  void white2(int a[],int n,int t){
    for(int i=0;i<n-1;i++){
       for(int j=i+1;j<n;j++){
         if(a[i]>a[j]){
           t=a[i];
           a[i]=a[j];
           a[j]=t;
         }
       }
     }
  }
  void white3(int a[],int n){
      System.out.println("after sorting");
    for(int i=0;i<n;i++){
    
    System.out.println(a[i]);
    }
  }
      
}
class selection{
  public static void main(String args[]){
      
    Scanner sc=new Scanner(System.in);
   int t=0;
     System.out.println("enter size");
    int n=sc.nextInt();
   System.out.println("enter array");
    int a[]=new int[n];
    test t1 =new test();
    t1.white(a,n);
     t1.white1(a,n);
     t1.white2(a,n,t);
     t1.white3(a,n);
  }
}
    