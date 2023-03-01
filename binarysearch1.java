import java.util.*;
class binar{
  Scanner sc=new Scanner(System.in);
  void kite(int a[],int n){
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
   void kite1(int a[],int n){
    for(int i=0;i<n;i++){
    System.out.println(a[i]);
    }
  }
  void kite2(int b,int l,int m,int s,int a[],int n){
  
  while(b<=l){
    if(a[m]<s){
      b=m+1;
    }
    else if(a[m]==s){
    System.out.println("element is found at position " +m);
     
      break;
    }
    else{
      l=m-1;
      }
    m=(b+l)/2;
  }
    if(b>=l){
      System.out.println("element is not found");
    }
  } 
}

class binarysearch1{
  public static void main(String args[]){
    int b,l,m;
    Scanner sc=new Scanner(System.in);
   
     System.out.println("enter size");
    int n=sc.nextInt();
   System.out.println("enter array");
    int a[]=new int[n];
       System.out.println("enter SEARCH");
    int s=sc.nextInt();
     
    binar b1=new binar();
    b1.kite(a,n);
    b1.kite1(a,n);
    b=0;
    l=a.length-1;
    m=(b+l)/2;
    b1.kite2(b,l,m,s,a,n);
  }
}