import java.util.*;
class vector{
  public static void main(String args[]){
    Vector<Object> k=new Vector<Object>();
    k.add(new Date());
    k.add(new Integer(100));
    k.add(8.976);
    for(int i=0;i<k.size();i++){
     System.out.println(k.elementAt(i)) ;
    }
  }
}