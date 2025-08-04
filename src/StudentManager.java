import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");

    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\n---------------------- STUDENTS LIST ----------------------\n");
            students.forEach(student -> System.out.println(student + "\n"));
            System.out.println("\n----------------------- END OF LIST -----------------------\n");
        }
    }

    public void viewStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void updateStudent(int id, int age, String name, String course) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setAge(age);
                student.setName(name);
                student.setCourse(course);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
