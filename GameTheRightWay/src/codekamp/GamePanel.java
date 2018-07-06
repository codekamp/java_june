package codekamp;

import codekamp.Screen.Screen;
import codekamp.Screen.WelcomeScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

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

        this.requestFocus();

        Resources.load();
        GamePanel.currentScreen = new WelcomeScreen();

        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        this.currentScreen.onKeyPress(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {

        Image bigImage = new BufferedImage(Game.WIDTH, Game.HEIGHT, BufferedImage.TYPE_INT_RGB);

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            GamePanel.currentScreen.update();

            Graphics panelGraphics = this.getGraphics();
            Graphics imageGrahipcs = bigImage.getGraphics();


            imageGrahipcs.clearRect(0, 0, Game.WIDTH, Game.HEIGHT);
            GamePanel.currentScreen.draw(imageGrahipcs);
            imageGrahipcs.dispose();

            panelGraphics.drawImage(bigImage, 0, 0, null);
            panelGraphics.dispose(); // will come to this later
        }
    }
}
