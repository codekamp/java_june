package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 22/06/18.
 */
public class Demo implements ActionListener {

    private JLabel label;
    private JButton chageColorButton;
    private JButton newWindowButton;

    public static int windowCount = 0;

    public static void main(String[] args) {
        Demo.createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.chageColorButton) {
            if (this.label.getForeground() == Color.red) {
                this.label.setForeground(Color.black);
            } else {
                this.label.setForeground(Color.red);
            }
        } else if(e.getSource() == this.newWindowButton) {
            Demo.createWindow();
        }
    }

    public static void createWindow() {
        Demo.windowCount++;

        Demo d1 = new Demo(); // Demo #1

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Demo #" + Demo.windowCount);

        JPanel panel = new JPanel();
        frame.add(panel);

        d1.label = new JLabel();
        d1.label.setText("Hello world!");
        panel.add(d1.label);

        d1.chageColorButton = new JButton();
        d1.chageColorButton.setText("Change Color");
        panel.add(d1.chageColorButton);

        d1.newWindowButton = new JButton();
        d1.newWindowButton.setText("Create New Window");
        panel.add(d1.newWindowButton);

        frame.setVisible(true);

        d1.chageColorButton.addActionListener(d1);
        d1.newWindowButton.addActionListener(d1);
    }

    // Objects lifetime:
    // created when you call new Something()
    // destroyed when there is no variable left that points to that object


    // Varialbes lifetime:
    // Static:
    // defined on program launch and deleted on programm termination

    // non static:
    // defined on Object creation and deleted on object deletion

    // local:
    // defined when function call reaches line where variable is defined
    // deleted when function call completes.
}
