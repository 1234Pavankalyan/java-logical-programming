/* 1. Write a program to accept 3 Students information with name, five subject’s marks and print name along with total marks. 
      Use setter and getter methods to set and get values. After displaying student total marks, assign null value to reference 
      variable and Display user defined message once student object got garbage collected.

      Sample Input: 
      Enter student1 name: Ramesh
      Enter 5 subjects marks: 34, 56, 78, 89, 99
      Enter student1 name: Rakesh
      Enter 5 subjects marks: 99, 50, 70, 84, 23
      Enter student1 name: Satish
      Enter 5 subjects marks: 34, 33, 22, 22, 10

      Expected Output:
      Total marks of Ramesh is: 356
      Object got garbage collected

      Total marks of Rakesh is: 321
      Object got garbage collected

      Total marks of Satish is: 121
      Object got garbage collected
*/

import java.util.*;
class StudentInformation{
  Scanner sc=new Scanner(System.in);
  protected void finalize() throws Throwable{
   System.out.println("Object is collected in garbage collection"); 
  }
  String name;
  int totmarks=0;
  int mark[]=new int [5];
  void setDetails(){
    System.out.println("enter name");
    
    name=sc.nextLine();
     System.out.println("enter total 5 sub");
    for(int i=0;i<5;i++){
     mark[i]=sc.nextInt();
      totmarks=totmarks+mark[i];
    }
  }
  public void getDetails()
{
System.out.println("total marks "+totmarks+" for the  student " +name);
}
public static void main(String args[]){
  StudentInformation std1=new StudentInformation();
   StudentInformation std2=new StudentInformation();
   StudentInformation std3=new StudentInformation();
  std1.setDetails();
  std2.setDetails();
  std3.setDetails();
  std1.getDetails();
  std1=null;
  System.gc();
   std2.getDetails();
  std2=null;
  System.gc();
   std3.getDetails();
  std3=null;
  System.gc();
}
}




