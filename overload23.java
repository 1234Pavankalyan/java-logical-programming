class back{
  void fact(){
    System.out.println("it is first method");
  }
   void fact(int k){
    System.out.println("it is first method" +k);
  }
  
}
class overload23{
  public static void main(String args[]){
    back b=new back();
    b.fact();
    b.fact(7);
  }
}