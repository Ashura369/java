
package bank;

public class a_18_4_0 {
    public static void main(String[] args) {
        account ac1 = new account();
        ac1.name = "Pradhan";
        ac1.mail = "abc@google.com";
        ac1.setPassword("ThisIsPassword"); 
        ac1.print();
        ac1.printPassword();
        System.out.println(ac1.getPassword());
            // so this is another way to print password using a getter
            // you can bascially make a getter return the password, which has been assigned to it
    }
}
