import java.util.Scanner;
class even{
  public static void main(String args[]){
   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
    int num=sc.nextInt();
    int i=sc.nextInt();
    while(i<=num){
      if(i%2==0){
         System.out.println("it is even" +i);
      }
       if(i%2!=0){
         System.out.println("it is odd" +i);
      }
      i++;
    }
  }
}