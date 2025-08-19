// copy constructor

class person {
    String name;
    int age;

    person(String name, int age){
        this.name = name;
        this.age = age;
    }

    person(person a){ // here we passed one object of its own type // here instead of p1 you can write whatever name you want, its just a parameter for p2 in the main
        this.name = a.name;
        this.age = a.age;
    }

    void printDetails(){
        System.out.println("Name of the person is "+name+", and the age is "+age);
    }
}


public class L_18_1_copyConstructor {
    public static void main(String[] args) {
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


    }
}
