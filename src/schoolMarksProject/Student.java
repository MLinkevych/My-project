package schoolMarksProject;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String grade;
    private String nameStudent;
    private Set<Parent> parents;

    public Student(String grade, String nameStudent) {
        this.grade = grade;
        this.nameStudent = nameStudent;
        parents = new HashSet<>();
    }

    public String getGrade() {
        return grade;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void addParent (Parent parent){
        parents.add(parent);
    }
}
