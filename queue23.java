/*5.Write a program to create a PriorityQueue of Double type and add ten elements to it. Then, use a for-each loop to print all the elements in the PriorityQueue. */

import java.util.*;

public class queue23{
    public static void main(String[] args) {
       
        PriorityQueue<Double> Queue=new PriorityQueue<Double>();

       
      Queue.add(10.0);
       Queue.add(5.5);
     Queue.add(7.2);
       Queue.add(15.1);
       Queue.add(3.3);
     Queue.add(2.2);
        Queue.add(9.8);
        Queue.add(1.1);
        Queue.add(8.5);
     Queue.add(6.6);

        
        for (float element : Queue) {
            System.out.println(element);
        }
    }