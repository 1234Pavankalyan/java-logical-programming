abstract class add{
  abstract void sum(int a,int b);
}
class add1 extends add{
   void sum(int a,int b){
   int   sum1=a+b;
     int sum2=a-b;
     int prod1=sum1*sum1;
     int prod2=sum2*sum2;
     System.out.println(sum1);
     System.out.println(sum2);
     System.out.println(prod1);
     System.out.println(prod2);
   }
}
class add2 extends add{
   void sum(int a,int b){
   int   sum1=a+b;
     int sum2=a-b;
     int prod1=sum1*sum1*sum1;
     int prod2=sum2*sum2*sum2;
     System.out.println(sum1);
     System.out.println(sum2);
     System.out.println(prod1);
     System.out.println(prod2);
   }
}
class add3 extends add{
   void sum(int a,int b){
   int   sum1=(a+b)*(a+b);
     int sum2=(a-b)*(a-b);
     int prod1=sum1*sum1*sum1*sum1;
     int prod2=sum2*sum2*sum2*sum2;
     System.out.println(sum1);
     System.out.println(sum2);
     System.out.println(prod1);
     System.out.println(prod2);
   }
}
class abstact{
  public static void main(String args[]){
    add1 a1=new add1();
    add2 a2=new add2();
    add3 a3=new add3();
    a1.sum(100,20);
    a2.sum(10,5);
    a3.sum(30,20);
  }
}