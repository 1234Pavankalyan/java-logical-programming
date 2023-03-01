//8./* Write a program to create a TreeSet of String type and add five elements to it. Then, use a for-each loop to print all the elements in the TreeSet.  */

import java.util.*;

public class treeset67 {
    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<String>();

        
        treeSet.add("html");
        treeSet.add("grapes");
        treeSet.add("aryan");
        treeSet.add("tree");
        treeSet.add("karun");

        for (String k : treeSet) {
            System.out.println(k);
        }
    }
}
