class student{
    String name;
    static String school; // No matter how many objects of the class you create, the school variable will remain the same for all objects

    static void changeSchool(){
        school = "St. Merry School";
    }
    static void changeSchool2(String schl){
        school = schl;
    }
}

public class L_18_6_staticKeyword {
    public static void main(String[] args) {
        
        student.school = "St. Thomas School of Excellancy"; // since you have put "static" in school so there is no need for it make a object to declare the school. You can directly assign values to it.
        student s1 = new student();
        s1.name = "Ayush";
        System.out.println(s1.name);
        System.out.println(s1.school);
        s1.changeSchool();                                      // here we changed the school name
        System.out.println(s1.school);
        s1.changeSchool2("St. Joseph School of Royals");    // here we again changed the school name
        System.out.println(s1.school);

    }
}
