package inheritence;

import java.util.List;

public class Main {

    private static void printName(List<User> users) {
        for (User u : users) {
            System.out.println(u.name);
        }
    }

    public static void main(String[] args) {

        // name property of Instructor will changes from default to Shivam as we are paasing it to the
        // constructor of the instructor class

        Instructor instructor = new Instructor("Rahul");
        instructor.login();
        instructor.teach();

        // Parent can hold the object of child class
        // but in this case the object will hold the properties
        // and attributes of parent class only

        // in the below code we can see that we treated instrutoress as User
        // so it has login() property but it does not have the
        // teach() property it will only show the behaviors of User only
        User instructoress = new Instructor();
        instructoress.login();

        /*Instructor instructor1 = new User();*/  // this will not work as Instructor will not be able to do it


        // As we have typecasted instructor into user it will have the company property
        // although it belongs to the instructor but it is currently behaving like User only
        // so basically instructor has taken a form of user and that is actually polymorphism

        /*instructoress.company;*/
        /*instructoress.teach();*/

        // but by further typecasting into instructor we can get the company and teach property of instructoress

        System.out.println(((Instructor) instructoress).company);

        // Above we set instructoress as the instance of User still it will be still an instance of Instructor although
        // it is sitting in the form of User
        // the below if block will be executed although instructoress is form of User

        if (instructoress instanceof Instructor) {
            System.out.println("Instructor is instance of User");
        }


        printName(List.of(new Student("Shivam"), new Instructor("Anshuman"), instructor, instructoress));
    }
}
