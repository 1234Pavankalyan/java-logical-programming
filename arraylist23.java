/*2.Write a program to create an ArrayList of String type and add five elements to it. Then, use a for-each loop to print all the elements in the ArrayList.*/

import java.util.*;

public class arraylist23 {
    public static void main(String[] args) {
        
        ArrayList<String> List=new ArrayList<String>();

        
        List.add("element is=1");
        List.add("element is=2");
        List.add("element is =3");
        List.add("element is =4");
        List.add("element is =5");
        
        
     
        for (String element :List) {
            System.out.println(element);
        }
    }
}