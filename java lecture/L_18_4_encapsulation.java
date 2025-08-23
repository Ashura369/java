// learning Encapsulation -- concept of wrapping data (variables/fields) and methods (functions) into a single unit (class) and restricting direct access to some components.


class human{
    // private int age; // if you uncomment this line, that means you can only access the "age" only inside the "human" class. You will not be able to access from "main" function
    private int age = 11;
    private String name = "Mohan";

    void changeAge(int age){ // this is how you can change a private variable by making a method
        this.age = 22;
    }

    public void print() {
        System.out.println(age+" "+name);
    }

    // in the above example we have made the variables private and assigned values into it, and also at the same time made  a print function which is "public" so that we can acces it from main function

}

class human2 {
    // in the former human class we were assigning values inside the class, in human2 we will be assigning values from outside

    private int age;
    private String name;

    public int inputAge(int a){
        return age = a;
    }

    public String inputName(String b){
        return name = b;
    }

    public void input(int a, String b){
        this.age = a;
        this.name = b;
    }

    // if you comment out the below "print" function and put "extends human" in the calss it will automatically take the print function form human. But the only issue here is, the print function inside the human class will only print Mohan and 11, bcoz we have input both the values there and made it private 

    void print(){
        System.out.println(age+" "+name);
    }

}

public class L_18_4_encapsulation {
    public static void main(String[] args) {
        human h1 = new human();
        // h1.age = 11;
        // h1.name = "Mohan";
        h1.print();
        h1.changeAge(22); // here we changed age
        h1.print();
        

        System.out.println("*************************************");
        human2 h2_1 = new human2();
        h2_1.inputAge(12);
        h2_1.inputName("Kanika");
        h2_1.print();
        
        System.out.println("*************************************");
        human2 h2_2 = new human2();
        h2_2.input(23, "Madhu");
        h2_2.print();

    }
}

/*

Suppose i make some variables private in the parent class and now i am making a child class which inherits the parents class, so if i assign values will i be able to access elements from parent ???


class Parent {
    private String name;   // private → child cannot access directly

    public void setName(String name) {
        this.name = name;   // controlled access
    }

    public String getName() {
        return name;
    }
}

class Child extends Parent {
    public void printName() {
        // System.out.println(name); // ❌ ERROR (private not accessible)
        System.out.println(getName()); // ✅ Accessible via getter, bascially you can access it by making a function
    }
}

*/