public class L_9_1_parsing {
    public static void main(String[] args) {
        // Parsing
        // Parsing is something when we convert any string data to any other data type like integer, double, boolean, float etc

        String x = "25";
        int y = Integer.parseInt(x);
        System.err.println(x);
        System.err.println(y);
        System.out.println("Type of x: " + x.getClass().getName()); // to print the type of the data (only works on the string)
        //  System.out.println("Type of y: " + y.getClass().getName()); // will not work
        System.out.println("Type of y: " + ((Object)y).getClass().getName()); // Primitives data types like int, double, boolean do not have methods or object features (like .getClass()), because they are not objects.



    }
}
  