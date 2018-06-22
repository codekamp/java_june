package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 22/06/18.
 */
public class Demo implements ActionListener {

    private static JLabel label;
    private static JButton chageColorButton;
    private static JButton newWindowButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        JPanel panel = new JPanel();
        frame.add(panel);

        Demo.label = new JLabel();
        Demo.label.setText("Hello world!");
        panel.add(Demo.label);

        Demo.chageColorButton = new JButton();
        Demo.chageColorButton.setText("Change Color");
        panel.add(Demo.chageColorButton);

        Demo.newWindowButton = new JButton();
        Demo.newWindowButton.setText("New Window");
        panel.add(Demo.newWindowButton);

        frame.setVisible(true);

        Demo d1 = new Demo();
        Demo.chageColorButton.addActionListener(d1);
        Demo.newWindowButton.addActionListener(d1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Demo.chageColorButton) {
            if (Demo.label.getForeground() == Color.red) {
                Demo.label.setForeground(Color.black);
            } else {
                Demo.label.setForeground(Color.red);
            }
        } else {
            System.out.println("New Window button clicked");
        }
    }
}
