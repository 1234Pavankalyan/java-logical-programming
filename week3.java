import java.util.Scanner;
class week1{
    Scanner sc=new Scanner(System.in);
    void day(){
    System.out.println("enter day number");
    int day=sc.nextInt();
    switch(day){
      case 1:
         System.out.println("the weekend day is sunday");
        System.out.println("the weekend day is saturday");
        break;
        case 2:
        System.out.println("it is weekday monday");
         System.out.println("it is weekday tuesday");
        System.out.println("it is weekday wednesday");
         System.out.println("it is weekday thursday");
         System.out.println("it is weekday friday");
        break;
        default :
          System.out.println("invalid day");
    }
  }
}
  class week3{
    public static void main(String args[])
    {
      week1 w=new week1();
      w.day();
    }
  }
