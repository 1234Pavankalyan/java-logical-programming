// 4.Write a program to create a LinkedList of Employee type and add five Employee objects to it. Then, use a while loop to print all the Employee objects in the LinkedList. 
import java.util.*;
class linkedlist56{
  public static void main(String args[]){
  LinkedList<String>employee=new LinkedList<String>();
    employee.add("name-pavan");
    employee.add("dept-chemical");
    employee.add("id-123");
     employee.add("salary-1200");
     employee.add("height-5.5ft");
    System.out.println(employee);
    System.out.println("iterator");
    Iterator i=employee.iterator();
    while(i.hasNext()){
       System.out.println(i.next());
  }
  }
}