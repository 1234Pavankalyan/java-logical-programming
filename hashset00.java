//2. Write a program to remove all the duplicates from an ArrayList of Strings
import java.util.*;
class hashset00{
  public static void main(String args[]){
ArrayList<String>k=new  ArrayList<String>();
    k.add("a");
    k.add("a");
    k.add("ab");
    k.add("ab");
    k.add("abc");
    k.add("abc");
     k.add("abcD");
     k.add("abcT");
    System.out.println(k);
    System.out.println("first type to remove duplicate");
    HashSet<String>k2=new  HashSet<String>();
  k2.addAll(k);  
   System.out.println(k2);  
  System.out.println("second type to remove duplicate");
     HashSet<String>k22=new  HashSet<String>(k);
   ArrayList<String>k1=new  ArrayList<String>(k22);
  System.out.println(k1);
  }
}