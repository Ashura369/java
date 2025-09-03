// Inheritance -- It allows a class (child/derived/subclass) to acquire properties and behaviors (fields and methods) of another class (parent/base/superclass).
// In Java, a class cannot have more than one parent class — this means multiple inheritance with classes is not allowed.
// Inheritance in java is a one way relationship, hence two classes can't inherit each-other

class parent{
    String name;
    int age;

    parent(String name, int age){
        this.name = name;
        this.age = age;
    }

    void printParent(){
        System.out.println("This is parent class with name "+ name+ " with age "+age);
    }
}

class child extends parent{
    child(String name, int age){ 
        super(name, age);        // super is a reference keyword in Java that is used inside a child (subclass) to directly refer to its parent (superclass).

        // "super" can only be used inside a constructor, not inside a method
    }

        /*

            When we write super(name, age) inside the child class constructor, it means that the values we pass into the child constructor are directly forwarded to the constructor "parent" that takes both name and age as parameters. 
            
            For example, if we create an object using new Child("Alice", 25), the child constructor receives "Alice" and 25, then immediately calls super("Alice", 25). This executes the parent’s constructor with those same values, so the parent class initializes its own name and age fields before control returns to the child constructor. In this way, the parent part of the object is properly set up first, and then the child constructor can continue with its own initialization.

        */

    void printChild(){
        System.out.println("This is child class with name "+ name+ " with age "+age);
    }
}

public class L_18_3_inheritance {
    public static void main(String[] args) {
        parent p1 = new parent("king", 20);
        p1.printParent();
        // p1.name = "King";

        child c1 = new child("Prince", 19);     // here child is accesing parent class through inheritance, by this we can use the fields and methods from another class 
        c1.printParent(); // here it will print "king" as the name bcoz, its being called by the c1 and it will take the name as input by the c1
        c1.printChild();
    }
}
