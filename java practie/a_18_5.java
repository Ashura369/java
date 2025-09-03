// practicing abstraction 

abstract class Animal{
    String species;
    String name;
    int legs;
    int age;
    int height;
    String gender;
    String country;

    Animal(){   // since child constructors must call the parent constructor (with as same parameter) hence in Animal class i had to declare a Animal constructor with no parameter as in the Species constructor

    }

    // Species
    Animal(String species, String name, int legs, int age){
        this.species = species;
        this.name = name;
        this.legs = legs;
        this.age = age;
    }
    
    abstract void add(String species, String name, int legs, int age);
    abstract void print();

    // Human
    Animal(String name, int height, String gender, String country){
        this.name = name;
        this.height = height;
        this.gender = gender;
        this.country = country;
    }
}


class Species extends Animal{
    static Species head;                 // IMP
    Species next;                           // IMP
    
    Species(){

    }

    Species(String species, String name, int legs, int age) {
        super(species, name, legs, age);
    }

    void add(String species, String name, int legs, int age){
        if (head == null) {
            head = new Species(species, name, legs, age);
            return;
        }

        Species temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Species(species, name, legs, age);
    }

    void print(){
        Species temp = head;
        while (temp != null) {
            System.out.println(temp.species+", "+temp.name+", "+temp.legs+", "+temp.age);
            temp = temp.next;
        }
    }
}

class Human extends Animal{
    static Human head;  // linked list head
    Human next;

    Human(){}

    Human(String name, int height, String gender, String country){
        super(name, height, gender, country);
    }

     // override add() → for humans
    @Override
    void add(String name, String dummy, int height, int age) {
        // I’m reusing parameters to match the abstract method signature
        // here: name = person's name, dummy = unused, height = height, age = ignored
        if (head == null) {
            head = new Human(name, height, dummy, ""); // gender= dummy, country empty (simplify)
            return;
        }

        Human temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Human(name, height, dummy, "");
    }

    // override print() → for humans
    @Override
    void print() {
        Human temp = head;
        while (temp != null) {
            System.out.println(temp.name + ", " + temp.height + ", " + temp.gender + ", " + temp.country);
            temp = temp.next;
        }
    }

    
}


public class a_18_5 {
    public static void main(String[] args) {
        Animal a1 = new Species();      // we are using the  blueprint from Animal class, but creating object in Species class
            // to use it like this, you need to declare this (abstract void add(String species, String name, int legs, int age);) in the Animal class
        a1.add("Dog", "Hulk", 4, 200);  // when i call adds(), then add() from a1 class would be called, which then again will call to add() in Species class
        a1.add("Cat", "Kitty", 4, 5);
        a1.add("Bird", "Tweety", 2, 2);
        a1.print();

        /*
            We had to write these "add" and "print" function in Animal class bcoz, 
            
            a1 is of type Animal. The compiler only looks at the Animal blueprint to check wheather if add() and print() funtion exists or not.
        */

        System.out.println("*****************************");


        // Human
        Animal a2 = new Human();
        a2.add("John", "Male", 180, 0);   // name, gender, height, age(dummy)
        a2.add("Alice", "Female", 165, 0);
        a2.print();
        // the way human class implements the use of add function, its completely utter garbage, bcoz if you declare any funciton inside the parent class,  you have to implement it in all of its child classes

        // there is a better way to do this, check "a_18_6.java"
    }
}
