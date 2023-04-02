/* 2. Write a program to accept basic salary from user and find gross salary. Gross_Salary = basic+DA+HRA.  
      DA is 82% on basic and HRA is 70% on basic.  Use setter and getter methods to set and get values. 
      After printing gross salary display user defined message once object got garbage collected.

      Sample Input:
      Enter Basic salary: 23000
      
      Expected Output:
      Your gross salary is: 57960
      Object is garbage collected
*/

import java.util.*;
public class GrossSalary {
Scanner sc = new Scanner(System.in);
/* Override finalize() method to print user defined message, 
throw Throwable class from method signature.*/
@Override
protected void finalize() throws Throwable {
System.out.println("\nObject got garbage collected.");
}
double basic_Salary;
double DA;
double HRA;
double Gross_Salary;
public void setDetails()
{
System.out.print("Enter Basic Salary : ");
this.basic_Salary = sc.nextDouble();
this.DA = 0.82*basic_Salary;
this.HRA = 0.7*basic_Salary;
this.Gross_Salary = basic_Salary + DA + HRA ;
}
public void getDetails()
{
System.out.println("Your gross salary is : "+ (int)Gross_Salary);
}
public static void main(String[ ] args) {
GrossSalary obj = new GrossSalary();
obj.setDetails();
obj.getDetails();
obj = null;
// call gc() method. 
System.gc(); 
}
}
