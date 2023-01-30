//Q. Write a Java Program to Enter Student Number, Student Name, Any 3 Subject of Marks, Calculate Total and Average of the Student, and print the report?
import java.util.Scanner;
class average{
  public static void main(String args[]){
    float snum,m,p,c,total,avg;
    String sname;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter name");
    sname=sc.next();
    System.out.println("enter number");
    snum=sc.nextFloat();
    System.out.println("enter maths");
    m=sc.nextFloat();
    System.out.println("enter physics");
    p=sc.nextFloat();
    System.out.println("enter chemistry");
    c=sc.nextFloat();
    total=m+p+c;
    avg=(total)/3;
    System.out.println("the student report");
    System.out.println("the name" +sname);
    System.out.println("the number" +snum);
    System.out.println("the maths subjects" +m);
    System.out.println("the physics subjects" +p);
    System.out.println("the chemistry subjects" +c);
    System.out.println("the total" +total);
    System.out.println("the average" +avg); 
     if (m>=40&&p>=40&&c>=40){
      System.out.println("Student is pass");
     if (avg<50){
        System.out.println("Grade c");
     }
      else if(avg<=51&&avg>=70){
        System.out.println("grade b");
      }
      else if(avg<=71&&avg<=80)
      {
         System.out.println("grade A");
      }
      else
      {
        System.out.println("Student passed in distinction"); 
      }
    }
    else {
      System.out.println("Student is fail");
    }
  }
}