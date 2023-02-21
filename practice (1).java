
//Java program that uses a loop to find the first non-repeated character in a string
import java.util.Scanner;

class practice {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    int count = 0;
    for (char ch = 'a'; ch <= 'z'; ch++) {
      count = 0;
      for (int i = 0; i < s.length(); i++) {
        if (ch == s.charAt(i)) {
          count++;
        }

        if (count == 1) {
          if (s.charAt(i) == ch) {
            System.out.println("first repeating character" + "  " + ch);
          }

        }

      }
    break; 
    }
  }
}
