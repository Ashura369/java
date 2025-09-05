// here we will be learning about j option pane

// JOptionPane class is used to provide standard dialog boxes such as message dialog box, confirm dialog box and input dialog box

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class L_27_0_JOptionPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "error 404, try after sometime", "error_404 ⚠️", 0);   // (frameName, info to be shown, title of the dialogue box, message type)

            // there are 5 types of messageType, such as;
                // 0 -- ❌ Red error icon
                // 1 -- ℹ️ Info icon
                // 2 -- ⚠️ Yellow warning icon
                // 3 -- ❓ Question mark icon
                // -1 -- No icon
            
            // just change the numbers in the box and run the code and you will be able to see the changes
        
        JOptionPane.showMessageDialog(frame, "This is an information message", "ℹ️ Info", 1);
        JOptionPane.showMessageDialog(frame, "This is a warning message", "⚠️ Warning", 2);
        JOptionPane.showMessageDialog(frame, "Do you want to continue?", "❓ Question", 3);
        JOptionPane.showMessageDialog(frame, "This is a plain message with no icon", "Plain", -1);

        // just try runnig the file and the dialogue box will appear one by one

        // *********************************************************
        
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Welcome to my code", "Alert", JOptionPane.WARNING_MESSAGE);   // this is also a way of doing the same as above
        
        // *********************************************************
        
        // taking input
        // REMEMBER TO STORE THE INPUT TAKEN BY THE USER, YOU HAVE TO STORE IN A STRING TYPE VARIABLE. OTHERWISE IT WILL THROW AN ERROR
        String name = JOptionPane.showInputDialog(f, "Enter your name: ", "User Input Required ✍️", 3);
        System.out.println("Name input by user is "+name);  // this will shown in the terminal
            
    }
}
