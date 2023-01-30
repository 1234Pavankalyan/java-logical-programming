import java.util.*;
class special{
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the character");
   char ch=sc.next().charAt(0);
     if((ch>='a')&&(ch<='z'))
       System.out.println("enter it is a alphabet");
    else if((ch>='0')&&(ch<='9'))
       System.out.println("enter it is a number");
    else
      System.out.println("enter it is a special character");
  }
}
     