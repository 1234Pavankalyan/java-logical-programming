/* 3. Write a Java program to find the longest word and smallest word in a text file.

    Sample Input: Create text file and write some data to the file. 
    Sample Data: "Welcome to bitLabs"

    Expected Output: 
    Longest word: Welcome
    Smallest word: to
*/

import java.util.*;
import java.io.*;
class FindingLongestSmallestWord{
  public static void main(String args[])throws IOException{
    Scanner sc=new Scanner(System.in);
    FileReader k=new FileReader("test.txt");
    BufferedReader br=new BufferedReader(k);
    String str;
    String arr[]=new String[80];
    ArrayList<String> al=new ArrayList();
    while((str=br.readLine())!=null){
      System.out.println(str);
      arr=str.split(" ");
      Collections.addAll(al,arr);
    }
    String maxword="";
    String minword="";
    int max=arr[0].length();
     int min=arr[0].length();
    for(int i=0;i<arr.length;i++){
      if(arr[i].length()>max){
        max=arr[i].length();
        maxword=arr[i];
      }
    }
     for(int i=0;i<arr.length;i++){
      if(arr[i].length()<min){
        min=arr[i].length();
        minword=arr[i];
      }
    }
    System.out.println("longest word " + maxword);
    System.out.println("smallest word " +minword );
  }
}