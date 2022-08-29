package schoolMarksProject;

import java.util.HashSet;


public class Parent {

    private String parentFirstName;
    private String parentLastName;
    private String email;

    /*
    * Constructor for the parents objects
    *
    */

    public Parent(String parentFirstName, String parentLastName, String email) {
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
        this.email = email;
    }

    public Parent(String parentFirstName, String parentLastName) {
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
    }

    public Parent() {
    }

    /*
     * Getters and setters. Getters are set for all the fields, while setter is only for the email
     * */
    public String getParentFirstName() {
        return parentFirstName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
