/*

Here we are learning using encapsualtion on different files.

To do so, first we hava to create a new folder under which both the main file and the blueprint class will exist, and the make sure the folder name must not hold any kind of white spaces. It must be in a java format.

And to link both the main file and the blueprint file, we have to write "package packageName;" (example --> package a_18_4_encapsulation;)

KEEP ONE THING IN MIND, WHENEVER YOU ARE RUNNING CODE WHERE YOU HAVE TO DEAL WITH PACKAGES (FOLDERS) MAKE SURE TO RIGHT CLICK ON THE MOUSE AND CLICK ON "Run Java" OPTION.

There will be another option showing when you right click on the mouse "Run Code", if you click that the same code will not run and throw error. This is bcoz,  It just runs your file directly with javac a_18_4.java && java a_18_4 (no package awareness). Hence, so the compiler/runtime can’t find your other class → cannot find symbol or class not found errors.

But when you click "Run Java", It actually respects your package structure. 
It compiles everything in the correct folder and runs it with the full classpath (java bank.a_18_4), so your program works.


*/

package encapsulation;


public class a_18_4_0_encapsulation {
    public static void main(String[] args) {
        person p1 = new person("Maya", 25, "Delhi");
        p1.print();
    }
}