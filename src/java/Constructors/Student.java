package Constructors;

public class Student {
    String name;
    private int id;
    private int totalProblemSolved;

    //parametered construcor
    Student(String name, int id, int totalProblemSolved)  {
        this.name = name;
        this.id = id;
        this.totalProblemSolved = totalProblemSolved;

    }

    //copy constructor
    Student(Student other) {
        this.name = other.name;
        this.id = other.id;
        this.totalProblemSolved = other.totalProblemSolved;
    }
}
