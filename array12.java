// Find the frequencies of all duplicates elements in the array
// Input: arr[] = {2, 3, 4, 5, 4, 6, 4, 7, 4, 5, 6, 6} 
// Output: Below is the frequency of repeated elements – 
// 4 –> 4 
// 5 –> 2 
// 6 –> 3
// Input: arr[] = {4, 4, 5, 5, 6} 
// Output: Below is the frequency of repeated elements – 
// 4 –> 2 
// 5 –> 2
import java.util.*;
class frequency{
   public static void main(String[] args) {
      int[] array = { 2, 3, 5, 4, 3, 1, 3, 2, 1, };
       Arrays.sort(array);
      int i,j,frequency;
      System.out.println("These elements are repeated  frequency-");
      for(i=0; i<array.length; i++){
         frequency = 1;
         for(j=i+1; j<array.length; j++){
            if(array[j] == array[i]){
               frequency++;
            } else {
               break;
            }
         }
         i=j-1;
         if(frequency > 1){
            System.out.println(array[i] + " = " + frequency);
         }
      }
   }
}