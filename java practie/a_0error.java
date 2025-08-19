class student{
    String name;
    int age;

    // student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    void printInfo1(){
        System.out.println(name);
        System.out.println(age);
    }
    void printInfo(){
        System.out.println("The name is "+name+", and age is "+age);
    }
}



public class a_0error {
    // printing second and second last 

    public static void main(String[] args) {

        // student s1 = new student("Ashura", 21);
        // s1.printInfo();
        student s2 = new student();
        s2.name = "Pink";
        s2.age = 22;
        s2.printInfo1();

    }
}