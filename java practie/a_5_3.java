/*
print this hollow rectangle -->

****
*  *
*  *
****
4X4

link -- https://youtu.be/GjHNGM7KN3w?si=fYSb02I1rx4H9dts&t=891
go to this link at the same time frame and look at img on the screen to better understand 

*/
import java.util.*;
public class a_5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE ROWS YOU WANT : ");
        int row=sc.nextInt();
        System.out.print("ENTER THE COLUMNS YOU WANT : ");
        int column=sc.nextInt();


        for(int i=1; i<=row; i++){
            for (int j = 1; j <= column; j++) {
                if (i==1 || i==row || j==1 || j==column) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
1/ First Iteration (i = 1):
    j = 1 to 4: Since i == 1, all positions are on the top border. Print * four times.

2/ Second Iteration (i = 2):
    j = 1: j == 1 (left border). Print *.
    j = 2, 3: Neither i nor j is 1 or 4. Print spaces.
    j = 4: j == 4 (right border). Print *.

3/ Third Iteration (i = 3):
    Same as the second iteration.

4/ Fourth Iteration (i = 4):
    j = 1 to 4: Since i == 4, all positions are on the bottom border. Print * four times.
 */
