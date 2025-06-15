import java.util.*;

public class L_3_2_switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-3): ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("You entered One.");
                break;
            case 2:
                System.out.println("You entered Two.");
                break;
            case 3:
                System.out.println("You entered Three.");
                break;
            default:
                System.out.println("Invalid number.");
        }

    }
}
