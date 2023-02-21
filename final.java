final
class Main
{
   public static void main(String args[])
    {
              final int a=100;
                   // a=200;
                   /// a=300;
          System.out.println("The a value is:"+a);
      }
}

========================================================================================
final  class fina26
{
    final void disp()
         {
               System.out.println("Its Super Class");
          }
}
class final2 extends fina26  // error
{
         void disp()  //error
         {
              super.disp();
               System.out.println("Its Sub Class");
          }
}
class Main
{
    public static void main(String args[])
     {
                  final2 f=new final2();
                  f.disp();  
        }
}