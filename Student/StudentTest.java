package Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Create an array of three Student objects
        Student[] students = new Student[3];

        // Get input from the user and create Student objects
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            System.out.print("Registration number: ");
            int regNo = Integer.parseInt(br.readLine());
            System.out.print("Name: ");
            String name = br.readLine();
            System.out.print("Date of birth (yyyy-MM-dd): ");
            String dobString = br.readLine();
            LocalDate dob = LocalDate.parse(dobString, DateTimeFormatter.ISO_LOCAL_DATE);
            String[] courses = new String[3];
            for (int j = 0; j < courses.length; j++) {
                System.out.print("Course " + (j+1) + " (or enter null if not registered): ");
                String course = br.readLine();
                courses[j] = course.equals("null") ? null : course;
            }
            students[i] = new Student(regNo, name, dob, courses);
        }

        // Display the details of each student in a tabular format
        System.out.println("Reg. No.\tName\t\tAge");
        for (Student s : students) {
            System.out.println(s.getRegNo() + "\t\t" + s.getName() + "\t\t" + s.getAge());
        }
    }
}
