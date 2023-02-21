import java.io.*;
import java.lang.*;
public class except2{
  {
    public static void main(String args[]){
      try{
        int n=Integer.paraseInt("564");
        int b=500;
        int res=b/2;
        System.out.println("resultant is " +res);
        int a[]=new int[10];
        int a[20]=78;
        System.out.println("value of a[10]="+a[20]);
 }
      catch(ArrayIndexOutOFBoundsException e){
        System.out.println(e.getMessage());
        }
      catch(ArthematicException ae){
        System.out.println(ae);    
      }
      catch(Exception ae){
         System.out.println(ae.getMessage());
      }
    }
  }
