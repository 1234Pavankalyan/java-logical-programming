//sort the arraylist elements by using selection sort
import java.util.*;
class arraylistsel{
  public static void main(String args[]){
    int t=0;
     Scanner sc=new Scanner(System.in);
   System.out.println("enter your size :");
 int n=sc.nextInt();
 
    ArrayList<Integer>alist=new ArrayList<Integer>();
   
      for(int i=0;i<n;i++){
            alist.add(sc.nextInt());
        }
     for(int i=0;i<alist.size();i++){
            System.out.println("\t"+alist.get(i));
        }
  
     for(int i=0;i<alist.size()-1;i++){
      for(int j=i+1;j<alist.size();j++){
         if(alist.get(i)>alist.get(j)){
           t=alist.get(i);
           alist.set(i,alist.get(j));
           alist.set(j,t);
         }
       }
     }
        for(int k=0;k<alist.size();k++){
        System.out.println(alist.get(k));
     }

}
}