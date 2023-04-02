/* 2. Write a program to create a Thread by extending from Thread class. Override run() method and in run() 
      method accept number of seconds from user and display countdown time. 
      
      Sample Input: 
      Enter Number of seconds: 60

      Expected Output:
      59 seconds to go..
      58 seconds to go..
      57 seconds to go..
      56 seconds to go..
*/

import java.util.*;
import java.io.*;
class Threadsample extends Thread{
  Scanner sc=new Scanner(System.in);
 public void run(){
    System.out.println(" Enter Number of seconds: ");
   int sec=sc.nextInt();
   for(int i=sec;i>0;i--){
  try{
     Thread.sleep(1000);
   }
     catch(Exception e){
       System.out.println(e);
     }
     System.out.println(i +" Seconds to go... ");
   }
   
  }
}
class OverrideThread{
  public static void main(String args[]){
    Threadsample ts=new Threadsample();
    ts.start();
  }
}