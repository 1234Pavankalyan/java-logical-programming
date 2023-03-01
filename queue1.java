///queue delete first element and display others and peek of elements ,size
import java.util.LinkedList;
import java.util.Queue;
class queue1{
  public static void main(String args[]){
    Queue<Integer>k=new LinkedList<>();
    for(int i=0;i<5;i++){
      k.add(i);
      
    }
    System.out.println(k);
    int k1=k.remove();
    System.out.println("deleted is  "+k1);
     System.out.println("after deleted is queue");
       for(Integer u:k)
      System.out.println(u);
    System.out.println(k);
     int k12=k.peek();
    System.out.println("peek element is  "+k12);
    int k13=k.size();
    System.out.println("size is  "+k13);
    
  }
}