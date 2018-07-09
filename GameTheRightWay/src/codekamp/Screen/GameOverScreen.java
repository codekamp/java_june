package codekamp.Screen;

import codekamp.Game;
import codekamp.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by cerebro on 05/07/18.
 */
public class GameOverScreen extends Screen {

    @Override
    public void draw(Graphics g) {
        super.draw(g);

        g.setColor(Color.green);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.setColor(Color.red);
        g.drawString("Game Over. Press enter to restart", 100, 200);
    }

    @Override
    public void onKeyPress(int keyCode) {
        if(keyCode == KeyEvent.VK_ENTER) {
            Game.score = 0;
            GamePanel.currentScreen = new Stage1Screen();
        }
    }
}
