package abstractclasses;

public class Main {
    public static void main(String[] args) {

        // 'User' is abstract; cannot be instantiated
       // User u = new User("Shivam");

        Students student = new Students("Shivam ");
        student.login();
        student.study();

    }
}
