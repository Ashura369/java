/*
print this  -->

****
***
**
*

*/

public class a_5_6 {
    public static void main(String[] args) {
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
alternative code -- 

        int n=5;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
 */
