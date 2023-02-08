//reverse of charater through scan
import java.util.*;
class string14{
  public static void main(String args[]){
    Scanner sc=new Scanner( System.in);
    System.out.println("enter string");
    String s=sc.nextLine();
    String k=" ";
    for(int i=s.length()-1;i>=0;i--){
      k=k+s.charAt(i);
    }
    System.out.println(k);
  }
}