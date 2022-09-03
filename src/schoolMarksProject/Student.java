package schoolMarksProject;


import java.util.Set;

public class Student extends Parent implements Comparable<Student> {

    private String grade;
    private String studentFirstName;
    private String studentLastName;
/*    private Set<Student> kids;*/


    /*
     * Constructor for the students objects
     *
     */

    public Student(String parentFirstName, String parentLastName, String grade,
                   String studentFirstName, String studentLastName) {
        super(parentFirstName, parentLastName);
        this.grade = grade;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
    }

    public Student(String studentFirstName, String studentLastName) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
    }

    /*
     * Getters and setters. Getters are set for all the fields, while setters is only for the grade and email
     * */
    public String getGrade() {
        return grade;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
/*    public Set<Student> getKids() {
        return kids;
    }*/

 /*   public void addKid(Student student) {
        kids.add(student);
    }*/


    @Override
    public String toString() {
        return "Student " +
                "grade= " + grade +  ", studentFirstName= " + studentFirstName +
                ", studentLastName= " + studentLastName;
    }


    @Override
    public int compareTo(Student o) {
        return getStudentLastName().compareTo(o.getStudentLastName());
    }
}
