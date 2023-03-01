import java.util.*;
class linkedlist{
  public static void main(String args[]){
  LinkedList<String>alist=new LinkedList<String>();
    alist.add("a");
    alist.add("b");
    alist.add(1,"c");
    System.out.println(alist);
    System.out.println("iterator");
    Iterator i=alist.iterator();
    while(i.hasNext()){
       System.out.println(i.next());
  }
    System.out.println("afer get    " + alist.get(0));
    
    
    System.out.println("afer setting a to u");
    
    alist.set(0,"u");
     System.out.println(alist);
     System.out.println("using for each loop");
    for(String k:alist)
      System.out.println(k);
     
     System.out.println("using for each loop");
    for(int m=0;m<alist.size();m++)
      System.out.println(alist.get(m));
    alist.remove("u");
    
    System.out.println(alist);
    alist.remove(0);
    
    System.out.println(alist);
    
   
  }
}