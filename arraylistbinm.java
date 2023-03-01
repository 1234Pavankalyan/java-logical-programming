/**************************
write a program to find the element by using binary search by using methods in ArrayList


***************************/
import java.util.*;
class Linear{
    int i,t;
    Scanner sc=new Scanner(System.in);
    void readArrayList(ArrayList<Integer> al,int n){
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
    }
    void displayArray(ArrayList<Integer> al,int n){
        for(int i=0;i<n;i++){
            System.out.print("\t"+al.get(i));
        }
    }
    void BinarySearch(int beg,int end,int mid,ArrayList<Integer> al,int n,int ser){// 10 20 30 40 50 
    int c=0;
       
           while(beg<=end){//mid=2 0<=4
               if(al.get(mid)<ser){//30<40
                 beg=mid+1;//3
               }
           else if(al.get(mid)==ser){
               System.out.println("the element found" +mid); 
               c=1;
               break;
           }
           else{
               end=mid-1;
           }
           mid=(beg+end)/2;
       }
       
       if(c==0){
           System.out.println("the element not found");
       }
       
}
}
public class arraylistbinm
{
	public static void main(String[] args) {
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your size :");
	 n=sc.nextInt();
	ArrayList<Integer> al=new ArrayList<Integer>();
	Linear l1=new Linear();
	System.out.println("enter elements in array ");
	l1.readArrayList(al,n);
	System.out.println("display array elements in array before sorting");
	l1.displayArray(al,n);
	System.out.println("\nenter your searching element");
	int ser=sc.nextInt();
	int beg=0;
	int end=al.size()-1;
	int mid=(beg+end)/2;
	l1.BinarySearch(beg,end,mid,al,n,ser);
   
	
	}
}