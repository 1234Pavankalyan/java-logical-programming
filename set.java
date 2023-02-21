// setters and getters 


class Student
{
    private int number = 9001;
    private String name = "Karun"; 
 
   public void setNumber(int number) 
    {
        this.number = number;
    }     
  public int getNumber()
    {
        return number;
    }   
   public void setName(String name) 
    {
        this.name = name;
    }   
    public String getName() 
     {
       return name;
    }     
    public void printStudent() 
    {
        System.out.println("Number is..." + number);
        System.out.println("Name is..." + name);
    }
} 
 public class Main
{
    public static void main(String[] args) 
                {
        Student st = new Student();
        st.printStudent();     
       st.setNumber(4005);
        st.setName("suma");         
        System.out.println("name is.." + st.getName());
        System.out.println("Number is..." + st.getNumber());
    }
 }
============================================================================================================================
class worker{
  private float height=3.5f;
  private String colour="white";

public void setheight(float height){
  this.height=height;
}
public void setcolour(String colour){
  this.colour=colour;
}
  public String getcolour(){
    return colour;
  }
  public float getheight(){
    return height;
  }
  public void display(){
    System.out.println(height);
     System.out.println(colour);
  }
}
public class ste2{
  public static void main(String args[]){
    worker w=new worker();
    w.setheight(4.5f);
    w.setcolour("white");
    
    w.display();
     w.setheight(4.5678f);
    w.setcolour("whiteerwer");
     System.out.println(w.getheight());
     System.out.println(w.getcolour());
  }
}