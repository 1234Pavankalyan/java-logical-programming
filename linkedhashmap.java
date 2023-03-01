import java.util.LinkedHashMap;
import java.util.*;
class linkedhashmap{
  public static void main(String args[]){
    LinkedHashMap<String ,Integer>link=new LinkedHashMap<String ,Integer>();
    link.put("arjun",896);
     link.put("aryan",899);
     link.put("ayan",895);
     link.put("arpitha",89);
    System.out.println(link);
    for(Map.Entry<String,Integer>entry: link.entrySet()){
     System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }
    System.out.println( link.containsKey("ayan"));
     System.out.println( link.containsValue(89));
    System.out.println( link.remove(89));
  link.clear();
   
  System.out.println(link);  
    
    
    
  }
}