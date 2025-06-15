// print the factorial of a number
import java.util.*;
public class L_6_3_factorial {

    public static int cal(int n) {

        int facto=1;
        for (int i = n; i >= 1; i--) {
            facto*=i;
        }
        return facto;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number : ");
        int n=sc.nextInt();

        int facto = cal(n);
        System.out.println("factorial of "+n+" is : "+facto);
    }
}
