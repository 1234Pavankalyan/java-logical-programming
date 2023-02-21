import java.io.*;
class Inputdemo5{
  public static void main(String args[])throws Exception{

    InputStreamReader s=new InputStreamReader (System.in);
  BufferedReader br=new BufferedReader(s); 
    String st1;
    System.out.println("enter a string");
    st1=br.readLine();
    int count=0;
   
    System.out.println(st1);
    for(int i=0;i<st1.length();i++){
      count++;
    }
     System.out.println("The enter a string count is " +count);
  }
}

