/*  
polymorphism = poly (many) + morphism (forms)

It has two types;
    1/ function overloading -- When two or more methods in the same class have the same name 
       but different parameters (different type, number, or order of arguments), 
       it’s called method overloading.
    2/ function overriding
*/

class student {
    String name;
    int age;

    // constructor
    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method overloading examples
    void printInfo(String name) { // if you are making another function  like printInfo with the same parameter, then both of these function's return type must not be same (if one is void then another function must not be of the type "void", it must be of another return type)

    // even if you want to have the same return type you can do so, but the parameter passed inside them must be different

        System.out.println("NAME -- " + name);
    }

    void printInfo(int age) {
        System.out.println("AGE -- " + age);
    }

    void printInfo() {
        System.out.println("The name is " + name + ", and age is " + age);
    }

    void printInfo(String name, int age) {
        System.out.println("The name is " + name + ", and age is " + age);
    }
}


// main class must be OUTSIDE student
public class L_18_2_polymorphism {
    public static void main(String[] args) {
        student s1 = new student("Ashura", 25);

        s1.printInfo("Ashura");          
        s1.printInfo(s1.name);           
        s1.printInfo(25);                
        s1.printInfo(s1.age);            
        s1.printInfo();                  
        s1.printInfo(s1.name, s1.age);    
    }
}
