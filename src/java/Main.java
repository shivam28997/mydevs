public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Object 1
        Student shivam = new Student("shivam", 1);

        //Object 2
         Student satyam = new Student("satyam", 2);

         shivam.solveProblem(10);
         satyam.solveProblem(25);

         satyam.solveProblem(10);
         shivam.solveProblem(45);
    }
}