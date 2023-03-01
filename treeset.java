/*treeset*/
import java.util.*;
class treeset{
  public static void main(String args[]){
    TreeSet<String>k=new  TreeSet<String>();
        k.add("anushka");
    k.add("prabhas");
 k.add("rana");
        k.add("ramya");
    k.add("rajmouli");
    System.out.println("before clearing");
    System.out.println(k);
 System.out.println("removing ramya");
   k.remove("ramya");
   System.out.println(k); 
    if(k.contains("prabhas")){
      System.out.println("prabhas is found");
    }
    else{
      System.out.println("prabhas is found"); 
    }
    System.out.println("print first and last");
  
      System.out.println(  k.first());
    
      System.out.println(  k.last());
    
      System.out.println(k);
  }
}