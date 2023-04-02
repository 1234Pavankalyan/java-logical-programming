/* 3. Write a program which will illustrate ArrayIndexOutOfBoundsException. 
   Create an array variable with n size, accept values from user and store values into array, finally print all values on console. 
   Please write your comments regarding ArrayIndexOutOfBoundsException such as " When ArrayIndexOutOfBoundsException occur in this program?"
*/
import java.util.*;
public class ArrayIndexOutOfBoundsException {

    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      try{
        for(int i=0;i<=n;i++){
          a[i]=sc.nextInt();
        }
      }
        catch(Exception  k) {
        System.out.println("exception " +k.getMessage());
        }
      finally{
        for(int i=0;i<n;i++){
          System.out.println(a[i]);
        }
      }
    }
}
/* ArrayIndexOutOfBoundsException is the predefined exception when we retrive the data from the array which exceeds size or equal to the sze and when we need push an elemnent in the array which exceeds size or equal to the sze then we got ArrayIndexOutOfBoundsException*/
