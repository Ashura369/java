import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class a_0_error {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My frame");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // use BoxLayout on the frame's content pane
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // checkbox
        JLabel l1 = new JLabel("Which one is your favourite language?");
        JCheckBox c1 = new JCheckBox("C++");
        JCheckBox c2 = new JCheckBox("Java");
        JCheckBox c3 = new JCheckBox("Python");

        // radio
        JLabel l2 = new JLabel("What is your gender?");
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // combo box
        JLabel l3 = new JLabel("Select your country:");
        String country[] = {"Russia", "Singapore", "USA", "UK", "Canada", "Australia"};
        JComboBox<String> combo = new JComboBox<>(country);

        // add components (they will stack vertically)
        frame.add(l1);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(l2);
        frame.add(r1);
        frame.add(r2);
        frame.add(l3);
        frame.add(combo);

        frame.setVisible(true);
    }
}