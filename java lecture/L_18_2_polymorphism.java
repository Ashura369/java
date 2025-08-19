/*  polymorphism = poly (many) + morphism (forms)

It has two types;
    1/ function overloading -- When two or more methods in the same class have the same name but different parameters (different type, number, or order of arguments), it’s called method overloading.
    2/ function overwriting

*/

class student{
    String name;
    int age;

    student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void printInfo(String name){
        System.out.println("NAME -- "+name);
    }
    void printInfo(int age){
        System.out.println("AGE -- "+age);
    }
    void printInfo(){
        System.out.println("The name is "+name+", and age is "+age);
    }
    void printInfo(String name, int age){
        System.out.println("The name is "+name+", and age is "+age);
    }

public class L_18_2_polymorphism {
    public static void main(String[] args) {
        student s1 = new student("Ashura", 25);
        s1.printInfo(25);
        s1.printInfo("Ashura");
        s1.printInfo();
        s1.printInfo(s1.name, s1.age);
    }
}
}
