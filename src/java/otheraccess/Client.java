package otheraccess;

import accessmodifier.Box;
// Different package client trying to access the Box class from other package
public class Client {
    public static void main(String[] args) {

        // Static
        // static printMe without any modifier is package private only can be accessed within the same package only
        // but if it is public static then it can be accessed in other package also

        /*Box.printMe();*/


        // We can see that there is an import statement added in the class for Box class
        Box b1 = new Box();

        // height will not be able to access as the height is package private protected by default
        // although the height will be accessible in the same package without having any modifier but
        // within the same package only

        //Package Private
        // and can not be accessed in different package
        /*System.out.println(b1.height);*/

        // Public
        System.out.println(b1.breadth);

        // Private width
        // can not be accessed in other package as well
        /*System.out.println(b1.width);*/

        // But if there is any public method which can return the private width
        // this way we will be able to get the width but the method should gave
        // the public access so it can be done in other package also

        System.out.println(b1.getWidth());


        // Protected
        // We can not access the protected length in the different packages

        /*System.out.println(b1.length);*/
    }
}
