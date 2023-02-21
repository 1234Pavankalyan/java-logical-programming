import java.io.*;
class Inputdemo4{
  public static void main(String args[]) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
     float n;
     System.out.println("enter any chracter");
      n=Float.parseFloat(br.readLine());
     System.out.println("The enter chracter is" +n);
  }
}