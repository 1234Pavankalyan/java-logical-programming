import java.util.*;
class test{
  Scanner sc=new Scanner(System.in);
  void kite(int a[],int n){
    
    for (int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
   void kite1(int a[],int n){
    System.out.println("the array elements before sorting");
    for (int i=0;i<n;i++){
     System.out.println(a[i]); 
    }
  }
  void kite2(int a[],int n){
    int t=0;
    for(int i=1;i<=n-1;i++){
      for(int j=i;j>0&&a[j-1]>a[j];j--){
        t=a[j];
        a[j]=a[j-1];
        a[j-1]=t;
      }
    }
  }
  void kite3(int a[],int n){
    System.out.println("the array elements after sorting");
    for (int i=0;i<n;i++){
     System.out.println(a[i]); 
    }
  } 
}
class insertion1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("the array size");
    int n=sc.nextInt();
     System.out.println("the array");
    int a[]=new int[n];
    test t=new test();
    t.kite(a,n);
     t.kite1(a,n);
     t.kite2(a,n);
     t.kite3(a,n);
  }
}