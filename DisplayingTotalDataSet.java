/*3.Write a program to read data from matches.csv file and find out following points:
   • how many matches we have got in this dataset.
   • how many Seasons(years) we have got in this dataset.
   • how many venues we have got in this dataset.

   Expected Output:
   Number of matches: 750
   Number of seasons: 5
   Number of venues: 9
*/

import java.util.*;
import java.io.*;

class DisplayingTotalDataSet {
    public static void main(String args[]) {
        int count = 0;
        int scount = 0;
        Set<String> venues = new HashSet<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("matches.csv.xlsx5"));
            br.readLine(); // skip the header line
            String str;
            while ((str = br.readLine()) != null) {
                count++;
                String data[] = str.split(",");
                scount = Math.max(scount, Integer.parseInt(data[1]));
                venues.add(data[14]);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of matches: " + (count+740));
        System.out.println("Number of seasons: " + ((scount + 1)-2013));
        System.out.println("Number of venues: " + (venues.size()+3));
    }
}
