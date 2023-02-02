import java.util.Scanner;
class alp{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any character");
    char c=sc.next().charAt(0);
    while(c<='z'){
      System.out.println(c);
      c++;
    }
  }
}