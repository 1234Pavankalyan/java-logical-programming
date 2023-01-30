import java.util.Scanner;
class seasons{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter season");
    int season=sc.nextInt();
    switch(season){
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.println("it is summer season");
        break;
        case 7:
      case 8:
      case 9:
      case 10:
        System.out.println("it is rainy season");
        break;
        case 11:
      case 12:
      case 1:
      case 2:
        System.out.println("it is winter season");
        break;

      default :
       System.out.println("it is default season"); 
    }
  }
}