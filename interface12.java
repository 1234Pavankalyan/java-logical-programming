interface inter{
  public void add();
  public void display();
}
class inter1 implements inter{
  int a=10,b=20,c,d;
 public void add(){
    c=a*b;
   d=c*c*c;
  }
  public void display(){
    System.out.println(a);
     System.out.println(b);
     System.out.println(c);
     System.out.println(d);
  }
}
class interface12{
  public static void main(String args[]){
    inter1 in=new inter1();
    in.add();
    in.display();
  }
}