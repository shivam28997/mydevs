package accessmodifier;


// Same package client trying to access the Box class
public class Client {
    public static void main(String[] args) {

        // Static
        // static printMe can be accessed within the same package only
        Box. printMe();

        // we don't need to import the Box class as both are in the same package
        Box b1 = new Box();

        // Package Private
        System.out.println(b1.height);

        // Public
        System.out.println(b1.breadth);

        // Private
        // can not be accessed here as width has the private access
        /*System.out.println(b1.width);*/

        // But if there is any public method which can return the private width
        // this way we will be able to get the width but the method should gave
        // the public access

        System.out.println(b1.getWidth());

        // Protected
        // We can access the protected length in the same package
        // So basically Protected is Package private but if there is a class that inherits
        // This class then also we can access the protected fields
        System.out.println(b1.length);
    }
}
