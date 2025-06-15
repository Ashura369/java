import java.util.*;
public class L_3_1_ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("enter your age : ");
        age=input.nextInt();

        if(age>=18){
            System.out.println("YOU ARE 18+");
        } else{
            System.out.println("THIS SITE IS FOR 18+ ONLY");
        }
    }
}