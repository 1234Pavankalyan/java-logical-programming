abstract class absdemo
 {
     abstract void calculate(int n);
 }
class absdemo1 extends absdemo
{
      void calculate(int n)
       {
      System.out.println("The Square of the Given Number is:"+(n*n));
       }
}
class absdemo2 extends absdemo
{
        void calculate(int n)
       {
   System.out.println("The Cube of the Given Number is:"+(n*n*n));
       }    
}
class absdemo3 extends absdemo

   {
        void calculate(int n)
       {
       System.out.println("The Square root of the Given Number is:"+Math.sqrt(n));
       }    
   }
class Main
{
    public static void main(String arg[])
      {
          absdemo1 a1=new absdemo1();
          absdemo2 a2=new absdemo2();
          absdemo3 a3=new absdemo3();
          a1.calculate(5);
          a2.calculate(3);
          a3.calculate(625);
       }
}