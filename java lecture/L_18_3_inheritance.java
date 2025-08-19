// Inheritance -- It allows a class (child/derived/subclass) to acquire properties and behaviors (fields and methods) of another class (parent/base/superclass).
// In Java, a class cannot have more than one parent class — this means multiple inheritance with classes is not allowed.
// Inheritance in java is a one way relationship, hence two classes can't inherit each-other

class parent{
    String name;

    parent(String name){
        this.name = name;
    }

    void printParent(){
        System.out.println("This is parent class with name "+ name);
    }
}

class child extends parent{
    child(String name){ 
        super(name);        // super is a reference keyword in Java that is used inside a child (subclass) to directly refer to its parent (superclass).
    }

    void printChild(){
        System.out.println("This is child class with name "+ name);
    }
}

public class L_18_3_inheritance {
    public static void main(String[] args) {
        parent p1 = new parent("king");
        p1.printParent();
        // p1.name = "King";

        child c1 = new child("Prince");     // here child is accesing parent class through inheritance, by this we can use the fields and methods from another class 
        c1.printParent(); // here it will print "king" as the name bcoz, its being called by the c1 and it will take the name as input by the c1
        c1.printChild();
    }
}
