// making a class and within it making another class and declaring its own constructor

class Student{
    String name;
    int rollNo;
    int standard;
    Student next;
    
        Student(String name, int rollNo, int standard){
            this.name = name;
            this.rollNo = rollNo;
            this.standard = standard;
            this.next = null;
        }
    
    // making a link list for student class
    Student head;
    
    void addFirst(String name, int rollNo, int standard){
        if (head == null) {

            /*
            If you write the below function it will not work bcoz, head is null initially, so calling head.name = name; will throw NullPointerException.

                head.name = name;
                head.rollNo = rollNo;
                head.standard = standard;
            
            q/ i mean when i am writing Student head it means it automatically cantains the blueprint of Student class, so why can't i write this "head.name = name"

                * This means you declared a reference variable named head that can point to a Student object.

                * But right now, it doesn’t point anywhere → its default value is null.

                * It does NOT automatically create a new Student object.
                (Java does not auto-initialize objects unless you explicitly use new.)
            */

            head = new Student(name, rollNo, standard);     // to solve the problelm you have to write this
            return; // ✅ added return to stop further execution
        }
        Student temp = new Student(name, rollNo, standard);
        temp.next = head;
        head = temp;
        
    }

    void add(String name, int rollNo, int standard){
        if (head == null) {
            head = new Student(name, rollNo, standard);
            return;
        }

        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Student(name, rollNo, standard);

    }

    void deleteLast(){
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        Student temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    
    void print(){
        System.out.println("Name: "+name+", Roll.No.: "+rollNo+", Class: "+standard);
    }

    void printAll(){
        Student temp = head;
        while (temp != null) {
            System.out.println("Name: "+temp.name+", Roll.No.: "+temp.rollNo+", Class: "+temp.standard);

            temp = temp.next;
        }
    }

    static class GoodStudents extends Student{
        String name;         // as these blueprints already exists in parent so there is no need to declare it again
        int rollNo;          // as these blueprints already exists in parent so there is no need to declare it again
        int standard;        // as these blueprints already exists in parent so there is no need to declare it again
        String behaviour;

            GoodStudents(String name, int rollNo, int standard, String behaviour){
                super(name, rollNo, standard);  // call parent constructor
                this.behaviour = behaviour;
            }

            void printGood(){
                System.out.println("Name: "+name+", Roll.No.: "+rollNo+", Class: "+standard+", Behaviour: "+behaviour);
            }
    }
    class BadStudents{
        String name;
        int rollNo;
        int standard;
        String behaviour;

            BadStudents(String name, int rollNo, int standard, String behaviour){
                this.name = name;
                this.rollNo = rollNo;
                this.standard = standard;
                this.behaviour = behaviour;
            }
        
        void print(){
            System.out.println("Name: "+name+", Roll.No.: "+rollNo+", Class: "+standard+", Behaviour: "+behaviour);
        }
    }

}


public class a_20_1 {
    public static void main(String[] args) {
        System.out.println();
        
        Student s1 = new Student("Ramesh Dash", 1, 10);
        s1.print();  
        System.out.println("Name: "+s1.name);
        System.out.println("*****************************************************");

        Student s2 = new Student("Biswajeet Pradhan", 33, 10);
        s2.print();
        s2.addFirst("Ravi Sharma", 33, 10);
        s2.add("Raghuveer Anand", 23, 10);
        s2.add("Samaira Ghosh", 21, 10);
        s2.printAll();
        System.out.println("*****************************************************");
        s2.deleteLast();
        s2.printAll();
        System.out.println("*****************************************************");

        // ************************************************************************
        

        Student.GoodStudents g1 = new Student.GoodStudents("Amit", 2, 10, "Obedient");
        g1.print();
        g1.printGood();     // here it will only print behaviour and rest will be printed as null, bcoz you in GoodStudents class you have mentioned the blueprints again. So when you call printGood, remember that printGood only assign value to behaviour. And rest values for name, rollNo, and standard will be assigned to the blueprint stored in student class, not to the GoodStudent class

        //  So when we called `super(...)`, only the parent class fields got initialized, while the duplicate ones (name, rollNo, and standard) in GoodStudents stayed null/0.

        // but if you comment out the all the blueprints except the behaviour in GoodStudent class, it will work properly

        //so after removing the name, rollNo, and standard if i call printgood, the name, rollNo, and standard inside the printGood will refer to the name, rollNo, and standard of the Student class.

        // if i wouldn't have inherited from parent class then the name, rollNo, and standard would have remain null and also the GoodStudents constructor would have thrown error

        // ************************************************************************


        Student.BadStudents b1 = s1.new BadStudents("Raghu Yadav", 3, 10, "Naughty");
        b1.print();

        /*
        
            we are creating an object of the inner class BadStudents, but since BadStudents is a non-static inner class, it cannot exist on its own. A non-static inner class always belongs to an instance of the outer class (Student).

            That’s why we write s1.new BadStudents(...). Here, s1 is an object of the outer class Student. By writing s1.new, we are telling Java: “Create a BadStudents object that is linked to this particular Student object s1.”

            In simple terms:

            BadStudents lives inside Student.

            Without a specific Student object (s1), Java does not know which outer object the inner object belongs to.

            So, by adding s1, we make sure the BadStudents object is tied to the correct Student instance.

            If BadStudents were declared as a static inner class, we would not need s1 at all and could directly write:

        */

        // ************************************************************************
        System.out.println();
    }
}
