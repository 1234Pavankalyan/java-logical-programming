import java.util.Scanner;
class vowels
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any character");
      char ch=sc.next().charAt(0);
      if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
       System.out.println("IT IS VOWEL"); 
      }
      else
      {
       System.out.println("IT IS CONSONANT");  
      }
    }
  }