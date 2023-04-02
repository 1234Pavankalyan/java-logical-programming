
/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
import java.util.*;

class student {
  private String name, city;
  private Integer marks;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getMarks() {
    return marks;
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }
}

public class NullPointerException {
  public static void display(student s) {
    System.out.println(s.getName());
    System.out.println(s.getCity());
    System.out.println(s.getMarks());
  }

  public static void main(String args[]) {
    student s = null;
    try {
      display(s);
    }
    catch (Exception k) {
      System.out.println("NullPointerException   because   "  +k.getMessage());
    }
  }
}
/*NullPointerException occurs when you try to access or call a method on an object reference that is null. In other words, if a variable has a null value and you try to use it to call a method, the NullPointerException will be thrown. This can happen if you forget to initialize an object before using it, or if you pass a null reference to a method that expects a non-null object. To avoid this error, always make sure your object references are properly initialized before using them.*/