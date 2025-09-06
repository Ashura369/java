// creating a menu bar

import javax.swing.*;

public class L_28_0_menuBar {
    public static void main(String[] args) {

        // creating a menu bar
        JFrame frame = new JFrame("Main");
        frame.setSize(600,400);
        frame.setLayout(null);
        frame.setVisible(true);

        JMenuBar mb = new JMenuBar();
        JMenu menu, subMenu;
        JMenuItem i1,i2,i3,i4,i5;

        menu = new JMenu("Menu");
        subMenu = new JMenu("Sub Menu");

        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        subMenu.add(i4);
        subMenu.add(i5);

        mb.add(menu);
        frame.setJMenuBar(mb);      // to add the menuBar into the frame, you have to use "setMenuBar", you can't just use frame.add

        // there is some error in this code, deal with it later

    }
}
