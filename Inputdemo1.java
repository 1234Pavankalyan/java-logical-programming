import java.io.*;
class Inputdemo1{
  public static void main(String args[]) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    char ch;
     System.out.println("enter any chracter");
    ch=(char)br.read();
     System.out.println("The enter chracter is" +ch);
  }
}