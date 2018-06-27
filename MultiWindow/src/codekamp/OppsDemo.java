package codekamp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 27/06/18.
 */
public class OppsDemo implements ConfirmationListner, ActionListener {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        f.add(p);

        JButton button = new JButton("Delete");
        p.add(button);
        button.addActionListener(new OppsDemo());


        f.setSize(800, 450);
        f.setVisible(true);
    }

    @Override
    public void yesButtonClicked() {
        System.out.println("Yes user has confirmed that he wants to delete the post");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ConfirmationPopup popup = new ConfirmationPopup("Want to delete the post?");
        popup.setVisible(true);

        popup.setListner(this);
    }
}
