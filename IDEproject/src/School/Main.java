package School;

import School.Student;

public class Main {
    public static void main(String[] args) {
        Student julia = new Student("julia", 22, "F", "12345678");
        System.out.println(julia.getName());
        System.out.println(julia.getAge());
        System.out.println(julia.getGender());
        System.out.println(julia.getID_NO());
    }
}
