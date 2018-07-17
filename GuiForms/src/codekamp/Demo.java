package codekamp;

import javax.swing.*;

/**
 * Created by cerebro on 13/07/18.
 */
public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        LoginScreen l = new LoginScreen();

        // code to add UI to panel
        // e.g. panel.add(changeColorButton);


        frame.add(l.panel1);
        frame.pack();
        frame.setVisible(true);

//        JList<String> list = new JList();
//
//        list.setListData();
    }
}
