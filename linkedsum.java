import java.util.*;
class linkedsum{
  public static void main(String args[]){
    LinkedList<Integer>alist=new LinkedList<Integer>();
    alist.add(1);
    alist.add(2);
    alist.add(3);
    System.out.println(alist);
    int sum=0;
    for(int i=0;i<alist.size();i++){
      sum=sum+alist.get(i);
    }
    System.out.println(sum); 
  }
  
}