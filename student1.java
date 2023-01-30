/* write  a prgram to print student number and student names and 3 subject marks and calculate total and average print an report*/
    //with  arguments and no return type


import java.util.Scanner;
class Student1{
    Double avg,total;
    void display(String name, Double num,Double m,Double p,Double c){
      total=m+p+c;
      avg=(total)/3;
      System.out.println("the student report");
    System.out.println("the name" +name);
    System.out.println("the number" +num);
    System.out.println("the maths subjects" +m);
    System.out.println("the physics subjects" +p);
    System.out.println("the chemistry subjects" +c);
    System.out.println("the total" +total);
    System.out.println("the average" +avg);      
    }
}

class student1{
  public static void main(String args[]){
     String name;
    Double num,m,p,c,avg,total;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter student name,number,m,p,c");
      name=sc.next();
      num =sc.nextDouble();
      m=sc.nextDouble();
      p=sc.nextDouble();
      c=sc.nextDouble();
    Student1 s=new Student1();
    s.display(name,num,m,p,c);
  }
}