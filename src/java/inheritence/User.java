package inheritence;

public class User {

    String name = "default";
    private String email = "default@google.com";
    int age = 10;

    User(String name) {
        this.name = name;
        System.out.println("Constructor of User class");
    }

    User() {
        System.out.println("Default Constructor of User class");
    }


    void login() {
        System.out.println(name + " is logged in with " + email);
    }
}
