package schoolMarksProject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Anna", "Kornienko", "t1@gmail.com", "1a");
        Parent p1 = new Parent("Andrey", "Marchenko", "p1@gmail.com");
        Student s1 = new Student("Andrey", "Marchenko", "1a", "Julia",
                "Marchenko");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        for (Student s: students){
            System.out.println(students);
        }

    }
}
