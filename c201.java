// A school has different types of students, including undergraduates, graduates, and doctoral students. The school wants to keep track of each student's personal information, such as their names and contact details, as well as their academic information, such as their major and GPA. Create a superclass called "Student" with the following attributes: name (String)
// email (String)
// phone number (String)
// major (String)
// GPA (double)
// Create three subclasses of Student: Undergraduate, with the additional attribute of "class standing" (String)
// Graduate, with the additional attribute of "program" (String)
// Doctoral, with the additional attribute of "advisor" (String)
// Create a constructor for each subclass that initializes its respective additional attribute(s) along with the attributes inherited from the superclass. Create a method for each subclass to display its specific attributes along with the attributes inherited from the superclass. In the main method, create at least one object of each subclass and call the respective method to display their attributes. Also, update the GPA of each student as they complete new courses or exams.


class Student{
  private String name;
    private String email1;
    private String phone;
   private double gpa;
  public void setname(String name){
    this.name=name;
  }
  public void setemail1(String email1){
    this.email1=email1;
  }
  public void setphone(String phone){
    this.phone=phone;
  }
  public void setgpa(double gpa){
    this.gpa=gpa;
  }
  public String getname(){
    return name;
  }
   public String getemail1(){
    return email1;
  }
   public String getphone(){
    return phone;
  }
  public double getgpa(){
    return gpa;
  }
   public void display(){
    System.out.println("student name   " +name);
   System.out.println("student email   " +email1);
   System.out.println("student phone   " +phone);
    System.out.println("student gpa   " +gpa);
   }
}

class graduate extends Student{
   private String name;
    private String email;
    private String phone;
   private String program;
    private double gpa;
  
  public void setname(String name){
    this.name=name;
  }
  public void setemail(String email){
    this.email=email;
  }
  public void setphone(String phone){
    this.phone=phone;
  }
  public void setprogram(String program){
    this.program=program;
  }
   public void setgpa(double gpa){
    this.gpa=gpa;
  }
  public String getname(){
    return name;
  }
   public String getemail(){
    return email;
  }
   public String getphone(){
    return phone;
  }
   public String getprogram(){
    return program;
  }
  public double getgpa(){
    return gpa;
  }
  
  public void display(){
    System.out.println("graduatestudent name   " +name);
   System.out.println("graduatestudent email   " +email);
   System.out.println("graduatestudent phone   " +phone);
    System.out.println("graduatestudent gpa   " +gpa);
   System.out.println("graduatestudent program   " +program); 
  } 
}
class undergraduate extends Student{
   private String name;
    private String email;
    private String phone;
   private String classstanding;
    private double gpa;
  
  public void setname(String name){
    this.name=name;
  }
  public void setemail(String email){
    this.email=email;
  }
  public void setphone(String phone){
    this.phone=phone;
  }
  public void setclassstanding(String classstanding){
    this.classstanding=classstanding;
  }
   public void setgpa(double gpa){
    this.gpa=gpa;
  }
  public String getname(){
    return name;
  }
   public String getemail(){
    return email;
  }
   public String getphone(){
    return phone;
  }
   public String getclassstanding(){
    return classstanding;
  }
  public double getgpa(){
    return gpa;
  }
  
  public void display(){
    System.out.println("undergraduate student name   " +name);
   System.out.println("undergraduate student email   " +email);
   System.out.println("undergraduate  student phone   " +phone);
    System.out.println("undergraduate   student gpa   " +gpa);
   System.out.println("undergraduate  student classstanding   " +classstanding); 
  } 
}
class doctoral  extends Student{
   private String name;
    private String email;
    private String phone;
   private String advisor;
    private double gpa;
  
  public void setname(String name){
    this.name=name;
  }
  public void setemail(String email){
    this.email=email;
  }
  public void setphone(String phone){
    this.phone=phone;
  }
  public void setadvisor(String advisor){
    this.advisor=advisor;
  }
   public void setgpa(double gpa){
    this.gpa=gpa;
  }
  public String getname(){
    return name;
  }
   public String getemail(){
    return email;
  }
   public String getphone(){
    return phone;
  }
   public String advisor(){
    return advisor;
  }
  public double getgpa(){
    return gpa;
  }
  
  public void display(){
    System.out.println("doctoral  student name   " +name);
   System.out.println("doctoral  student email   " +email);
   System.out.println("doctoral  student phone   " +phone);
    System.out.println("doctoral estudent gpa   " +gpa);
   System.out.println("doctoral  student advisor   " +advisor); 
  } 
}
class c201{
  public static void main(String args[]){
   Student so=new Student ();
    so.setname("kiran");
    so.setemail1("kiran@123");
    so.setphone("6736837339");
    so.setgpa(8.6);
    so.display();
   graduate g=new graduate();
    g.setname("aryan");
    g.setemail("aryan@123");
    g.setphone("6736837339");
    g.setgpa(8.6);
    g.setprogram("masters");
    g.display();
    g.setgpa(7.6);
    g.display();
    undergraduate ug=new undergraduate();
    ug.setname("pavan");
    ug.setemail("pavan@123");
    ug.setphone("78636837339");
    ug.setgpa(8.6);
    ug.setclassstanding("nine");
    ug.display();
    ug.setgpa(6.6);
    ug.display();
    doctoral d=new doctoral();
    d.setname("aravind");
    d.setemail("aravind@123");
    d.setphone("78636837339");
    d.setgpa(5.6);
    d.setadvisor("chemical advisior");
    d.display();
    d.setgpa(8.6);
    d.display();
  }
}