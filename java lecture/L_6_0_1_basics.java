import java.util.Scanner;

public class L_6_0_1_basics {
    public static String printMyName(String name){
        System.out.println("Your name is " + name);
        return name;
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("WHAT IS YOU NAME ??? : ");
        String name=input.nextLine();
        printMyName(name); //Calls the printMyName method, passing the user-inputted name as an argument, which then prints it to the console.
    }
}
