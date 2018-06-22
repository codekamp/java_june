package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 20/06/18.
 */
public class Demo implements ActionListener {

    private static JTextField userField;
    private static JTextField passwordField;

    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        f1.setSize(800, 450);

        JPanel p = new JPanel();


        JLabel userLabel = new JLabel();
        userLabel.setText("Username:");
        userLabel.setForeground(Color.red);
        p.add(userLabel);

        Demo.userField = new JTextField();
        Demo.userField.setText("enter username");
        p.add(Demo.userField);

        JLabel passwordLabel = new JLabel();
        passwordLabel.setText("Password:");
        passwordLabel.setForeground(Color.red);
        p.add(passwordLabel);

        Demo.passwordField = new JTextField();
        Demo.passwordField.setText("enter password");
        p.add(Demo.passwordField);

        JButton loginButton = new JButton();
        loginButton.setText("Login");
        p.add(loginButton);

        Demo d1 = new Demo();
        loginButton.addActionListener(d1);

        f1.add(p);

        f1.setVisible(true);

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Educated e1 = dog1;

        loginButton.addActionListener(dog1);
    }

    public static void login(String username, String password) {
        System.out.println("username entered is " + username);
        System.out.println("password entered is " + password);
    }

    public void actionPerformed(ActionEvent e) {
        String username = Demo.userField.getText();
        String password = Demo.passwordField.getText();
        Demo.login(username, password);
    }

    // Any JButton always calls actionPerformed(ActionEvent e) method when it is clicked
    // So we can't control which method will be called when button is clicked
    // But what we can control is the object on which actionPerformed method
    // ...will be called.


//    JButton's addActionListner method should:
//    1. Accept Object of any class in parameter
//    2. But that class should have actionPerformed method in it.
}
