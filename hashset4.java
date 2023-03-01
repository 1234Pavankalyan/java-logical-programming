/*4.Write a program to create a HashSet of Integer type and add ten elements to it. Then, use an iterator to print all the elements in the HashSet.*/

import java.util.*;

public class hashSet4 {
    public static void main(String[] args) {
       
        HashSet<Integer> Set=new HashSet<Integer>();

        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);
        Set.add(5);
        Set.add(6);
      Set.add(7);
        Set.add(8);
        Set.add(9);
      Set.add(10);


        Iterator<Integer> iterator=Set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}