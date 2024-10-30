import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private final String name;
    private List<Student> students;

    public Teacher(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.addTeacher(this);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void print() {
        System.out.println("Teacher: " + name);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }
}
