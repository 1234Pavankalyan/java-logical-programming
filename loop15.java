// *   *
//  * * 
//   *  
//  * * 
// *   *
// *   *
//  * * 
//   *  
//  * * 
// *   *

import java.util.Scanner;
class loop14{
  public static void main(String args[]){
  Scanner sc=new Scanner (System.in);
    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if(i==j||i+j==4){
        System.out.print("*");
        }
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    for(int i=0;i<5;i++){
      for(int j=0;j<5;j++){
        if(i==j||i+j==4){
        System.out.print("*");
        }
        else
          System.out.print(" ");
      }
      System.out.println();
    }
}
}
