// learning abstraction
// When you declare a class or method as abstract, it means it serves only as a blueprint for other classes or methods. You can inherit and implement its features, but you cannot instantiate or use it directly.

// if you write private in the animal class, you will not be inherit any values from it, but if you write abstract, you wil be able to inherit values

abstract class animal { // just try to write private in place of abstract here, and you will be able to see the exact difference btwn abstraction and (data hinding) private

    abstract void walk(); // KEEP IN MIND THAT, WHENEVER YOU ARE USING ABSTRACTION ON A FUNCTION MAKE SURE THAT IT MUST NOT A HAVE A BODY, SO REMOVE THE BODY BY REMOVING THE CURLY BRACES, BCOZ ALL THE BODIES ARE WRITTEN INSIDE THE BODY.

    void walk2(){
        System.out.println("This is animal");
    }

    void eat(){
        System.out.println("Animal eats.");
    }

    animal(){ // here we have made a animal constructor (make sure its not a function, its a consstructor. Donot hold any kind of return type, not even "void") // if you put abstract here it will throw error bcoz its being called from the main function (horse h1 = new horse();)
        System.out.println("THIS IS AN ANIMAL");
    }
}

class horse extends animal{
    void walk(){
        System.out.println("Has four legs");
    }

    horse(){ // here we have made horse constructor
        System.out.println("THIS IS A HORSE");
    }
}
class chicken extends animal{
    void walk(){
        System.out.println("Has two legs");
    }
}


public class L_18_5_0_abstraction {
    public static void main(String[] args) {
        
        horse h1 = new horse(); // so once you call the horse constructor, first the animal constructor will be executed as being its parent class, and then the horse constructor will be executed

        System.out.println();
        h1.walk();
        // h1.walk2(); // you can still use the walk function 

        chicken c1 = new chicken();
        c1.walk();

        // animal a1 = new animal(); // if you try to uncomment this code and try to run it, will throw an error
        // a1.walk();

        h1.eat();
        h1.walk();


    }
}
