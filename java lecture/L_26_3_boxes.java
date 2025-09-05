// here we will learn about 3 types of boxes ie combo box, radio button, & check box

import javax.swing.*;

public class L_26_3_boxes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My frame");
        frame.setSize(800,500);
        frame.setLayout(null);
        frame.setVisible(true);

        // checkbox
        JLabel l1 = new JLabel("Which one is you favourite language ???");
        l1.setBounds(50,30,300,30);
        frame.add(l1);
        
        JCheckBox c1 = new JCheckBox("C++");
        c1.setBounds(50, 70, 80, 30);
        
        JCheckBox c2 = new JCheckBox("Java");
        c2.setBounds(140, 70, 80, 30);
        
        JCheckBox c3 = new JCheckBox("Python");
        c3.setBounds(230, 70, 80, 30);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        
        // radio
        JLabel l2 = new JLabel("What is you gender ???");
        l2.setBounds(50,120,300,30);
        frame.add(l2);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(50, 160, 100, 30);

        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(160, 160, 100, 30);
        // frame.add(r1);
        // frame.add(r2); 

            // if you just write your radio buttons like that, then you will be select all the buttons
            // which is not appropriate while choosing gender
            // hence we need to write then in a way where only one button will be selected
        ButtonGroup bg = new ButtonGroup();     // remember "ButtonGroup" only works with the radio not with the checkbox
        bg.add(r1);
        bg.add(r2);

        frame.add(r1);
        frame.add(r2);

        // combo box
        JLabel l3 = new JLabel("Select your country:");
        l3.setBounds(50, 220, 200, 30);
        frame.add(l3);

        String country[] = {"Russia", "Singapore", "USA", "UK", "Canada", "Australia"};
        JComboBox<String> combo = new JComboBox<>(country);
        combo.setBounds(50,260,150,30);
        frame.add(combo);
    }
}
