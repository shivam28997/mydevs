package abstractclasses;

public abstract class User {

    private String name;

    User(String name) {
        this.name = name;
    }

    // Class 'User' must either be declared abstract or implement abstract method 'login()' in 'User'
    public abstract void login();

    public void study() {
        System.out.println(name + "Studying");
    }
}
