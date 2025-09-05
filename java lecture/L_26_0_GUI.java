// here we will be learning java GUI (graphical user interface)

import javax.swing.*;   // to use GUI you need to import this file

public class L_26_0_GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame"); // "Main Frame" will be set as the name of the frame itself

        // set width and height
        frame.setSize(400, 400);  // (width, height)
        frame.setLayout(null);
        frame.setVisible(true);                 // if true - frame will be visible // if false -  frame will not be visible
        // once you run the code, a frame will appear on the screen, and that is your frame that you have just created

        // to add buttons
        JButton b1 = new JButton("Click me");
        b1.setBounds(120, 100, 100, 50);    // (x axix, y axix, width, height)
        frame.add(b1);
        
        // setting image into the button
        JButton b2 = new JButton(new ImageIcon("D:\\THE CODE\\HTML\\img\\img 8.jpg"));      // so you have to paste the file path and the file extension
        // sometimes the complete img might not be shown due to the img size, but soon we will learn to fix that
        b2.setBounds(120, 200, 120, 80);
        frame.add(b2);

        // making labels
        JLabel l1 = new JLabel("Click the button down below");
        l1.setBounds(120, 65, 100, 30);
        frame.add(l1);

    }
}