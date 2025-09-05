import javax.swing.*;

public class L_26_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame"); // "Main Frame" will be set as the name of the frame itself

        // set width and height
        frame.setSize(400, 400);  // (width, height)
        frame.setLayout(null);
        frame.setVisible(true);
        
        // text fill -- used to take input from the user
        JTextField t1 = new JTextField("enter user name"); // "enter user name" will already be present in the text box
        t1.setBounds(100,100,100,30);
        frame.add(t1);

        // password fiels - to receive password as an input from user
        JPasswordField p1 = new JPasswordField();
        p1.setBounds(100,150,100,30);
        frame.add(p1);

        // text area 
        JTextArea ta1 = new JTextArea("hii!!! this is text area");
        ta1.setBounds(100,200,100,60);
        frame.add(ta1);

    }
}
