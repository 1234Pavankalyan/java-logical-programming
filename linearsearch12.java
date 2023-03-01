import java.util.*; 
class Linear1 {
  int i;
  Scanner sc = new Scanner(System.in);
   void getArray(int a[], int n) {
    for (i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
  } 
  void dispArray(int a[], int n) {
    for (i = 0; i < n; i++) {
      System.out.print("\t" + a[i]);
    }
  }
} 
class Linear {
  public static void main(String args[]) {
    int n, i, ser;
    Linear1 ln = new Linear1();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size:");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter Elements to Array:");
    ln.getArray(a, n);  
   System.out.println("The Elements in an Array is:");
    ln.dispArray(a,n);
    System.out.println("\nEnter Element for Search:");
    ser = sc.nextInt();    
  // Linear Search
    for (i = 0; i < n; i++) {
      if (a[i] == ser) {
  System.out.println("Element is Found at position " + (i + 1));
        break;
      }
    }
    if (i == n) {
      System.out.println("Element is Not Found");
    }
  }
}




