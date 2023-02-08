// A  
// B C  
// D E F  
// G H I J  
// K L M N O  
class loop24{
  public static void main(String args[]){
    char a='!';
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        System.out.print(a +" ");
        ++a;
      }
      System.out.println(" ");
    }
  }
}