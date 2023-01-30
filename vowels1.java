import java.util.Scanner;
class vowels1{
  public static void main(String args[]){
   char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a character");
    ch=sc.next().charAt(0);
    if(ch=='a'||ch=='A')
    {
      System.out.println("it is Vowels");
    }
    else if(ch=='e'||ch=='E')
    {
      System.out.println("it is Vowels");
    }
     else if(ch=='i'||ch=='I')
    {
      System.out.println("it is Vowels");
    }
     else if(ch=='o'||ch=='O')
    {
      System.out.println("it is Vowels");
    }
      else if(ch=='u'||ch=='U')
    {
      System.out.println("it is Vowels");
    }
    else
    {
      System.out.println("it is a consonant "); 
    }
  }
}