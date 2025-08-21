class grandParent{
    String name;
    String title;
    String gender;
    int age;

    grandParent(String name, String title, String gender, int age){
        this.name = name;
        this.title = title;
        this.gender = gender;
        this.age = age;
    }

    grandParent(grandParent g, String name, String gender){
        this.name = name;
        this.title = g.title;
        this.gender = gender;
        this.age = g.age;
    }

    void print(){
        System.out.println("The name is "+name+" "+title+", who is a "+gender+" with "+age+" year old.");
    }
}

class parent extends grandParent{
    parent(grandParent g, String name, String gender, int age){
        super(name, g.title, gender, age);
    }

    parent(parent p, grandParent g, String name, int age){
        super(name, p.title, g.gender, age);
    }

    void print(){
        System.out.println("The name is "+name+" "+title+", who is a "+gender+" with "+age+" year old.");
    }
}


public class a_18_3_2 {
    // printing second and second last 

    public static void main(String[] args) {

        System.out.println("GRAND PARENTS");
        grandParent g1 = new grandParent("Nakul", "Sahoo", "Male", 85);
        g1.print();
        grandParent g2 = new grandParent(g1, "Malati", "Female"); // copying name title and age from g1
        g2.print();
        
        System.out.println();
        System.out.println("PARENTS");
        parent p1 = new parent(g1, "Ramoo", "Male", 55); // inheriting titile from g1
        p1.print();
        parent p2 = new parent(p1, g2, "Rashmi", 52); // inheriting title from p1, and gender form g2
        p2.print();
    }
}
