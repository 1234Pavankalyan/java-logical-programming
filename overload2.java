//overlading 
class space{
  void arjun(int a,float b,String c){
    System.out.println(a+" "+b+" "+c);
  }
  void arjun(float b,int a,String c){
    System.out.println(a+" "+b+" "+c);
  }
  void arjun(float b,String c,int a){
    System.out.println(a+" "+b+" "+c);
  }
}
class overload2{
  public static void main(String args[]){
    space s=new space();
    s.arjun(10,18.6f,"pavan");
     s.arjun(18.6f,10,"pavan");
    s.arjun(18.6f,"pavan",10);

  }
}