package schoolMarksProject;

public class Teacher {
    private int id;
    private String nameTeacher;
    private String email;
    private String grade;

    public Teacher(int id, String nameTeacher, String email, String grade) {
        this.id = id;
        this.nameTeacher = nameTeacher;
        this.email = email;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getNameTeacher() {
        return nameTeacher;
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
