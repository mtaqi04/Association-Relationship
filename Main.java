public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Smith");
        Teacher teacher2 = new Teacher("Ms. Johnson");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student1);

        teacher1.print();
        teacher2.print();

        student1.print();
        student2.print();
    }
}
