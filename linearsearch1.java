import java.util.*;
class term{
   Scanner sc=new Scanner(System.in);
  void freq(int a[],int n){
   
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
  void freq1(int a[],int n){
    for(int i=0;i<n;i++){
      System.out.println(a[i]);
       }
  }
  void freq2(int a[],int n,int s){
    int i;
     
    for (i = 0; i < n; i++) {
 if (a[i] == s) {
 System.out.println("Element is Found at position " + (i + 1));
  break;
 }
    }
 if (i == n) {
 System.out.println("Element is Not Found");
 }
  }
  boolean freq3(int a[],int n,int s){
    int i;
     
    for (i = 0; i < n; i++) {
 if (a[i] == s) {
 System.out.println("Element is Found at position " + (i + 1));
  break;
 }
      return true;
    }
 if (i == n) {
 System.out.println("Element is Not Found");
 }
    return false;
    
  }
}


class linearsearch1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("searching");
    int s=sc.nextInt();
     System.out.println("size");
    int n=sc.nextInt();
     System.out.println("enter array");
    int a[]=new int[n];
   term t=new term();
    t.freq(a,n);
    t.freq1(a,n);
    t.freq2(a,n,s);
    boolean k= t.freq3(a,n,s);
    System.out.println(k);
    
  }
}