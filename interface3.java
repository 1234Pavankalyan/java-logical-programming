import java.util.*;
class studentData{
  int s_no,s1,s2,s3;
  String s_name;
  int tot;
  float avg;
  void Data(){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter student number :");
    s_no=sc.nextInt();
    System.out.println("enter student  name :");
    s_name=sc.next();
    System.out.println("enter subject1,subject2,subject3 marks :");
    s1=sc.nextInt();
    s2=sc.nextInt();
    s3=sc.nextInt();
  }
  void Marks(){
     tot=(s1+s2+s3);
    avg=((float)tot/3);
  }

}
interface report{
  public void grade();
}
class grading  extends studentData implements report{
  public void grade(){
  System.out.println(" STUDENT DETAILS ");
    System.out.println(" ----------------");
    System.out.println("The Student Number is : " + s_no);
    System.out.println("The Student Name   is : " + s_name);
    System.out.println("The Student Marks  is : ");
    System.out.println("Maths :" + s1);
    System.out.println("Phys :" + s2);
    System.out.println("Chemi :" + s3);
    System.out.println("Student Total is :" + tot);
    System.out.println("Student average is :" + avg);
    if (s1 >= 40 && s2 >= 40 && s3 >= 40) {
      System.out.println("Result : Pass");
      if (avg <= 50)
        System.out.println("Grade : C");
      else if (avg >= 51 && avg <= 70)
        System.out.println("Grade : B");
      else if (avg >= 71 && avg <= 80)
        System.out.println("Grade : A");
      else
        System.out.println("Student Passed is Distension");
    } 
    else {
      System.out.println("Result : Fail");
    }
}
}


class StudentInterface{
  public static void main(String args[]){
    grading g1=new grading();
    g1.Data();
    g1.Marks();
    g1.grade();
    
  }
}