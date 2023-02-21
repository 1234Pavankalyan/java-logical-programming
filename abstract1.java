abstract class demo{
  abstract void calculate(int n);
}
class demo1 extends demo{
  void calculate(int n){
    System.out.println(n*n);
  }
}
class demo2 extends demo{
  void calculate(int n){
    System.out.println(n*n*n);
  }
}
class demo3 extends demo{
  void calculate(int n){
    System.out.println(Math.sqrt(n));
  }
}
class abstract1{
  public static void main(String args[]){
    demo1 d=new demo1();
    demo2 d2=new demo2();
    demo3 d3=new demo3();
    d.calculate(5);
    d2.calculate(2);
    d3.calculate(625);
  }
}
