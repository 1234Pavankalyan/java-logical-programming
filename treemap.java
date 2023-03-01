import java.util.*;
class treemap{
  public static void main(String args[]){
    TreeMap<String,Integer>map=new TreeMap<String,Integer>();
    map.put("aryan",56);
    map.put("arjun",52);
    map.put("kavya",53);
    System.out.println(map);
     System.out.println("arjyn" +map.get("arjun"));
    map.remove("kavya");
    System.out.println("kavya" + map.remove("kavya"));
    System.out.println(map);
    for(Map.Entry<String,Integer>entry:map.entrySet()){
    String key=entry.getKey();
      Integer value=entry.getValue();
      System.out.println(key + "=>" +value);
      
    }
    
  }
}