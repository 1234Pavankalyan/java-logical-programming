 // 1         1
//    2    2
//      3     
//    4     4
//5            5
import java.util.Scanner;
class loop17{
  public static void main(String args[]){
  Scanner sc=new Scanner (System.in);
    for(int i=1;i<=5;i++){
      for(int j=1;j<=5;j++){
        if(i==j||i+j==6){
        System.out.print(i);
        }
        else
          System.out.print(" ");
      }
      System.out.println();
    }
     
}
}