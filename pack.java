[15:55] Karunakar Eeede
package facto;
public class Factorial
{
      public int fact(int n)
      {
           int f=1,i;            

         for(i=1;i<=n;i++)
            {
                f=f*i;
             }
            return f;
       }
}

[15:55] Karunakar Eeede
import facto.Factorial; 
class Factmain
{
    public static void main(String args[])

    {
       
          Factorial f1=new Factorial();
         int n=f1.fact(5);
        System.out.println("The Factorial value is:"+n);
     }
}