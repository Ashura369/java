// copy constructor

class person {
    String name;
    int age;

    person(String name, int age){
        this.name = name;
        this.age = age;
    }

    person(person theCopy){ // here we passed one object of its own type
        this.name = theCopy.name;
        this.age = theCopy.age;
    }

    void printDetails(){
        System.err.println("Name: "+name+", Age: "+age);
    }
}


public class L_18_1 {
    public static void main(String[] args) {
        person p1 = new person("Alice", 25);
        System.err.println("Original Person : ");
        p1.printDetails();

        System.err.println();
        person p2 = new person(p1);
        System.err.println("Copied Person : ");
        p2.printDetails();



    }
}
