// Nested Loops:
// -----------------
//   1,1 1,2
//    *   *   *  *  *
//    *   *   *  *  *
//    *   *   *  *  *
//    *   *   *  *  *
//    *   *   *  *  *
 
import java.util.Scanner;
class nest{
  public static void main(String args[]){
  Scanner sc=new Scanner (System.in);
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5;j++){
        System.out.print("*");
      }
      System.out.println();
    }
}
}