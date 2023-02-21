class student{
  private int number=1;
  private String name="karan";
  public void setnumber(int number){
    this.number=number;
  }
  public void setname(String name){
    this.name=name;
  }
  public int getnumber(){
    return number;
  }
  public String getname(){
    return name;
  }
  public void display(){
    System.out.println("student name   " +name);
   System.out.println("student number   " +number);
  } 
}
class ste1{
  public static void  main(String args[]){
    student s=new student();
    s.setnumber(123);
    s.setname("aryan");
    s.display();
    s.setnumber(156);
    s.setname("arjun");
    System.out.println("student name   " +s.getname());
    System.out.println("student number   " +s.getnumber());
     s.setnumber(156890);
    s.setname("arjunkumar");
    System.out.println("student name   " +s.getname());
    System.out.println("student number   " +s.getnumber());
  }
}
