public class L_25_0_wrapperClass {

    // making a method just like "typeOf" in JS
    public static String typeOf(Object obj) {
        if (obj == null) return "null";
        return obj.getClass().getSimpleName();
    }

    public static void main(String[] args) {

        // primitive types
        int a = 10;
        char c = 'z';
        double d = 5.67;
        boolean flag = true;

        // Wrapping (converting) [primitive -> object]
        Integer a_obj = a;
        Character c_obj = c;
        Double d_obj = d;
        Boolean flag_obj = flag;

        // Printing primitives
        System.out.println(a + " | type: " + typeOf(a));
        System.out.println(c + " | type: " + typeOf(c));
        System.out.println(d + " | type: " + typeOf(d));
        System.out.println(flag + " | type: " + typeOf(flag));
        System.out.println("***************************");

        // Printing wrapped objects
        System.out.println("Integer object: " + a_obj + " | type: " + typeOf(a_obj));
        System.out.println("Character object: " + c_obj + " | type: " + typeOf(c_obj));
        System.out.println("Double object: " + d_obj + " | type: " + typeOf(d_obj));
        System.out.println("Boolean object: " + flag_obj + " | type: " + typeOf(flag_obj));
        System.out.println("***************************");

        // Unwrapping (Object -> primitive)
        int aBack = a_obj;
        char cBack = c_obj;
        double dBack = d_obj;
        boolean flagBack = flag_obj;

        // Printing unwrapped values
        System.out.println("Unwrapped values:");
        System.out.println("int: " + aBack + " | type: " + typeOf(aBack));
        System.out.println("char: " + cBack + " | type: " + typeOf(cBack));
        System.out.println("double: " + dBack + " | type: " + typeOf(dBack));
        System.out.println("boolean: " + flagBack + " | type: " + typeOf(flagBack));
        System.out.println();
    }
}
