// with  arguments and with no parameters
// Q.  Write a Program for Swapping of Two number?
 
//        int a=10,b=20,t;
 
//            t=a;
//            a=b; 
//            b=t;
 
  
// Before Swapping:
// a=10
// b=20
// After Swapping:
// a=20
// b=10
  

import java.util.Scanner;
class swap{
    int a,b,temp;    
  void display(int a,int b)
  {
      
          System.out.println(" the value a before swapping" +a);
          System.out.println("the value b before swapping " +b);
          a=a+b;
          b=a-b;
           a=a-b;
     System.out.println(" the value a after swapping" +a);
          System.out.println("the value b after swapping " +b);
  }
}   
class swap3{
  public static void main(String args[])
  {
     int a,b,temp;
      Scanner sc=new Scanner(System.in);
    System.out.println("Enters the value a");
     a=sc.nextInt();
     System.out.println("Enters the value b");
     b=sc.nextInt();
    swap s=new swap();
    s.display(a,b);
  }
}