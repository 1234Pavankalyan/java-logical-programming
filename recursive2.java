import java.util.*;
class recur{
   int fact(int n){
     if(n==1)
       return 1;
     else
       return n*fact(n-1);
   }
}
class recursive2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    recur r=new recur();
    int k=r.fact(n);
    System.out.println("the factorial of    " +n+   "     is     "   +k);
  }
}