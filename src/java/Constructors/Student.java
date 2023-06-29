package Constructors;

public class Student {
    String name;
    private int id;
    private int totalProblemSolved;
    Performance performance;

    //parametered construcor
    Student(String name, int id, int totalProblemSolved, Performance performance)  {
        this.name = name;
        this.id = id;
        this.totalProblemSolved = totalProblemSolved;
        this.performance = performance;

    }

    //copy constructor
    Student(Student other) {
        this.name = other.name;
        this.id = other.id;
        this.totalProblemSolved = other.totalProblemSolved;
        // this is for shallow copy
        /*this.performance = other.performance;*/

        // this is for deep copy
        this.performance = new Performance(other.performance);

        /*we actually created a new object in the copy constructor by
         this.performance = new Performance(other.performance)
         so performance which is an object took an address and created
         a new performance object and then stored */
    }
}
