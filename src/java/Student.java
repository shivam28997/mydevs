public class Student {
    private String name;
    private int id;
    private int totalProblemSolved;

    public void solveProblem(int count) {
        this.totalProblemSolved += count;
        System.out.println(this.name + " solved " + totalProblemSolved);
    }

    //Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.totalProblemSolved = 0;
    }
}
