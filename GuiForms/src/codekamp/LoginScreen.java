package codekamp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 13/07/18.
 */
public class LoginScreen {
    public JPanel panel1;
    private JButton loginButton;
    private JTextField passwordField;
    private JTextField usernameField;

    public LoginScreen() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginScreen.this.login();
            }
        });
    }

    public void login() {

    }
}
