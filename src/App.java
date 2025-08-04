
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        int choice;
        // Scanner sc = new Scanner(System.in);
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("\n---------------------- STUDENT MANAGEMENT SYSTEM ----------------------\n");
                System.out.println(
                        "1. Add Student\n2. View All Students\n3. View Student By Id\n4. Update Student\n5. Delete Student\n6. Exit");
                choice = sc.nextInt();
                System.out.println();

                switch (choice) {
                    case 1 -> {
                        // add student
                        System.out.println("Enter ID: ");
                        int id = sc.nextInt();
                        System.out.println("Enter Age: ");
                        int age = sc.nextInt();
                        System.out.println("Enter Name: ");
                        String name = sc.next();
                        System.out.println("Enter Course: ");
                        String course = sc.next();
                        manager.addStudent(new Student(id, age, name, course));
                        break;
                    }
                    case 2 -> {
                        // view all students
                        manager.viewAllStudents();
                        break;
                    }
                    case 3 -> {
                        // view student by id
                        System.out.println("Enter ID: ");
                        int id = sc.nextInt();
                        manager.viewStudentById(id);
                        break;
                    }
                    case 4 -> {
                        // update student
                        System.out.println("Enter ID: ");
                        int id = sc.nextInt();
                        System.out.println("Enter Age: ");
                        int age = sc.nextInt();
                        System.out.println("Enter Name: ");
                        String name = sc.next();
                        System.out.println("Enter Course: ");
                        String course = sc.next();
                        manager.updateStudent(id, age, name, course);
                        break;
                    }
                    case 5 -> {
                        // delete student
                        System.out.println("Enter ID: ");
                        int id = sc.nextInt();
                        manager.deleteStudent(id);
                        break;
                    }
                    case 6 -> {
                        // exit
                        System.out.println("Exiting...");
                        break;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 6);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
