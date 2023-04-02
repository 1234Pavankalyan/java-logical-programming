/* 3. Write a Java program to read data from input file and convert all the characters into swap case then 
      write into output file using FileInputStream and FileOutputStream classes.

      Sample Input: Create text file and write some data to the file. 
      Sample Data: "Hi, This is Sample data"
      Expected Output: hI,tHIS IS sAMPLE DATA

*/

import java.util.*;
import java.io.*;
class ConvertIntoSwapCase{
  public static void main(String args[])throws IOException {
    FileInputStream file= new FileInputStream("input.txt");
   int ch;
    String s="";
    String s1="";
    while((ch=file.read())!=-1){
      s=s+(char)ch;
    }
    System.out.println(s);
    String a[]=s.split("");
    for(int i=0;i<s.length();i++){
      char c[]=a[i].toCharArray();
      for(int j=0;j<c.length;j++){
        if(Character.isUpperCase(c[j])){
          char d = Character.toLowerCase(c[j]);
          s1+=d;
        }
        else if(Character.isLowerCase(c[j])){
         char d1=Character.toUpperCase(c[j]);
          s1+=d1;
        }
        
      }
      s1=s1+" ";
    }
    System.out.println(s1);
    char c[]=s1.toCharArray();
    FileOutputStream file1= new FileOutputStream("output.txt");
    for(int i=0;i<s1.length();i++){
      file1.write(c[i]);
    }
  }
}