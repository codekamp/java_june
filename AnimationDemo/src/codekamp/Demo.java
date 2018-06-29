package codekamp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by cerebro on 29/06/18.
 */
public class Demo implements MouseListener {


    public static void main(String[] args) {
        JFrame f = new JFrame();

        JPanel p = new JPanel();
        p.setPreferredSize(new Dimension(700, 400));
        f.add(p);

        p.addMouseListener(new Demo());

        f.pack();
        f.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        Graphics g = p.getGraphics();

        g.setColor(Color.red);


        int x = 100;
        int y = 0;
        int xVel = 0;
        int yVel = 2;
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
            }

//            g.clearRect(x, y, 100, 100);
            g.clearRect(0, 0, 700, 400);

            x += xVel;
            y += yVel;

            if(x >= 600) {
                xVel = -2;
            }

            if(x <= 0) {
                xVel = 2;
            }

            if(y <= 0) {
                yVel = 2;
            }

            if(y >= 300) {
                yVel = -2;
            }

            g.fillArc(x, y, 100, 100, 0, 360);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //
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
}
