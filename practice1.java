//[1 , 2  ,2 , 3 , 4 , 4  ]
//find the largest duplicate element and delete it and display the second largest duplicate number;
import java.util.Scanner;
class practice1{
  public static void main (String args[]){
    
    int a[]={1, 2  , 2 ,3 , 4, 4  };
    int j=0;
    
    for(int i=0;i<a.length;i++){
     
       for( j=i+1;j<a.length;j++)  {
        if(a[i]==a[j]){
         
         System.out.println("duplicate" +a[i]);
         int max=0;
          if(a[i]>max){
            max=a[i];
          System.out.println("max" +max); 
          if(max==4){
                continue;
                  }
            else{
            System.out.println(a[i]);
            }
       System.out.println("after removing largest duplicate" +a[i]);
          }
          
        }     
  
  }      
    
 }
    }
  }


