package schoolMarksProject;

public class Teacher {
    private int id;
    private String nameTeacher;
    private String email;
    private String grade;
    /*
     * Constructor
     * */

    public Teacher(int id, String nameTeacher, String email, String grade) {
        this.id = id;
        this.nameTeacher = nameTeacher;
        this.email = email;
        this.grade = grade;
    }
    /*
     * ID getter
     * */

    public int getId() {
        return id;
    }
    /*
     * Teacher's name getter
     * */

    public String getNameTeacher() {
        return nameTeacher;
    }
    /*
     * Teachers email getter
     * */

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
