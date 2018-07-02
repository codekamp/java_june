package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by cerebro on 29/06/18.
 */
public class Demo implements MouseListener, KeyListener {

    private static int xVel = 0;
    private static int yVel = 2;

    public static void main(String[] args) {
        JFrame f = new JFrame();

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(700, 400));
        f.add(p);

        Demo d1 = new Demo();
        p.addMouseListener(d1);

        p.setFocusable(true);
        p.addKeyListener(d1);

        f.pack();
        f.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        p.requestFocus();
        Graphics g = p.getGraphics();

        g.setColor(Color.red);


        int x = 100;
        int y = 0;
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
            }

//            g.clearRect(x, y, 100, 100);
            g.clearRect(0, 0, 700, 400);

            x += Demo.xVel;
            y += Demo.yVel;

            if (x >= 600) {
                Demo.xVel = -2;
            }

            if (x <= 0) {
                Demo.xVel = 2;
            }

            if (y <= 0) {
                Demo.yVel = 2;
            }

            if (y >= 300) {
                Demo.yVel = -2;
            }

            g.fillArc(x, y, 100, 100, 0, 360);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (Demo.xVel == 2) {
            Demo.xVel = 0;
            Demo.yVel = -2;
        } else if (Demo.yVel == -2) {
            Demo.xVel = -2;
            Demo.yVel = 0;
        } else if (Demo.xVel == -2) {
            Demo.xVel = 0;
            Demo.yVel = 2;
        } else if (Demo.yVel == 2) {
            Demo.xVel = 2;
            Demo.yVel = 0;
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

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Demo.xVel = 0;
            Demo.yVel = -2;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Demo.xVel = -2;
            Demo.yVel = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Demo.xVel = 0;
            Demo.yVel = 2;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Demo.xVel = 2;
            Demo.yVel = 0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
