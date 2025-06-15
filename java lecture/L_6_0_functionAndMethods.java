/*
FUNCTIONS

    returnType functionName(type arg1, type arg2 ..){
        // operational stt
    }

    returnType --> int, float, String, etc (this will be based on the type of value it will be returning. If it returns int value, then we have to put int here.) When a function type is mentioned as void, it means that function doesn't return anything.

*/

import java.util.*;

public class L_6_0_functionAndMethods {

    public static void main(String[] args) {
        // System.out.println("1");
        // System.out.println("2");
        intro();
        // System.out.println("3");
    }

    public static void intro() {
        System.out.println("Hello World !!!");
    }

}

/*
UNDERSTANDING HOW FUNCTION WORKS

The code starts to run from "main" function. 1st it will run the code one by one. Once it reaches "intro()", it immediately stops, and jumps straight into the "intro" function. There it runs all the codes one by one (codes of intro function). Once all the codes in intro finishes, it goes back to the "main" function, and starts running the codes below the "intro" (if any) (it called calling back the intro). 

try commenting out print statements, you will understand better 

 */
