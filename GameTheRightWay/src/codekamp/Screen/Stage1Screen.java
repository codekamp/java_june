package codekamp.Screen;

import codekamp.Game;
import codekamp.Resources;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by cerebro on 05/07/18.
 */
public class Stage1Screen extends Screen {

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.drawImage(Resources.getGrassImage(), 0, Game.HEIGHT - 45, null);
    }

    @Override
    public void update() {
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_SPACE) {
            System.out.println("Player will jump");
        }
    }
}
