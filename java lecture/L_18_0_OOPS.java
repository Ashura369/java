// here we will be learning about OOPS - object oriented programming language

class employee{

    
    String name;
    String empNum;
    String company;

    employee() {
        System.out.println("CONSTRUCTER CALLED ");
    }

    public static void goodrRemarks() {
        System.out.println("Good Employee");
    }
    public static void badRemarks() {
        System.out.println("Bad Employee");
    }

    public void printDetails() { // if you dont make a function to print details then the details will be assigned to the function, but they will not be printed
        System.out.println("Name     : " + name);
        System.out.println("Emp No   : " + empNum);
        System.out.println("Company  : " + company);
    }

        // this is another way of printing the details
        public void printDetails2() { 
            System.out.println("Name     : " + this.name);
            System.out.println("Emp No   : " + this.empNum);
            System.out.println("Company  : " + this.company);
        }
    
}



public class L_18_0_OOPS {

public static void main(String[] args) {

    employee emp1 = new employee();
    emp1.name = "Biswajeet Pradhan";
    emp1.empNum = "abc123";
    emp1.company = "ABC";
    emp1.goodrRemarks();
    emp1.printDetails2();

    System.out.println();
    employee emp2 = new employee();
    emp2.name = "ABC DEF";
    emp2.empNum = "def456";
    emp2.company = "ABC";
    emp2.badRemarks();
    emp2.printDetails2();
    
    System.out.println();
    System.out.println(emp2.empNum);
}
    
    
}
