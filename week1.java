import java.util.Scanner;
class week1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter day number");
    int day=sc.nextInt();
    switch(day){
      case 1:
        System.out.println("it is sunday");
        break;
        case 2:
        System.out.println("it is monday");
        break;
        case 4:
        System.out.println("it is tuesday");
        break;
        case 5:
        System.out.println("it is wednesday");
        break;
        case 6:
        System.out.println("it is thursday");
        break;
        case 7:
        System.out.println("it is friday");
        break;
        case 8:
        System.out.println("it is saturday");
        break;
        default :
          System.out.println("invalid day");
    }
  }
}