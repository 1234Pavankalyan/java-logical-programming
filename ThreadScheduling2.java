/* 5. Write a program to control execution order of the threads using join() method. */

	// creating class called ThreadScheduling and extending from Thread class
	public class ThreadScheduling2 extends Thread{
  public  void run(){
      System.out.println("before changing" +Thread.currentThread().getName());
      Thread.currentThread().setName("bitlabs");
     System.out.println("after changing" +Thread.currentThread().getName());
    for(int i=1;i<=10;i++){
      System.out.println(i );
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
    }
    public static void main(String args[]){
    ThreadScheduling2 t=new  ThreadScheduling2();
     ThreadScheduling2 t1=new  ThreadScheduling2(); 
      t.start();
      try{
        t.join();
      }
      catch(Exception E){
        System.out.println(E);
      }
      t1.start();
    }
  }