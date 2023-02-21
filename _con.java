class constructer1{
  int a,b;
  constructer1(){
    int a=10;
    int b=20;
    System.out.println(a+b);
  }
  constructer1(int n){
    System.out.println(n*n);
  }
  constructer1(int x,int y){
   a=x;
    b=y;
    System.out.println(x*y);
  }
}
class con{
  public static void main(String args[]){
    constructer1 c=new  constructer1();
    constructer1 c1=new  constructer1(10);
     constructer1 c11=new  constructer1(1056,865);
  }
}