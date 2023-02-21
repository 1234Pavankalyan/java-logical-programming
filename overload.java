class over{
  void sum(){
    int a=10;
    int b=10;
   int sum1=a+b;
     int sum2=a-b;
   float prod=sum*sum;
     float prod1=sum2*sum2;
     System.out.println(sum);
    System.out.println(prod);
     System.out.println(sum2);
    System.out.println(prod1);
  }
   void sum(int a,int b){
    
   int sum1=a+b;
     int sum2=a-b;
   float prod=sum*sum;
      float prod1=sum2*sum2;
     System.out.println(sum);
    System.out.println(prod);
      System.out.println(sum2);
    System.out.println(prod1);
  }
}
class overload{
  public static void main(String args[]){
    over o=new over();
    o.sum();
    o.sum(46,67);
  }
}