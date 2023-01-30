import java.util.Scanner;
class week{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter week day");
    int day=sc.nextInt();
    if(day==1){
      System.out.println("it is sunday");
    }
   else if(day==2){
      System.out.println("it is monday");
    }
     else if(day==3){
      System.out.println("it is tuesday");
    }
     else if(day==4){
      System.out.println("it is wednesday");
    }
     else if(day==5){
      System.out.println("it is thursday");
    }
     else if(day==6){
      System.out.println("it is friday");
    }
     else if(day==7){
      System.out.println("it is saturday");
    }
    else{
       System.out.println("it is invalid input");
    }
  }
}