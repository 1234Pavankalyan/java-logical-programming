/* 4. a java Program that demonstrating the garbage collection by calling System.gc().*/
import java.util.*;
class Employee{
  String name;
  int id;
  Employee(String name,int id){
    this.name=name;
    this.id=id;
  }
  public void finalize() throws Throwable{
    System.out.println("garbage in action object is Deleted ");
  }
}
class Demonstarting{
  public static void main(String args[]){
   Employee e1=new  Employee("pavan",89);
   Employee e2=new  Employee("aryan",99); 
    e2=e1;
    System.gc();
  }
}

