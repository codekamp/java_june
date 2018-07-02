package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;

/**
 * Created by cerebro on 02/07/18.
 */
public class Demo implements KeyListener {

    private static int playerYVel = 0;
    private static int playerYAcc = 0;
    private static int playerYCord = 315;

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 450));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        panel.setFocusable(true);
        panel.addKeyListener(new Demo());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        panel.requestFocus();
        Graphics g = panel.getGraphics();


         // 1 2 3 4 5 4 3 2       1 2 3 4 5 4 3 2
        Image grassImage;
        Image[] playerImages = new Image[8];

        try {
            grassImage = ImageIO.read(Demo.class.getClassLoader().getResource("codekamp/images/grass.png"));
            playerImages[0] = ImageIO.read(Demo.class.getClassLoader().getResource("codekamp/images/run_anim1.png"));
            playerImages[1] = ImageIO.read(Demo.class.getClassLoader().getResource("codekamp/images/run_anim2.png"));
            playerImages[2] = ImageIO.read(Demo.class.getClassLoader().getResource("codekamp/images/run_anim3.png"));
            playerImages[3] = ImageIO.read(Demo.class.getClassLoader().getResource("codekamp/images/run_anim4.png"));
            playerImages[4] = ImageIO.read(Demo.class.getClassLoader().getResource("codekamp/images/run_anim5.png"));
            playerImages[5] = playerImages[3];
            playerImages[6] = playerImages[2];
            playerImages[7] = playerImages[1];
        } catch (IOException e) {
            System.out.println("Game installation is corrupt. Please install again.");
            return;
        }

        int index = 0;

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            index++;

            if(index == 14) {
                index = 0;
            }

//            OR
//            imageIndex = imageIndex % 8;
//            OR
//            imageIndex %= 8;

            Demo.playerYCord = Demo.playerYCord + Demo.playerYVel;
            Demo.playerYVel = Demo.playerYVel + Demo.playerYAcc;

            if (Demo.playerYCord >= 315) {
                Demo.playerYCord = 315;
                Demo.playerYVel = 0;
                Demo.playerYAcc = 0;
            }

            g.clearRect(0, 0, 800, 450);
            g.drawImage(grassImage, 0, 405, null);
            g.drawImage(playerImages[index/2], 364, Demo.playerYCord, null);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE && Demo.playerYCord == 315) {
            Demo.playerYVel = -18;
            Demo.playerYAcc = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
