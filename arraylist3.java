import java.util.*;
class arraylist3{
  public static void main(String args[]){
    ArrayList<Integer>alist=new ArrayList<Integer>();
    alist.add(1);
    alist.add(2);
    alist.add(3);
    System.out.println(alist);
    int sum=0;
    for(int i=0;i<alist.size();i++){
      sum=sum+alist.get(i);
    }
    System.out.println(sum); 
  }
  
}