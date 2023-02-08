import java.util.Scanner;
class string13{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    System.out.println("enter string1");
    String s=sc.nextLine();
    System.out.println("enter string1");
    String g=sc.nextLine();
    String st1=s;
    String st2=g;
    int count=0;
    for(int i=0;i<st1.length();i++){
      count++;
    }
    int count1=0;
    for(int i=0;i<st2.length();i++){
      count1++;
    }
    System.out.println("the length of given string is" +count);
     System.out.println("the length of given string is" +count1);
  }
}