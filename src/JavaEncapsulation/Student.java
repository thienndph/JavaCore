package JavaEncapsulation;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // Private instance variables
    private int student_id;
    private String student_name;
    private List<Integer> grades;

    // Constructor
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    // Getter for student_id
    public int getStudentId() {
        return student_id;
    }

    // Setter for student_id
    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    // Getter for student_name
    public String getStudentName() {
        return student_name;
    }

    // Setter for student_name
    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    // Method to add a grade with validation
    public boolean addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            return true;
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
            return false;
        }
    }

    // Getter for grades
    public List<Integer> getGrades() {
        return grades;
    }
}
