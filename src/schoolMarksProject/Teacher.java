package schoolMarksProject;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String teacherFirstName;
    private String teacherLastName;
    private String email;
    private String grade;
    /*
     * Constructor
     * */

    public Teacher(String teacherFirstName, String teacherLastName, String email, String grade) {
        this.teacherFirstName = teacherFirstName;
        this.teacherLastName = teacherLastName;
        this.email = email;
        this.grade = grade;
    }
    /*
     * Getters and setters. Getters are set for all the fields, while setters is only for the grade and email
     * */

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

