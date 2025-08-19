class amazon{
    String name;
    int id;

    amazon(String name, int id) {
        this.name=name;
        this.id=id;
    }

    void print(){
        System.out.println("Name : "+name+" ID : "+id);
    }
}

class flipKart{
    String name;
    int id;

    flipKart(String name, int id) {
        this.name=name;
        this.id=id;
    }

    void print(){
        System.out.println("Name : "+name+" ID : "+id);
    }
}


public class a_18_1 {
    public static void main(String[] args) {
        // amazon
        amazon a1 = new amazon("a", 1);
        a1.print();
        amazon a2 = new amazon("b", 2);
        a2.print();
        amazon a3 = new amazon("c", 3);
        a3.print();

        // flipKart
        System.out.println();
        flipKart f1 = new flipKart("d", 4);
        f1.print();
        flipKart f2 = new flipKart("e", 5);
        f2.print();
        flipKart f3 = new flipKart("f", 6);
        f3.print();
    }
}
