//bubble sort by using methods arraylist
import java.util.*;
class arraylistbub{
  public static void main(String args[]){
   int t=0;
    Scanner sc=new Scanner(System.in);
	System.out.println("enter your size :");
	int n=sc.nextInt();
    ArrayList<Integer>alist=new ArrayList<Integer>();
   for(int i=0;i<n;i++){
     alist.add(sc.nextInt());
   }
    System.out.println(alist);
    for(int i=0;i<alist.size()-1;i++){
           for(int j=0;j<alist.size()-1-i;j++){
               if(alist.get(j)>alist.get(j+1)){
                   t=alist.get(j);
                   alist.set(j,alist.get(j+1));
                   alist.set(j+1,t);
               }
           }
       }
     for(int i=0;i<alist.size();i++){
        System.out.println(alist.get(i));
     }
}
}