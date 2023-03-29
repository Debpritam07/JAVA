package Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

public class Student {
    private int regNo;
    private String name;
    private LocalDate dateOfBirth;
    private String[] courses;

    public Student(int regNo, String name, LocalDate dateOfBirth, String[] courses) {
        this.regNo = regNo;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.courses = courses;
    }

    public Student(int regNo, String name, LocalDate dateOfBirth) {
        this(regNo, name, dateOfBirth, null);
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        return age.getYears();
    }
}
