package abstractclasses;

public class Students extends User implements Loggeable{

    Students(String name) {
        super(name);
    }

    @Override
    public void login() {
        System.out.println("Logging in user");
    }

    @Override
    public void study() {
        super.study();
    }
}