public class Student {
    int id;
    int age;
    String name;
    String course;

    public Student(int id, int age, String name, String course) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public void getters() {
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nAge: " + age + "\nName: " + name + "\nCourse: " + course;
    }
}