import java.util.*;
class hashset1{
  public static void main(String args[]){
    HashSet <String>k=new HashSet <String>();
    k.add("art");
        k.add("java");
    k.add("phyton");
    k.add("sql");
    k.add("html");
    k.add("css");
    System.out.println(k);
      System.out.println("after removing css");
k.remove("css");
        System.out.println(k);
      System.out.println("checking it has html or not");
     Boolean h=k.contains("html");
    System.out.println(h);
          System.out.println("after clearing");
   k.clear();
      System.out.println(k);
  }
}