package TascaS108Lambdas.Student;

import java.util.List;


class Student {
    private String name;
    private int age;
    private String year;
    private double grade;

    public Student(String name, int age, String year, double grade) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getYear() {
        return year;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", year='" + year + '\'' +
                ", grade=" + grade +
                '}';
    }
}

public class Exercise31 {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 20, "JAVA", 6.5),
                new Student("Bob", 19, "PHP", 4.0),
                new Student("Anna", 22, "C++", 7.0),
                new Student("Andrew", 21, "JAVA", 5.5),
                new Student("Steve", 23, "PHP", 3.5),
                new Student("Laura", 20, "JAVA", 8.0),
                new Student("Adam", 24, "PHP", 6.0),
                new Student("Michael", 18, "JAVA", 7.5),
                new Student("Eve", 22, "Python", 9.0),
                new Student("John", 21, "PHP", 5.0)
        );

        System.out.println("Names and ages of all students:");
        students.forEach(student -> System.out.println(student.getName() + " - " + student.getAge()));

        System.out.println("\nStudents whose name starts with 'A':");
        students.stream()
                .filter(student -> student.getName().toLowerCase().startsWith("a"))
                .forEach(System.out::println);

        System.out.println("\nStudents with a grade of 5 or higher:");
        students.stream()
                .filter(student -> student.getGrade() >= 5)
                .forEach(System.out::println);

        System.out.println("\nStudents with a grade of 5 or more and not from PHP:");
        students.stream()
                .filter(student -> student.getGrade() >= 5)
                .filter(student -> !student.getYear().equalsIgnoreCase("PHP"))
                .forEach(System.out::println);

        System.out.println("\nJAVA students who are of legal age:");
        students.stream()
                .filter(student -> student.getYear().equalsIgnoreCase("JAVA"))
                .filter(student -> student.getAge() >= 18)
                .forEach(System.out::println);
    }
}
