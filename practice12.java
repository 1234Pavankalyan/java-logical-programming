import java.util.Scanner;
class c20{
  public static void main(String args[]){
    int rows,cols,space;
     for(rows=1;rows<=5;rows++){
      for(cols=5;cols>=1;cols--){
       if(cols>rows){
         System.out.print(" ");
       }
        else{
          System.out.print(" *");
        }
      }
      System.out.println();
     }
    for(rows=1;rows<=5;rows++){
     for(space=1;space<=rows;space++){
       System.out.print(" ");
        }
      for(cols=4;cols>=rows;cols--){
        System.out.print(" *");
      }
      System.out.println();
    }
}
}
