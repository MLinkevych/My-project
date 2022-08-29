package schoolMarksProject;

import java.util.HashSet;
import java.util.Set;

public class Grade {
    private int math;
    private int eng;
    private int ukr;
    private Set<Student> kids;

    public Grade() {
        kids = new HashSet<>();
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getUkr() {
        return ukr;
    }

    public void setUkr(int ukr) {
        this.ukr = ukr;
    }

    public void addKid(Student student) {
        kids.add(student);
    }


}
