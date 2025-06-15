// make the sum of "n" natural numbers, where you will n as input from terminal
import java.util.*;
public class a_4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the number : ");
        int n = input.nextInt();

        int sum=0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println("the sum of natural numbers from 0 to "+n+ " is : " + sum);
    }
}
