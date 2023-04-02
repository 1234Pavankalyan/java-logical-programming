/* 1. Write a Java program to print list of repeated words and list of non-repeated words in a given file and 
      print number of repeated words and number of non-repeated words.

     Sample Input: Create text file and write some data to the file.

     Expected Output:
     Repeated words: 
     // Display all words which are repeating
     Number of repeated words: 33
     Non-Repeated Words: 
     // Display all words which are not repeating
     Number of repeated words: 12
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class RepeatedNonRepeatedWords {
    public static void main(String[] args) {
        String fileName = "data2.txt"; // Replace with actual file path
        Map<String, Integer> wordCounts = new HashMap<>();

        // Read file and count words
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split line into words
                for (String word : words) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        } 
          catch (Exception e) 
        {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        // Print list of repeated words
        System.out.println("Repeated words:");
        int repeatedCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                repeatedCount += entry.getValue();
            }
        }
        System.out.println("Number of repeated words: " + repeatedCount);

        // Print list of non-repeated words
        System.out.println("Non-repeated words:");
        int nonRepeatedCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                nonRepeatedCount++;
            }
        }
        System.out.println("Number of non-repeated words: " + nonRepeatedCount);
    }
}
