package codekamp;

import codekamp.Screen.WelcomScreen;

import javax.swing.*;

/**
 * Created by cerebro on 05/07/18.
 */
public class Game {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 450;

    public static void main(String[] args) {
        JFrame f = new JFrame();

        GamePanel g = new GamePanel();
        f.add(g);
        f.pack();
        f.setVisible(true);
    }
}
