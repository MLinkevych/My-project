package schoolMarksProject;

public class Parent {
    private int parentID;
    private String nameParent;
    private String email;

    public Parent(int parentID, String nameParent, String email) {
        this.parentID = parentID;
        this.nameParent = nameParent;
        this.email = email;
    }

    public int getParentID() {
        return parentID;
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
}
