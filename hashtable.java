/*1 .Write a program to create a Hashtable of Integer, String type and add five key-value pairs to it. Then, use a for-each loop to print all the keys and values in the Hashtable.*/

import java.util.*;

public class Hashtable {
    public static void main(String[] args) {
       
  Hashtable<Integer, String> table=new Hashtable<Integer, String>();

       
        table.put(1, "");
        table.put(2, "Eggplant");
        table.put(3, "Carrot");
        table.put(4, "Mushroom");
        table.put(5, "Brocoli");

  
        for (Integer key:hashtable.keySet()) {
            System.out.println("Key:"+key +",Value:"+hashtable.get(key));
        }
    }
}