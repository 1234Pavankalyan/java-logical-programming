7./*.Write a program to create a TreeMap of String, Integer type and add five key-value pairs to it. Then, use a for-each loop to print all the keys and values in the TreeMap.*/

import java.util.*;

public class treeMap12{
    public static void main(String[] args) {
       
        TreeMap<String, Integer> Map=new TreeMap<String, Integer>();

     Map.put("Nagendra", 24);
      Map.put("Koti", 26);
      Map.put("Rajesh", 30);
     Map.put("Swamy", 22);
      Map.put("Suresh", 32);

        
        for (String key:Map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + Map.get(key));
        }
    }
}