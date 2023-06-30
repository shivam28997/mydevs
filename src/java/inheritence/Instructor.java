package inheritence;

public class Instructor extends User{

    /*As we are extending the User class in the Instructor class and using the properties of User
    Suppose we have constructors of both the classes the parent and the child
    Which constructor will be called first ?
    The answer is the parent class constructor will be called first
    why ?
    Because we are inheriting some attributes from the parent class that's why the constructor
    of parent class is called first*/

    Instructor(String name) {
        // Keyword super calls the constructor of the base class
        // In case of parameterized constructors we always have to use super keyword
        // we need to specify which constructor to be called
        /*super(name);*/   // should be used if name is private

        // other-wise below line of code can also set the name
        this.name = name;   // this will call the default constructor
        System.out.println("Constructor of Instructor");
    }

    Instructor () {
        System.out.println("Default Constructor of Instructor");
    }

    void teach() {
        // By extending the user class I am able to use the name which was the property of User
        System.out.println(name + " is teaching");

        // In User class the email attribute has the private access so it can not be accessed here
        // But we are extending user so will we have the email attribute for instructor also ?
        // So the answer is the child class will have all the attributes but we can not access if
        // private access modifier is there or some other which does not allow the access

        /*System.out.println("teachers email address : " +email);*/


        // Although email has private access but if we have some method which can be accessed
        // outside and the is using that private attribute then we can see that private attribute
        // in the class where that method is called
        // for example login method uses name(public) and email(private) we can not directly access the email
        // but by using login method we can see the email

        login();

    }
}