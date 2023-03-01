class Factmain1
  {
   int fact(int n)
    {
         if(n==1)
            return 1;
         else
            return n*fact(n-1);
    }
  }
class Factmain
  {
    public static void main(String args[])
    {
      Factmain1 f1=new Factmain1();
      int n=f1.fact(5);
      System.out.println("The Factorial value is:"+n);
    }
  }