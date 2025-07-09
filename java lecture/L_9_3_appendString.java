public class L_9_3_appendString {
    public static void main(String[] args) {
        // append
		StringBuilder str = new StringBuilder("Hello");

        str.append(" ");
        str.append("W");
        str.append("O");
        str.append("R");
        str.append("L");
        str.append("D");

        System.out.println(str);
        str.append(" This is Jeet");
        System.out.println(str);
        System.out.println();
        
            // doing the same in the string
            String txt = "HELLO";
            
            txt = txt + " ";
            txt = txt + "W";
            txt = txt + "O";
            txt = txt + "R";
            txt = txt + "L";
            txt = txt + "D";
            
            System.out.println(txt);
            txt = txt + " This is Jeet";
            System.out.println(txt);


    }
}
