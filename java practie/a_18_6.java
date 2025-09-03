// practicing abstraction with Species and Human

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
    Animal(String name2, int height, String gender, String country) {
        this.name2 = name2;
        this.height = height;
        this.gender = gender;
        this.country = country;
    }

    abstract void add();
    abstract void print();
}

// ================== Species ==================
class Species extends Animal {
    static Species head;   // first node
    Species next;          // link to next

    Species(String species, String name, int legs, int age) {
        super(species, name, legs, age);  // calls Animal constructor for Species
    }

    // Dummy add() (not used directly in this version)
    void add() {}

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

    void print() {
        Species temp = head;
        while (temp != null) {
            System.out.println(temp.species + ", " + temp.name1 + ", " + temp.legs + ", " + temp.age1);
            temp = temp.next;
        }
    }
}

// ================== Human ==================
class Human extends Animal {
    static Human head;   // first node
    Human next;          // link to next

    Human(String name, int height, String gender, String country) {
        super(name, height, gender, country);  // calls Animal constructor for Human
    }

    // Dummy add() (not used directly in this version)
    void add() {}

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

    void print() {
        Human temp = head;
        while (temp != null) {
            System.out.println(temp.name2 + ", " + temp.height + ", " + temp.gender + ", " + temp.country);
            temp = temp.next;
        }
    }
}

// ================== MAIN ==================
public class a_18_6 {
    public static void main(String[] args) {
        // Species test
        Species s = new Species("Dummy", "Dummy", 0, 0); // just to use add
        s.add("Dog", "Hulk", 4, 10);
        s.add("Cat", "Kitty", 4, 5);
        s.add("Bird", "Tweety", 2, 2);

        System.out.println("=== Species List ===");
        s.print();

        // Human test
        Human h = new Human("Dummy", 0, "Dummy", "Dummy"); // just to use add
        h.add("Alice", 165, "Female", "USA");
        h.add("Bob", 180, "Male", "UK");
        h.add("Charlie", 170, "Male", "India");

        System.out.println("\n=== Human List ===");
        h.print();
    }
}
