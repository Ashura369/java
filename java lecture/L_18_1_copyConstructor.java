// copy constructor

class person {
    String name;
    int age;

    person(String name, int age){
        this.name = name;
        this.age = age;
    }

    person(person p1){ // here we passed one object of its own type // here instead of p1 you can write whatever name you want, its just a parameter for p2 in the main
        this.name = p1.name;
        this.age = p1.age;
    }

    void printDetails(){
        System.err.println("Name: "+name+", Age: "+age);
    }
}


public class L_18_1_copyConstructor {
    public static void main(String[] args) {
        person p1 = new person("Alice", 25);
        System.err.println("Original Person : ");
        p1.printDetails();

        System.err.println();
        person p2 = new person(p1); // when you run this the person function will be called where inside of it another person object has been passsed
        System.err.println("Copied Person : ");
        p2.printDetails();



    }
}
