//print array values 
import java.util.Scanner;
  class array7{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int a[][]={{10,20,30},{40,50,60},{70,80,90}};
       System.out.println("assign the array numbers");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          a[i][j]=sc.nextInt();
        }
           }
      System.out.println("the array values are");
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          System.out.println(a[i][j]);
        }
        System.out.println();
     }   
  }
}