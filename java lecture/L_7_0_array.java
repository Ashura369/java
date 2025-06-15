/*
Array --
    type[]arrayName = new type[size];


*/


import java.util.*;
public class L_7_0_array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        // int marks[] = new int[3]; // yoou can also write this syntax


        marks[0]=97; //physics
        marks[1]=98; //chemistry
        marks[2]=95; //english

        System.out.println(marks); //will print some garbage value

        //printing the values one by one
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println("--------------------------");

        //printing the values at once
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

        hi();

    }

    public static void hi() {
            int marks[] = {10, 12, 13};
            System.out.println("this is first value "+marks[0]);
        }

    
}
