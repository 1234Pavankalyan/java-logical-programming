//insertion sort by using methods arraylist
import java.util.*;
class arraylistins{
  public static void main(String args[]){
   
    Scanner sc=new Scanner(System.in);
	System.out.println("enter your size :");
	int n=sc.nextInt();
    ArrayList<Integer>alist=new ArrayList<Integer>();
   for(int i=0;i<n;i++){
     alist.add(sc.nextInt());
   }
    System.out.println(alist);
     for(int i=1;i<=n-1;i++){
      for(int j=i;j>0&&alist.get(j-1)>alist.get(j);j--){
     int   t=alist.get(j);
        alist.set(j,alist.get(j-1));
        alist.set(j-1,t);
      }
    }
     for(int i=0;i<alist.size();i++){
        System.out.println(alist.get(i));
     }
}
}