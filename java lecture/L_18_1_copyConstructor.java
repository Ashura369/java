// copy constructor

class person {
    String name;
    int age;

    person(){
        System.out.println("WELCOME TO CONSTRUCTOR");
    }

    person(String name, int age){
        this.name = name;
        this.age = age;
    }

    person(person a){ // here we passed one object of its own type // here you can write whatever name you want, its just a parameter for p2 in the main
        this.name = a.name;
        this.age = a.age;
    }

    void printDetails(){
        System.out.println("Name of the person is "+name+", and the age is "+age);
    }
}

class man extends person{
    man(){
        System.out.println("HII THIS IS A MAN");
    }
}

class woman extends person{
    woman(){
        System.out.println("HII THIS IS A WOMAN");
    }
}


public class L_18_1_copyConstructor {
    public static void main(String[] args) {

        person p0 = new person();
        
        person p1 = new person("Alice", 25);
        System.out.println("Original Person : ");
        p1.printDetails();

        System.out.println();
        person p2 = new person(p1); // when you run this the person function will be called where inside of it another person object has been passsed
        System.out.println("Copied Person : ");
        p2.printDetails();

        System.out.println();
        person p3 = new person("Marcus", 28);
        System.out.println("Original Person : ");
        p3.printDetails();
        
        System.out.println();
        person p4 = new person(p3);
        System.out.println("Copied Person : ");
        p4.printDetails();
        
        System.out.println();
        man m1 = new man(); // when you call "man", automatically "person" constructor will be called.
        m1.name = "Ravi";   // here we were able to assign name and age bcoz class "man" inherits person class
        m1.age = 28;
        m1.printDetails();
        
        System.out.println();
        woman w1 = new woman(); // same goes with the woman constructor

    }
}
