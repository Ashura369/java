// here we will learn about how inheritance works and how we can use the value from one class in another class
/*

There are different types of inheritance 
    1/ single inheritance

        class A {}
        class B extends A {}

    2/ multidimensional inheritance

        class A {}
        class B extends A {}
        class C extends B {} 

    3/ hierarchical inheritance

        class A {}
        class B extends A {}
        class C extends A {}


    Java doesn't suppoert multiple inheritance with classes 

    // This is NOT allowed in Java
    class A {}
    class B {}
    class C extends A, B {} // ❌ Error

    Two classes can't be inheritance to each other

*/

class grandParent{
    String name; 
    String title;   
    int age;

    grandParent(String name, String title, int age){
        this.name = name;
        this.title = title;
        this.age = age;
    }

    void  print(){
        System.out.println("name - "+name+" "+title+", age - "+age);
    }
}

class parent extends grandParent{
    // String name;  //  // Don't redeclare name, title, or age! (bcoz we are going to inherit the type of these three values from "grandParent" class)
    // String title;   
    // int age;

    parent(String name, String title, int age){
        super(name, title, age);
    }
    /*

    parent(parent p, String name){
        this.name = name;
        this.title = p.title;
        this.age = p.age;
    }

        here if we try to run the above code it will throw error, bcoz we have used inheritance here. So we need to explicitely call "super(...)"here. hence look for the code below

    */

    parent(parent p, String name){
        super(name, p.title, p.age);
    }

    void  print(){
        System.out.println("name - "+name+" "+title+", age - "+age);
    }
}

class child extends parent{
    // String title;
    // int age;

    child(String name, String title, int age){
        super(name, title, age); 
    }

    child(grandParent g, String title){
        super(g.name, title, g.age); // here we wanted to inherit only name and age from the grandParent, and wanted to declare title manually, so this is the way to do it properly
    }

    
    child(grandParent g, int age){
        super(g.name, g.title, age); // inherit name + title from grandparent, override age
    }

    void  print(){
        System.out.println("name - "+name+" "+title+", age - "+age);
    }

    // void print2(){
    //     System.out.println("name - "+name+" "+title+", age - "+age);
    // }
}


public class a_18_3_0_inhertitance {
    public static void main(String[] args) {
        grandParent g1 = new grandParent("Swami", "Pradhan", 80);
        g1.print();
        System.out.println();
        
        parent p1 = new parent("Ayush", "Pradhan", 50);
        p1.print();
        parent p2 = new parent(p1, "Laxmi"); // we want the same title and age from p1
        p2.print();
        System.out.println();
        
        child c1 = new child("Rohan", "Pradhan", 25); 
        c1.print();
        child c2 = new child(g1, 20); // here i wanted the same and title as the g1 from grandfather [KEEP IN MIND]
        c2.print();
        child c3 = new child(g1, "Sahoo"); // here i wanted to inherit same name and age from the grandParent, but wanted to put the title manuallly
        c3.print();
        System.out.println();
    }
}
