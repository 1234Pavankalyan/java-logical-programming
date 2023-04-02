/*    JFM1T13_Assignment5:  
      Create an application having a Generic HashMap with Empcode  as key and EmpName as value. Display only EmpNames as output. 
       Prompt the user input from the terminal.
      Sample Input: 
      Enter Emp code:101
      Enter Emp Name: Ram
      Enter another student (y/n)?y
      Enter Emp code:102
      Enter Emp Name: Vaibhav
      Enter another student (y/n)?y
      Enter Emp code:103
      Enter Emp Name: Priyanka
      Enter another student (y/n)?n
      Expected Output: 
        Ram
        Vaibhav
        Priyanka
       
*/

import java.util.Scanner;
import java.util.HashMap;

public class HashDemo {
  public static void main(String args[]){
HashMap<Integer,String>has=new HashMap<Integer,String>();
  Scanner sc=new Scanner(System.in);
    String c="";
  do{
  System.out.println("enter integer");
  int i=sc.nextInt();
  System.out.println("enter string");
  String s=sc.next();
  System.out.println("enter choice (y/n)");
 c=sc.next();
  has.put(i,s);
    
  }while(c.equals("y"));
for(HashMap.Entry k:has.entrySet()){
  System.out.println(k.getValue());
}

}
}