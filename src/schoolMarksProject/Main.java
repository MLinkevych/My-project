package schoolMarksProject;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Anna", "Kornienko", "t1@gmail.com", "1a");
        Parent p1 = new Parent("Andrey", "Marchenko", "p1@gmail.com");
        Student student1 = new Student("Andrey", "Marchenko", "1a", "Julia",
                "Barchenko");
        Student student2 = new Student("Inna", "Kovalska", "1a", "Hanna",
                "Artemchenko");
        Student student3 = new Student("Artem", "Dmitruk", "1a", "Mark",
                "Dmitruk");
        Grade grade1 = new Grade();
        Grade grade2 = new Grade();
        Grade grade3 = new Grade();

        Map<Student, Grade> semesterGrades = new HashMap<>();
        semesterGrades.put(student1, grade1);
        semesterGrades.put(student2, grade2);
        semesterGrades.put(student3, grade3);
        semesterGrades.forEach((student, grade) -> System.out.println(student.toString()+grade.toString()));


       /* Comparator<Student> studentComparator = new StudentNameComparator();*/
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

       /* Collections.sort(students, new StudentNameComparator());*/

        for(Student  student : students){

            System.out.println(student);
        }

    }
}
