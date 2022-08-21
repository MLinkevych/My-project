package schoolMarksProject;

public class Student extends Parent{

    private String grade;
    private String nameStudent;

    public Student(int parentID, String nameParent, String email, String grade, String nameStudent) {
        super(parentID, nameParent, email);
        this.grade = grade;
        this.nameStudent = nameStudent;
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
}
