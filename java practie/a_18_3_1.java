// this is the same code from "a_18_3_inhertitance", but the only difference is that here we are putting the details manually


import java.util.Scanner;

class grandParent {
    String name; 
    String title;   
    int age;

    grandParent(String name, String title, int age){
        this.name = name;
        this.title = title;
        this.age = age;
    }

    void print(){
        System.out.println("name - " + name + " " + title + ", age - " + age);
    }
}

class parent extends grandParent {
    parent(String name, String title, int age){
        super(name, title, age);
    }

    void print(){
        System.out.println("name - " + name + " " + title + ", age - " + age);
    }
}

class child extends parent {
    String title;

    child(String name, String title, int age){
        super(name, "", age);
        this.title = title;
    }

    child(grandParent g, int age){
        super(g.name, "", age);
        this.title = g.title;
    }

    void print(){
        System.out.println("name - " + name + " " + title + ", age - " + age);
    }
}

public class a_18_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter grandParent details:");
        System.out.print("Name: ");
        String gName = sc.nextLine();
        System.out.print("Title: ");
        String gTitle = sc.nextLine();
        System.out.print("Age: ");
        int gAge = sc.nextInt();
        sc.nextLine();  // Consume newline

        grandParent g1 = new grandParent(gName, gTitle, gAge);
        g1.print();

        System.out.println("\nEnter parent details:");
        System.out.print("Name: ");
        String pName = sc.nextLine();
        System.out.print("Title: ");
        String pTitle = sc.nextLine();
        System.out.print("Age: ");
        int pAge = sc.nextInt();
        sc.nextLine();

        parent p1 = new parent(pName, pTitle, pAge);
        p1.print();

        System.out.println("\nEnter child details:");
        System.out.print("Name: ");
        String cName = sc.nextLine();
        System.out.print("Title: ");
        String cTitle = sc.nextLine();
        System.out.print("Age: ");
        int cAge = sc.nextInt();
        sc.nextLine();

        child c1 = new child(cName, cTitle, cAge);
        c1.print();

        System.out.println("\n Creating a new child using grandParent's name and title but custom age.");
        System.out.print("Enter age for c2: ");
        int c2Age = sc.nextInt();

        child c2 = new child(g1, c2Age);
        c2.print();

        sc.close();
    }
}
