package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 27/06/18.
 */
public class ConfirmationPopup extends JFrame implements ActionListener {
    private JLabel msgLabel;
    private JButton cancelButton;
    private JButton yesButton;

    private ConfirmationListner listner;

    public ConfirmationPopup() {
        this("Are you sure?");
    }

    public ConfirmationPopup(String question) {
        this(question, "cancel", "ok");
    }

    public ConfirmationPopup(String question, String cancelText, String yesText) {
        super();

        this.msgLabel = new JLabel(question);

        this.cancelButton = new JButton(cancelText);
        this.cancelButton.addActionListener(this);

        this.yesButton = new JButton(yesText);
        this.yesButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(this.msgLabel);
        panel.add(this.cancelButton);
        panel.add(this.yesButton);

        this.add(panel);
        this.setSize(500, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.cancelButton) {
            this.setVisible(false);
            this.dispose();
        } else if(e.getSource() == this.yesButton) {
            this.listner.yesButtonClicked();
        }
    }


    public void setQuestion(String question) {
        this.msgLabel.setText(question);
    }

    public void setYesText(String yesText) {
        this.yesButton.setText(yesText);
    }

    public void setCancelText(String cancelText) {
        this.yesButton.setText(cancelText);
    }

    public void setListner(ConfirmationListner l) {
        this.listner = l;
    }

    // Design Patterns - Derek Banas
    // Clean Code
}
