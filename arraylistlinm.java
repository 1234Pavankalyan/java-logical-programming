import java.util.*;
class hyper{
  Scanner sc=new Scanner(System.in);
  void kite( ArrayList<Integer>al,int n){
    for(int i=0;i<=n;i++){
      al.add(sc.nextInt());
    }
  }
  void kite1( ArrayList<Integer>al,int n){
    for(int i=0;i<=n;i++){
      System.out.println(al.get(i));
}
  }
    void search(ArrayList<Integer> al,int n,int s){
    int c=0;
     for(int i:al){
       if(i==s){
         System.out.println("element is found");
         c=1;
         break;
       }
       if(c==0){
        System.out.println("element is not found"); 
       }
     } 
    }
}
class arraylist98{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter  size");
   int n=sc.nextInt();
    System.out.println("enter search");
    int s=sc.nextInt();
    ArrayList<Integer>al=new  ArrayList<Integer>();
    hyper h=new hyper();
    h.kite(al,n);
    h.kite1(al,n);
    h.search(al,n,s);
  }
  
}