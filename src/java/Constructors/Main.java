package Constructors;

public class Main {
    public static void main(String[] args) {
        Performance p1 = new Performance();
        Student s1 = new Student("Shivam", 28, 500, p1);
        Student s2 = new Student(s1);

        System.out.println(s1.performance.marks);   //output = 590

        s2.performance.marks = 100;

        System.out.println(s1.performance.marks);  // output = 100

        /*So here we are not modifying the object still the value of marks changed
                because they are pointing to the same object*/
    }
}
