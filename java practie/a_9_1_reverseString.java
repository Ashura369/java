// reversing a string
import java.util.*;
public class a_9_1_reverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE TEXT HERE: ");
        String a = input.nextLine();  
        String reverse = "";      
        
        for (int i = a.length() - 1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);
        }

        System.out.println("OUTPUT: "+reverse);
    }
}
