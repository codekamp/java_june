package codekamp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

/**
 * Created by cerebro on 02/07/18.
 */
public class Demo implements KeyListener, MouseListener {

    private static int playerYVel = 0;
    private static int playerYAcc = 0;
    private static int playerYCord = 315;
    private static AudioClip jumpAudio;
    private static AudioClip hitAudio;
    private static boolean paused = false;
    private static Image grassImage;
    private static Image[] playerImages = new Image[8];
    private static Image jumpImage;
    private static Image blockImage;
    private static Graphics graphics;
    private static boolean gameOver = false;

    // static are also called class variables.
    // non static are also called instance variables.

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 450));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        panel.setFocusable(true);
        Demo d1 = new Demo();
        panel.addKeyListener(d1);
        panel.addMouseListener(d1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        panel.requestFocus();
        Demo.graphics = panel.getGraphics();


        // 1 2 3 4 5 4 3 2       1 2 3 4 5 4 3 2

        Demo.jumpAudio = Applet.newAudioClip(Demo.class.getClassLoader().getResource("codekamp/audios/onjump.wav"));
        Demo.hitAudio = Applet.newAudioClip(Demo.class.getClassLoader().getResource("codekamp/audios/hit.wav"));

        try {
            grassImage = ImageIO.read(Demo.class.getClassLoader().getResource("codekamp/images/grass.png"));
            blockImage = ImageIO.read(Demo.class.getClassLoader().getResource("codekamp/images/block.png"));
            jumpImage = ImageIO.read(Demo.class.getClassLoader().getResource("codekamp/images/jump.png"));
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

        Demo.start();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(Demo.gameOver && e.getKeyCode() == KeyEvent.VK_ENTER) {
            Demo.start();
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE && Demo.playerYCord == 315 && !Demo.paused) {
            Demo.jumpAudio.play();
            Demo.playerYVel = -18;
            Demo.playerYAcc = 1;
        } else if (e.getKeyCode() == KeyEvent.VK_P) {
            Demo.paused = !Demo.paused;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static boolean areColliding(int x1, int y1, int w1, int h1, int x2, int y2, int w2, int h2) {
        boolean horizontalOverlap = (x1 > x2 && x1 < x2 + w2) || (x2 > x1 && x2 < x1 + w1);
        boolean verticalOverlap = (y1 > y2 && y1 < y2 + h2) || (y2 > y1 && y2 < y1 + h1);

        return horizontalOverlap && verticalOverlap;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getX() > 50 && e.getX() < 100 && e.getY() > 50 && e.getY() < 100) {
            Demo.paused = !Demo.paused;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void start() {
        Demo.gameOver = false;
        int index = 0;
        int block1XCord = 900;
        int block2XCord = 1100;
        int block3XCord = 1300;
        int block4XCord = 1500;
        int block5XCord = 1700;
        int playerXCord = 364;

        boolean block1Visible = true;
        boolean block2Visible = true;
        boolean block3Visible = true;
        boolean block4Visible = true;
        boolean block5Visible = true;

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (Demo.paused) {
                continue;
            }

            index++;

            if (index == 14) {
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

            block1XCord -= 5;
            block2XCord -= 5;
            block3XCord -= 5;
            block4XCord -= 5;
            block5XCord -= 5;

            if (block1XCord < -20) {
                block1XCord = 980;
                block1Visible = true;
            }


            if (block2XCord < -20) {
                block2XCord = 980;
                block2Visible = true;
            }


            if (block3XCord < -20) {
                block3XCord = 980;
                block3Visible = true;
            }


            if (block4XCord < -20) {
                block4XCord = 980;
                block4Visible = true;
            }


            if (block5XCord < -20) {
                block5XCord = 980;
                block5Visible = true;
            }

            if (block1Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block1XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 50;
                block1Visible = false;
            }

            if (block2Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block2XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 50;
                block2Visible = false;
            }

            if (block3Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block3XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 50;
                block3Visible = false;
            }

            if (block4Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block4XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 50;
                block4Visible = false;
            }

            if (block5Visible && Demo.areColliding(playerXCord, Demo.playerYCord, 72, 90, block5XCord, 355, 20, 50)) {
                hitAudio.play();
                playerXCord -= 50;
                block5Visible = false;
            }

            Image playerImage = playerImages[index / 2];

            if (Demo.playerYCord < 315) {
                playerImage = jumpImage;
            }

            graphics.clearRect(0, 0, 800, 450);


            if(playerXCord <= 0) {
                Demo.gameOver = true;
                graphics.setColor(Color.red);
                graphics.setFont(new Font("Arial", Font.BOLD, 30));
                graphics.drawString("Game Over. Press any key to continue", 200, 100);
                break;
            }

            graphics.fillRect(50, 50, 50, 50);
            graphics.drawImage(grassImage, 0, 405, null);
            graphics.drawImage(playerImage, playerXCord, Demo.playerYCord, null);

            if (block1Visible) {
                graphics.drawImage(blockImage, block1XCord, 355, null);
            }
            if (block2Visible) {
                graphics.drawImage(blockImage, block2XCord, 355, null);
            }
            if (block3Visible) {
                graphics.drawImage(blockImage, block3XCord, 355, null);
            }
            if (block4Visible) {
                graphics.drawImage(blockImage, block4XCord, 355, null);
            }
            if (block5Visible) {
                graphics.drawImage(blockImage, block5XCord, 355, null);
            }
        }
    }
}
