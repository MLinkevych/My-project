package schoolMarksProject;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher(1, "Anna Makarenko", "t1@gmail.com", "1a" );
        Parent p1 = new Parent("Andrey Kryk", "p1@gmail.com");
        Parent p2 = new Parent("Ivan Koval", "p2@gmail.com");
        Student s1 = new Student("1a", "Ivan Kryk");
        Student s2 = new Student("1a", "Anna Koval");

        s1.addParent(p1);
        s2.addParent(p2);


    }
}
