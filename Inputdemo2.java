import java.io.*;
class Inputdemo2{
  public static void main(String args[]) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    String ch;
     System.out.println("enter any chracter");
    ch=br.readLine();
     System.out.println("The enter chracter is" +ch);
  }
}