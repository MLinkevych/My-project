package schoolMarksProject;

import java.util.HashSet;
import java.util.Set;

public class Parent {

    private String nameParent;
    private String email;
    private Set<Student> kids;

    public Parent(String nameParent, String email) {
        this.nameParent = nameParent;
        this.email = email;
        kids = new HashSet<>();
    }

    public String getNameParent() {
        return nameParent;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addKid (Student student){
        kids.add(student);
    }
}
