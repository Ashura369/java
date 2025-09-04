interface Methods {
    void print();    
}

// Abstract base
abstract class Animal {
    // For Species
    String species;
    String name1;
    int legs;
    int age1;

    // For Human
    String name2;
    int height;
    String gender;
    String country;

    // Constructor for Species
    Animal(String species, String name1, int legs, int age1) {
        this.species = species;
        this.name1 = name1;
        this.legs = legs;
        this.age1 = age1;
    }

    // Constructor for Human
    Animal(String name2, int height, String gender, String country, boolean isHuman) {
        this.name2 = name2;
        this.height = height;
        this.gender = gender;
        this.country = country;
    }
}

class Species extends Animal implements Methods {
    static Species head;   // first node
    Species next;          // link to next

    Species(String species, String name, int legs, int age) {
        super(species, name, legs, age);
    }

    // Custom add() for Species
    void add(String species, String name, int legs, int age) {
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

    
    public void print() {
        Species temp = head;
        while (temp != null) {
            System.out.println(temp.species + ", " + temp.name1 + ", " + temp.legs + ", " + temp.age1);
            temp = temp.next;
        }
    }
}

class Human extends Animal implements Methods {
    static Human head;   // first node
    Human next;          // link to next

    Human(String name, int height, String gender, String country) {
        super(name, height, gender, country, true);
    }

    // Custom add() for Human
    void add(String name, int height, String gender, String country) {
        if (head == null) {
            head = new Human(name, height, gender, country);
            return;
        }

        Human temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Human(name, height, gender, country);
    }

   
    public void print() {
        Human temp = head;
        while (temp != null) {
            System.out.println(temp.name2 + ", " + temp.height + ", " + temp.gender + ", " + temp.country);
            temp = temp.next;
        }
    }
}

public class a_0_error {
    public static void main(String[] args) {
        Species s = new Species("Mammal", "Lion", 4, 10);
        s.add("Mammal", "Tiger", 4, 8);
        s.add("Bird", "Eagle", 2, 5);

        System.out.println("Species:");
        s.print();

        Human h = new Human("Alice", 165, "Female", "USA");
        h.add("Bob", 180, "Male", "UK");
        h.add("Charlie", 170, "Male", "India");

        System.out.println("\nHumans:");
        h.print();
    }
}