import java.util.*;
class arraylistlin{
  public static void main(String args[]){
    
    	Scanner sc=new Scanner(System.in);
 	System.out.println("enter your size :");
 int n=sc.nextInt();
 
    ArrayList<Integer>alist=new ArrayList<Integer>();
   
      for(int i=0;i<n;i++){
            alist.add(sc.nextInt());
        }
     for(int i=0;i<alist.size();i++){
            System.out.print("\t"+alist.get(i));
        }
    System.out.println("\nenter your searching element");
	int ser=sc.nextInt(); 
	
    int c=0;
       for(int i:alist){
  
  
           if(i==ser){
               System.out.println("the element found");
               c=1;
               break;
           }
       }
       if(c==0){
           System.out.println("the element not found");
       }
	
  }
}
