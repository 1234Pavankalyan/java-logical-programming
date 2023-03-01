import java.util.*;
class linkedhash{
  public static void main(String args[]){
    LinkedHashSet<String>n=new  LinkedHashSet<String>();
    n.add("pavan");
     n.add("aryan");
     n.add("kalyan");
     n.add("kavitha");
     n.add("vidya");
     n.add("shetty");
    System.out.println("before clearing");
    System.out.println(n);
     System.out.println("after clearing kavitha");
  n.remove("kavitha");
     System.out.println(n);
    System.out.println("checking shetty");
  boolean k= n.contains("shetty");
    System.out.println(k);
    System.out.println("after clearing");
    n.clear();
     System.out.println(n);
    
    
  }
}