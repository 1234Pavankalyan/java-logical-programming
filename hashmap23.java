/*3.Write a program to create a HashMap of String, Integer type and add ten key-value pairs to it. Then, use a for-each loop to print all the keys and values in the HashMap. */
import java.util.*;

public class hashMap {
  public static void main(String[] args) {
    
    HashMap<String, Integer> Map = new HashMap<String, Integer>();

    
   Map.put("kavya", 25);
  Map.put("anju", 35);
   Map.put("manj", 31);
    Map.put("jata", 32);
    Map.put("jilla", 27);
   Map.put("Saikumar", 22);
  Map.put("Sir", 20);
Map.put("manoj", 21);
Map.put("jumar", 29);
    Map.put("vidya", 23);

    
    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      String key=entry.getKey();
      Integer value=entry.getValue();
      System.out.println("Key:"+ key +",Value:"+value);
    }
  }
}