/* 5. Write a Java program to accept 5 students details such as name and marks and store in studentdetails.txt file in the below format.
     Ramu, 60
     Kumar,56
     Rakesh,89
     Suresh,66
    Read data from studentdetails.txt file and print Student name and marks who got top score. 
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

 class  StudentDetails{
    public static void main(String[] args) {
        String fileName = "studentdetails.txt"; // Replace with actual file path
        List<Student> students = new ArrayList<>();

        // Accept student details from user
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for student #" + i + ":");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Marks: ");
                int marks = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                students.add(new Student(name, marks));
            }
        }

        // Write student details to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Student student : students) {
                writer.write(student.getName() + ", " + student.getMarks());
                writer.newLine();
            }
        }
          catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
            System.exit(1);
        }

        // Read student details from file and find top scorer
        String topScorerName = "";
        int topScorerMarks = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" "); // Split line into name and marks
                String name = tokens[0];
                int marks = Integer.parseInt(tokens[1]);
                if (marks > topScorerMarks) {
                    topScorerName = name;
                    topScorerMarks = marks;
                }
            }
        } catch (Exception e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        // Print top scorer
        System.out.println("Top Scorer:");
        System.out.println(topScorerName + "=>" + topScorerMarks);
    }
}

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}
