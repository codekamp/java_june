package codekamp;

import codekamp.Screen.Screen;
import codekamp.Screen.WelcomScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by cerebro on 05/07/18.
 */
public class GamePanel extends JPanel implements KeyListener, Runnable {

    public static Screen currentScreen;

    public GamePanel() {
        this.setPreferredSize(new Dimension(Game.WIDTH, Game.HEIGHT));
        this.setFocusable(true);
        this.addKeyListener(this);
    }

    @Override
    public void addNotify() {
        super.addNotify();

        GamePanel.currentScreen = new WelcomScreen();

        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            GamePanel.currentScreen.update();

            GamePanel.currentScreen.draw();

            System.out.println("Game loop running");
        }
    }
}
