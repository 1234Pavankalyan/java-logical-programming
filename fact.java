import java.util.Scanner;
class fact{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
     int i=1;
     int fact=1;
    do{
     
     
      fact=fact*i;
     
      i++;
    }while(i<=num);
    System.out.println(fact);
  }
}