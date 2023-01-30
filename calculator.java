import java.util.Scanner;
class calculator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("1.addition-2.subraction-3.multiplication-4.division-5.remainder"); 
    System.out.println("enter number one");
    int num1=sc.nextInt();
    System.out.println("enter number two");
    int num2=sc.nextInt();
    System.out.println("enter calulator");
    int cal=sc.nextInt();
    switch(cal){
      case 1:
        int add=num1+num2;
        System.out.println("the addition" +add);
        break;
        case 2:
        int sub=num1-num2;
        System.out.println("the subraction" +sub);
        break;
        case 3:
        int mul=num1*num2;
        System.out.println("the multiplication" +mul);
        break;
        case 4:
        int div=num1/num2;
        System.out.println("the division" +div);
        break;
        case 5:
        int rem=num1%num2;
        System.out.println("the remainder" +rem);
        break;
        default :
        System.out.println("Invalid input");
    }
  }
}