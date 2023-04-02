/* 2. Write a program to read data from a file and find the frequency of each word in a file. 
      And print each word along with frequency in sorted order.

   Sample Input: Create text file and write some data to the file.
   Expected Output:

      word 1: top frequency
            :
            :
            :
      Word n:  least frequency
*/

import java.io.*;
import java.util.*;
class FindingFrequency{
  public static void main(String args[])throws IOException{
    Scanner sc=new Scanner(System.in);
    FileReader f=new FileReader("data.txt");
    BufferedReader br = new BufferedReader(f);
    String str;
    String a[]=new String[80];
    ArrayList <String> al=new  ArrayList <String>();
    while((str=br.readLine())!=null){
      System.out.println(str);
      a=str.split(" ");
      Collections.addAll(al,a);
    }
    int a1[]=new int[al.size()];
    int count=0;
    for(int i=0;i<al.size();i++){
      count=1;
      for(int j=i+1;j<al.size();j++){
        if(al.get(i).equals(al.get(j))){
          count++;
          a1[j]=-1;
        } 
    }
      if(a1[i]!=-1){
        a1[i]=count;
      }
  }
   for(int i=0;i<al.size();i++){
      if(a1[i]!=-1){
        System.out.println(al.get(i) +"   " +a1[i]);
      }
   }
  }
}