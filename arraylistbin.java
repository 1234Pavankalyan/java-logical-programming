//print array list by using binary search
import java.util.*;
class arraylistbin{
  public static void main(String args[]){
 
    Scanner sc=new Scanner(System.in);
      int b,l,m,c=0; 
	
 	System.out.println("enter your size :");
           int n=sc.nextInt();
 
    ArrayList<Integer>alist=new ArrayList<Integer>();
   
      for(int i=0;i<n;i++){
            alist.add(sc.nextInt());
      }
    System.out.println(alist);
 System.out.println("\nenter your searching element");
	int ser=sc.nextInt();
      b=0;
    l=alist.size()-1;
    m=(b+l)/2;
  
    while(b<=l){
    if(alist.get(m)<ser){
      b=m+1;
    }
    else if(alist.get(m)==ser){
    System.out.println("element is found at position " +m);
     c=1;
      break;
    }
      
    else{
      l=m-1;
      }
    m=(b+l)/2;
    }
    if(c==0)
      System.out.println("element is not found");
    
    }
   
}