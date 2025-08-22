

interface Animal {
    int age = 5; // if you declare any variable here, it will always be same. You will never be able to change it
    void walk();  // abstract method (by default: public + abstract) // KEEP IN MIND THAT WHEN YOU ARE USING interface YOU CAN'T DECLARE THE BODY
    void eat();   // another abstract method
}

//	A class that implements an interface must implement all the methods declared in the interface.
// Interfaces support the functionality of multiple inheritance
class Horse implements Animal { // REMEMBER WHEN YOU ARE USING interface YOU HAVE TO USE "implements", you cant  use extend here
    public void walk() {   // must override
        System.out.println("Horse walks on 4 legs.");
    }

    public void eat() {    // must override
        System.out.println("Horse eats grass.");
    }

    // REMEMBER YOU CAN ALSO DECLARE MORE METHODS IN THIS CLASS OUTSIDE OF THE Animal CLASS

}

// Class chicken implements the interface
class Chicken implements Animal {
    public void walk() {   // must override
        System.out.println("Chicken walks on 2 legs.");
    }

    public void eat() {    // must override
        System.out.println("Chicken eats grains.");
    }
}

public class L_18_5_2 {
    public static void main(String[] args) {
        // You cannot create object of interface, but you can reference it
        Animal h1 = new Horse();   // interface reference → Horse object
        h1.walk();  // Horse’s implementation
        h1.eat();

        Animal c1 = new Chicken(); // interface reference → Chicken object
        c1.walk();  // Chicken’s implementation
        c1.eat();
    }
}
