import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private List<Teacher> teachers;

    public Student(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void print() {
        System.out.println("Student: " + name);
        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(" - " + teacher.getName());
        }
    }
}
