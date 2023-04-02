/* 5. Write a Java program to accept directory name, file name from user. Do the following steps using File class.
   ==> Create directory with user entered directory name
   ==> Create file in given directory.
   ==> Accept one sentence about bitLabs and store in give file using FileOutputStream class.
   ==> Read data from given file and display read data on console using FileInputStream class.
*/

import java.io.*;
import java.util.*;
class CreatingDirectory{
  public static void main(String args[]){
     Scanner sc=new Scanner(System.in); 
    try{
     System.out.println("enter directory name");
      String s=sc.nextLine();
      File f=new File(s);
     boolean value=f.mkdir();
      if(value){
        System.out.println("directory successfully created");
      }
      System.out.println("enter file name");
      String s1=sc.nextLine();
      File f1=new File(s+"/"+s1);
      boolean value1=f.mkdir();
      if(value1){
       System.out.println( "directory successfuly created" );
      }
      FileOutputStream f3=new  FileOutputStream(f1);
      String K="one sentence about bitLabs";
      f3.write(K.getBytes());
      FileInputStream f2=new  FileInputStream(f1);
      int a;
       while((a=f2.read())!=-1){
         System.out.print((char)a);
       }
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}