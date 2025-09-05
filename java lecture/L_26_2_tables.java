// learning tables

import javax.swing.JFrame;
import javax.swing.JTable;

public class L_26_2_tables {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame"); 
        frame.setSize(800, 400); 
        frame.setLayout(null);
        frame.setVisible(true);

        // tables
        String columns[] = {"ID", "NAME", "SALARY"};
        String data[][] = {{"101", "Raghu", "50,000"}, {"102", "Kishan", "100,000"}, {"103", "Ravi", "60,000"}};
        JTable t1 = new JTable(data, columns);
        t1.setBounds(30,50,500,400);
        frame.add(t1);
    }
}
