
/* 5. Write a program to find prime numbers from given two arrays and store in 3rd array. 
      Handle ArrayIndexOutOfBoundsException while storing values into 3rd array.
*/
import java.util.*;

public class ArrayIndexOutOfBoundsException {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    System.out.println("enter array size");
    int s = sc.nextInt();
    System.out.println("enter array 1");
    int a1[] = new int[s];
    System.out.println("enter array 2");
    int a2[] = new int[s];
    System.out.println("enter array 3");
    int a3[] = new int[s];
    
    for (int i = 0; i < s; i++) {
      a1[i] = sc.nextInt();
    }
    for (int i = 0; i < s; i++) {
      a2[i] = sc.nextInt();
    }
     try {
    for (int k = 0; k < a1.length; k++) {
      count = 0;
      for (int l = 1; l <= a1[k]; l++) {
        if (a1[k] % l == 0) {
          count++;

        }
      }
      if (count == 2) {
        a3[k] = a1[k];
       
        System.out.println(a3[k]);
      }
    }
   
      for (int k = 0; k < a2.length; k++) {
        count = 0;
        for (int l = 1; l <= a2[k]; l++) {
          if (a2[k] % l == 0) {
            count++;

          }
        }
        if (count == 2) {
          a3[k] = a2[k];
      
        }
      }
     }
    catch (Exception e) {
      System.out.println("exception is caused by    " + e.getMessage());
    }
     finally{
        System.out.println("the prime elements in 3rd array");
        for(int i=0;i<=a3.length;i++){
          System.out.print(a3[i]+" ");
        }
       
        }
    
  
}
}
