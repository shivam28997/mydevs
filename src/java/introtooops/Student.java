package introtooops;

public class Student {
    private String name;
    private int id;
    private int totalProblemSolved;

    public void solveProblem(int count) {
        this.totalProblemSolved += count;
        System.out.println(this.name + " solved " + totalProblemSolved);
    }

    // private Constructor which can not be accessed in other classes
    private Student() {
        id = 1;
        totalProblemSolved = 2;
        name = "shivam";

        System.out.println("Constructor is called ");
    }

    //parametered constructor

    Student(String name, int id) {
        id = 1;
        totalProblemSolved = 2;
        name = "shivam";

        System.out.println("Constructor is called ");
    }

}