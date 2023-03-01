import java.util.*;
class hashset{
  public static void main(String args[]){
    HashSet<String> k=new HashSet<String>();
    k.add("ajay");
        k.add("ajay");

        k.add("aryan");

        k.add("vidya");
    k.add("rakesh");
    k.add("aryan");
    Iterator<String>itr=k.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }

    
  }
}