//do the java program multilevel inheritence and
//take 3subjects and display their  total and average

class Student {
    String name;
    int rollNo;
    
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Marks extends Student {
    int subject1Marks;
    int subject2Marks;
    int subject3Marks;
    
    Marks(String name, int rollNo, int subject1Marks, int subject2Marks, int subject3Marks) {
        super(name, rollNo);
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }
    
    int getTotalMarks() {
        return subject1Marks + subject2Marks + subject3Marks;
    }
    
    double getAverageMarks() {
        return (double) getTotalMarks() / 3;
    }
}

class Result extends Marks {
    String division;
    
    Result(String name, int rollNo, int subject1Marks, int subject2Marks, int subject3Marks) {
        super( name, rollNo, subject1Marks, subject2Marks, subject3Marks );
         setDivision();
    }
   
    void setDivision() {
        double percentage = getAverageMarks();
        if (percentage >= 60) {
            division = "First";
        } else if (percentage >= 50) {
            division = "Second";
          
        } 
        else if (percentage >= 40) 
        {
            division = "Third";
          
        } else {
            division = "Fail";
        }
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1 Marks: " + subject1Marks);
        System.out.println("Subject 2 Marks: " + subject2Marks);
        System.out.println("Subject 3 Marks: " + subject3Marks);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
        System.out.println("Division: " + division);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Result result = new Result("John", 123, 85, 90, 80);
        result.display();
    }
}
