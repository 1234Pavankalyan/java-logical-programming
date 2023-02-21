// A school has different types of students, including undergraduates, graduates, and doctoral students. The school wants to keep track of each student's personal information, such as their names and contact details, as well as their academic information, such as their major and GPA. Create a superclass called "Student" with the following attributes: name (String)
// email (String)
// phone number (String)
// major (String)
// GPA (double)
// Create three subclasses of Student: Undergraduate, with the additional attribute of "class standing" (String)
// Graduate, with the additional attribute of "program" (String)
// Doctoral, with the additional attribute of "advisor" (String)
// Create a constructor for each subclass that initializes its respective additional attribute(s) along with the attributes inherited from the superclass. Create a method for each subclass to display its specific attributes along with the attributes inherited from the superclass. In the main method, create at least one object of each subclass and call the respective method to display their attributes. Also, update the GPA of each student as they complete new courses or exams.
 class Student {
    private String name;
    private String email;
    private String phone;
    private double GPA;

    public Student(String name, String email, String phone, double GPA) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.GPA = GPA;
    }

public void setGPA(double GPA) {
        this.GPA = GPA;
    }
public String getName() {
        return name;
    }
public String getEmail() {
        return email;
    }
 public String getPhone() {
        return phone;
    }
public double getGPA() {
        return GPA;
    }
}
 class Graduate extends Student {
    private String program;

    public Graduate(String name, String email, String phone, double GPA, String program) {
        super(name, email, phone, GPA);
        this.program = program;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone number: " + getPhone());
        System.out.println("GPA: " + getGPA());
        System.out.println("Program: " + program);
    }
}
class Undergraduate extends Student {
    private String classStanding;

    public Undergraduate(String name, String email, String phone, double GPA, String classStanding)
   {
       super(name, email, phone, GPA);
        this.classStanding = classStanding;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone number: " + getPhone());
        System.out.println("GPA: " + getGPA());
        System.out.println("Class standing: " + classStanding);
    }
}
 class Doctoral extends Student {
    private String advisor;

    public Doctoral(String name, String email, String phone, double GPA, String advisor) {
        super(name, email, phone, GPA);
        this.advisor = advisor;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone number: " + getPhone());
        System.out.println("GPA: " + getGPA());
        System.out.println("Advisor: " + advisor);
    }
}

public class c20 {
    public static void main(String[] args) {
        Undergraduate u = new Undergraduate("aryan", "aryan@gmail.com", "6302424056", 9.7, "nine");
        u.displayInfo();
        u.setGPA(3.9); 
        u.displayInfo(); 

Graduate g = new Graduate("pavankalyan", "pavankalyan@gmail.com", "9381001795", 9.6, "Masters");
        g.displayInfo();
        g.setGPA(7.8);
        g.displayInfo();
       Doctoral d=new Doctoral("kaushik","kaushik@678","784938494",9.4,"chemicaladvisor");
     d.displayInfo();
     d.setGPA(7.8);
      d.displayInfo(); 
    }
}