// super key word
class demo{
   int i=100;
  void display(){
    System.out.println("this is base class");
  }
}
class demo2 extends demo{
   
  void display2(){
    int i=200;
    super.display();
    System.out.println("this is base class i is" +super.i);
    System.out.println("this is super class i is" +i);
    System.out.println("this is super class");
  }
}
class super1{
  public static void main(String args[]){
    demo2 d=new demo2();
    d.display2();
  }
}