class bank{
   void rateofinterest(){
     System.out.println("aryan has 20");
   }
}
class rbi extends bank{
   void rateofinterest(){
     System.out.println("aryan has 200");
   }
}
class sbi extends bank{
   void rateofinterest(){
     System.out.println("aryan has 2000");
   }
}
class override23{
  public static void main(String args[]){
    bank b=new bank();
    rbi be=new rbi();
    sbi s=new sbi();
    bank e;
    b.rateofinterest();
    e=be;
    e.rateofinterest();
     e=s;
    e.rateofinterest();
  }
}