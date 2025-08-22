/*

Here we are learning using encapsualtion on different files.

To do so, first we hava to create a new folder under which both the main file and the blueprint class will exist, and the make sure the folder name must not hold any kind of white spaces. It must be in a java format.

And to link both the main file and the blueprint file, we have to write "package packageName;" (example --> package a_18_4_encapsulation;)


*/

package folder;

public class a_18_4_0_encapsulation {
    public static void main(String[] args) {
        person p1 = new person("Maya", 25, "Delhi");
        p1.print();
    }
}