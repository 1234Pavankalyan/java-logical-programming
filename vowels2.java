import java.util.Scanner;
class vowels2{
  public static void main(String args[]){
   char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a character");
    ch=sc.next().charAt(0);
    switch(ch){
      case 'a': case 'A':
       case 'e': case 'E':
     case 'i': case 'I':
     case 'o': case 'O':
     case 'u': case 'U':
        System.out.println("it is an vowels");
        break;
        default :
        System.out.println("it is an consonant");
    }
  }
}