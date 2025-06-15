public class L_4_3_1_whileVsDoWhile {
    public static void main(String[] args) {
        int i=12;
            while (i <= 10) {
                System.out.println(i); //not print the ans, bcoz the condition ans
                i++;
            }

            do{
                System.out.println(i); //will print the ans even after the cmondition being false, bcoz the do while loop first runs the command and then checks the condition. Hence it will print the value for one time only
                i++;
            } while(i<=10);
    }
}

// while -- first checks the condition, then prints the value
// do while -- first prints the value, then checks the condition
