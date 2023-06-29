package Constructors;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Shivam", 28, 500);

        Student s2 = new Student(s1);
        System.out.println(s2.name);
    }
}
