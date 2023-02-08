//index of
   import java.util.Scanner;
class string21{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    System.out.println("enter string1");
    String st1=sc.nextLine();
    System.out.println(st1.indexOf("e"));
    System.out.println(st1.lastIndexOf('s',5));  
  }
}