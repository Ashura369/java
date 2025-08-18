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

class students {
    String name;
    int rollNo;
    int clss;
    String gender;

    students(String a, int b, int c, String d){
        this.name = a;
        this.rollNo = b;
        this.clss = c;
        this.gender = d;
    }

    public void printDetails() {
        // System.err.println("The name of the student is "+ name + ". His roll number and class is "+ rollNo + ", and "+clss); // you can also use "this" here
        
        if (gender.equalsIgnoreCase("Male")) { // here we used equalsIgnoreCase bcoz even if we write gender in lower or upper letters, it will not matter to the condition here
            System.err.println("The name of the student is "+ name + ". His roll number and class is "+ rollNo + ", and "+clss);
        }else if (gender.equalsIgnoreCase("Female")){
            System.err.println("The name of the student is "+ name + ". Her roll number and class is "+ rollNo + ", and "+clss);
        }

        /*
        
        if (gender != null && gender.equalsIgnoreCase("Male")) {
                    System.err.println("The name of the student is "+ name + ". His roll number and class is "+ rollNo + ", and "+ clss);
                } else {
                    System.err.println("The name of the student is "+ name + ". Her roll number and class is "+ rollNo + ", and "+ clss);
                }
        
        
        */

    }

    // another way of printing the details
    public void printDetails2(){

        String pronoun = gender.equalsIgnoreCase("Male") ? "His" : "Her";
        System.err.println("The name of the student is "+ name +". " + pronoun + " roll number and class is "+ rollNo + ", and "+clss);

    }
}



public class L_18_0_OOPS {

public static void main(String[] args) {

    employee emp1 = new employee(); // this "new employee()" are calleda as constructors        
    
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

    // **************************************************************************************************************************
    // this is the shortest way of writing an object
    System.out.println();
    students std1 = new students("Biswajeet Pradhan", 33, 13, "Male");
    std1.printDetails2();
    students std2 = new students("Aisha Agarwal", 21, 13, "Female");
    std2.printDetails2();
    students std3 = new students("Smriti Thakur", 12, 13, "Female");
    std3.printDetails2();



}
    
    
}