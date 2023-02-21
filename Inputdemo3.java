import java.io.*;
class Inputdemo3{
  public static void main(String args[]) throws IOException{
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
     int n;
     System.out.println("enter any chracter");
     n=Integer.parseInt(br.readLine());
     System.out.println("The enter chracter is" +n);
  }
}