
// A university has different types of employees, including faculty members and administrative staff. The university wants to keep track of their personal information, such as their names and contact details, as well as their job-specific information, such as their salary and job title. Create a superclass called "Employee" with the following attributes: name (String)
// email (String)
// phone number (String)
// Create two subclasses of Employee: FacultyMember, with the additional attribute of "department" (String)
// AdministrativeStaff, with the additional attribute of "jobTitle" (String)
// Create a constructor for each subclass that initializes its respective additional attribute(s) along with the attributes inherited from the superclass. Create a method for each subclass to display its specific attributes along with the attributes inherited from the superclass. In the main method, create at least one object of each subclass and call the respective method to display their attributes.

class employee{
  private String name;
  private double phone;
  private String email;
  public void setname(String name){
    this.name=name;
  }
  public void setemail(String email){
    this.email=email;
  }
  public void setphone(double phone){
    this.phone=phone;
  }
  public String getname(){
    return name;
  }
   public String getemail(){
    return email;
  }
  public Double getphone(){
    return phone;
  }
}
class facultymember extends employee{
  public void setdepartment(String department){
    this.department=department;
  }
  
public  facultymember(String name,String email,double phone){
   super.name;
  super.(email);
  super.(phone);
   public String getdepartment(){
     return department;
   }
 public void display(){
    System.out.println(getname());
    System.out.println(getemail());
    System.out.println(getphone());
   System.out.println(getdepartment());
  }
  }
  
}
