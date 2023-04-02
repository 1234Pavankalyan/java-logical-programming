/* 2. Write a Java program to read data from input file and convert into uppercase then write data into 
      output file using FileInputStream and FileOutputStream classes. Handle IOException while reading and writing data.

      Sample Input:Create text file and write some data to the file.
      Sample Data: "Hi, this is Sample data"

      Expected Output: HI, THIS IS SAMPLE DATA
*/


import java.io.*;
class ConvertIntoUpperCase{
  public static void main(String args[]) throws IOException{
  FileInputStream file=new FileInputStream("input1.txt");
    FileOutputStream file1=new FileOutputStream("output1.txt");
    int ch;
    while((ch=file.read())!=-1){
      char c=(char)ch;
      char c1=Character.toUpperCase(c);
      file1.write(c1);
    }
     System.out.println("File converted to uppercase successfully.");
    file.close();
    file1.close();
  }
}