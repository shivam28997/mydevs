package inheritence;

public class Main {

    public static void main(String[] args) {

        // name property of Instructor will changes from default to Shivam as we are paasing it to the
        // constructor of the instructor class

        Instructor instructor = new Instructor("Shivam");
        instructor.login();
        instructor.teach();

    }
}
