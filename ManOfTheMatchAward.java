/* 4. Write a program to read data from matches.csv file and find out how many times a given player won
      the man of the match award in a given year?
   Sample Input:
   Enter player Name: Yuvraj Singh
   Enter Year:        2017

   Expected Output: 2 times
*/

import java.io.*;
import java.util.*;
class ManOfTheMatchAward{
  public static void main(String args[])throws Exception{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter name");
    String name=sc.next();
    System.out.println("enter year");
    String year=sc.next();
    int count=0;
    String str;
   FileReader fr = new FileReader("matches.csv.xlsx");
     BufferedReader br = new BufferedReader(fr);
    while((str=br.readLine())!=null)
    {
      String a[]=str.split(",");
      if(a[1].equalsIgnoreCase(year)&&a[0].equalsIgnoreCase(name)){
      count++;
      }
    }
    System.out.println(count +"   Times of   "+name+","+year+"  ");
  }
}