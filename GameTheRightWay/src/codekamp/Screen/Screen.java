package codekamp.Screen;

import java.awt.*;

/**
 * Created by cerebro on 05/07/18.
 */
abstract public class Screen {
    abstract public void draw(Graphics g);
    abstract public void update();

    public void onKeyPress(int keyCode) {

    }
}
