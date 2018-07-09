package codekamp.Screen;

import codekamp.Entity.Entity;
import codekamp.Game;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 05/07/18.
 */
abstract public class Screen {

    // private
    // protected - Can be used in same class and sub classes
    // default - Can be used in same class, sub classes and classes of same folder.
    // public

    protected List<Entity> entities = new ArrayList<>();

    public void update() {
        for (Entity e : entities) {
            e.update();
        }
    }

    public void draw(Graphics g) {
        for (Entity e : entities) {
            if (e.visible) {
                g.drawImage(e.image, e.x, e.y, null);
            }
        }

        g.setColor(Color.green);
        g.fillRect(10, Game.HEIGHT - 20, 50, 18);
        g.setColor(Color.red);
        g.drawString("codekamp", 20, Game.HEIGHT - 15);
    }

    public void onKeyPress(int keyCode) {

    }
}
