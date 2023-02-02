import java.util.Scanner;
class sim5{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number1");
    int i1=sc.nextInt();
     System.out.println("enter number2");
    int n=sc.nextInt();
    while (i1<=10){
        
      System.out.println((+i1+"*"+n +"=" +(i1*n)) +"    "  +(+n+"*"+i1 +"=" +(i1*n)));
      i1++;
    }   
  }
}