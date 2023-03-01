//deleting of element in the linked list

import java.util.*;
class linkedlist12{
  public static void main(String args[]){
    LinkedList<Integer>alist=new LinkedList<Integer>();
    alist.add(1);
    alist.add(2);
    alist.add(3);
     alist.add(4);
    alist.add(5);
    alist.add(7);
    alist.remove(3);
    alist.removeFirst();
    alist.removeLast();
    
    for(int m=0;m<alist.size();m++)
      System.out.println(alist.get(m));
  }
}