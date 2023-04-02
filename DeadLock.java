/* 4. Write a program to create two Threads by extending from Thread class. And create two file like abc.txt file and xyz.txt file.
    • Thread1 should read data from abc.txt then it should read data from xyz.txt file and display on console.  
    • Thread2 should read data from xyz.txt then it should read data from abc.txt file and display on console.
    Create two synchronized blocks to achieve dead lock.  
*/

import java.io.*;
class Thread1 extends Thread{
  File file1;
  File file2;
  Thread1(File file1,File file2){
    this.file1=file1;
    this.file2=file2;
  }
  public void run(){
    synchronized(file1)
    {
      try{
        BufferedReader br=new BufferedReader(new FileReader(file1));
        String str;
        while((str=br.readLine())!=null){
          System.out.println(str);
          
        }
        System.out.println("abc.txt is blocked by" +Thread.currentThread().getName());;
      }
      catch(Exception e){
        System.out.println(e);
      }
    
    synchronized(file2){
      try{
        BufferedReader br=new BufferedReader(new FileReader(file2));
        String str;
        while((str=br.readLine())!=null){
          System.out.println(str);
          
        }
        System.out.println("xyz.txt is blocked by" +Thread.currentThread().getName());;
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}
}
    class Thread2 extends Thread{
  File file1;
  File file2;
  Thread2(File file1,File file2){
    this.file1=file1;
    this.file2=file2;
  }
  public void run(){
    synchronized(file2)
    {
      try{
        BufferedReader br=new BufferedReader(new FileReader(file2));
        String str;
        while((str=br.readLine())!=null){
          System.out.println(str);
          
        }
        System.out.println("xyz.txt is blocked by" +Thread.currentThread().getName());;
      }
      catch(Exception e){
        System.out.println(e);
      }
    
    synchronized(file1)
    {
      try{
        BufferedReader br=new BufferedReader(new FileReader(file1));
        String str;
        while((str=br.readLine())!=null){
          System.out.println(str);
          
        }
        System.out.println("abc.txt is blocked by" +Thread.currentThread().getName());;
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}
    }
class DeadLock{
  public static void main(String args[]){
    File file1=new File("abc.txt");
    File file2=new File("xyz.txt");
    Thread1 t=new Thread1(file1,file2);
     Thread2 t1=new Thread2(file1,file2);
    t.start();
    t1.start();
  }
}