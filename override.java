class over1{
  void disp(){
    int a=10;
    int b=10;
   int sum1=a+b;
    int sum2=a-b;
    float pro=sum1*sum1;
    float pro1=sum2*sum2;
    System.out.println(sum1);
      System.out.println(sum2);
      System.out.println(pro);
      System.out.println(pro1);
  }
}
  class over2 extends over1{
  void disp(){
   int a=24;
    int b=37;
   int sum1=a+b;
    int sum2=a-b;
    float pro=sum1*sum1;
    float pro1=sum2*sum2;
    System.out.println(sum1);
      System.out.println(sum2);
      System.out.println(pro);
      System.out.println(pro1);
  }
  }
class override{
  public static void main(String args[]){
    over1 o=new over1();
    over2 o1=new over2();
    over1 o2;
    o2=o;
    o2.disp();
    o2=o1;
    o2.disp();
    
  }
}
  