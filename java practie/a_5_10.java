/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


*/

public class a_5_10 {
    public static void main(String[] args) {
        int n, num, i, j;
        n=5;
        num=1;

        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
