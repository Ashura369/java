//for loop
public class L_4_1_forLoop {
    public static void main(String[] args) {
        for(int i=0; i<=100; i++){
            System.out.println("hello world "+i);
        }
    }
}

/*
Execution process : --
    1st --> int i=0; 
    2nd --> i<=100; [once the code checks that the current value of i is less than or equal to 100, then it will print the 3rd statement]
    3rd --> System.out.println("hello world "+i);
    4th --> i++ [once the value of i is increased by 1, it will check that wheather the current value of i is <= 100 or not, if yes, then it will print the value, is not then it will stop the code immediately (when value of i becomes i=101)]
    5th --> i<=100; 


*/