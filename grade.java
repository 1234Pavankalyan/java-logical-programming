// Take 3 subjects as input
 
// find total & average
 
// if  every subject above 40 marks print student pass otherwise fail
 
// if student is pass then allot the grade based on the average
 
//            if  average  below 50 ----> allot C Grade
 
//            if  average  between 51-70  ----> allot B Grade        
 
//            if  average  between 71-80  ----> allot A Grade        
 
//           above 80 you need to print " Student Pass in Distension"
import java.util.Scanner;
class grade
{
  public static void main(String args[])
  {
  float m,p,c,total,avg;
    Scanner sc=new Scanner (System.in);
    System.out.println("enter maths");
    m=sc.nextFloat();
    System.out.println("enter physics");
    p=sc.nextFloat();
    System.out.println("enter chemistry");
    c=sc.nextFloat();
    total=m+p+c;
    avg=(total)/3;
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