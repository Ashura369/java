/*
Print the patterns

*****
*****
*****
*****

4 x 5 (4 rows 5 columns)

*/

//using nested for loop
public class L_5_0_patterns {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
