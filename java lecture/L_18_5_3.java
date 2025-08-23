// First interface
interface Animal {
    void eat();
}

// Second interface
interface Pet {
    void play();
}

// Dog class implements both interfaces
class Dog implements Animal, Pet { // KEEP IN MIND THAT EVERY METHOD DECLARED INSIDE THE interface CLASS MUST BE DELCARED INSIDE THE CLASS THAT implements IT
    public void eat() {
        System.out.println("Dog eats food");
    }

    public void play() {
        System.out.println("Dog plays fetch");
    }
}

public class L_18_5_3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
