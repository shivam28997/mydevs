package accessmodifier;

public class Box {

    // Static
    // This static method is common for all the objects
    // So to call this only there is no need to instanciate any object

    static int time_pass = 10;

    static void printMe() {
        System.out.println("I am a Box");

        // Non static properties can not be accessed in the static block
        // but the static fields can be accessed in whole class or in non static method

        /*System.out.println(width + length + height + breadth);*/
    }

    // Private
    // Can be accessed only within the same class in which the variable has been declared
    // See the getWidth method below
    private int width = 1;


    // Package private
    // No access modifier -> default -> Private package
    // and it will work for any class, variable or method also

    // So I will make the Box class with no access modifier
    // It will not be accessible to other packages but within
    // this package everything will work seamlessly

    int height = 2;

    // Public
    public int breadth = 3;

    // Protected

    protected int length = 4;

    public int getWidth() {
        // static field can be accessed in non-static block
        time_pass+= 60;
        System.out.println(time_pass);

        return width;
    }
}
