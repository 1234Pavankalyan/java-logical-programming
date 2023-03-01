/**************************
write a program to sort the elements by using insertion sort by using methods in ArrayList

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
    void Selection(ArrayList<Integer> al,int n){
        int a,b;
       for(int i=0;i<=n-1;i++){
           for(int j=i;j>0&&al.get(j-1)>al.get(j);j--){
             
                  int t=al.get(j);
                   al.set(j,al.get(j-1));
                   al.set(j-1,t);
               }
           }
       }
}

public class arraylistinsm
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
	l1.Selection(al,n);
   System.out.println("\ndisplay array elements in array after sorting");
		l1.displayArray(al,n);
	
	}
}