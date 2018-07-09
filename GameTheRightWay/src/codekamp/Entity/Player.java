package codekamp.Entity;

import codekamp.Resources;

import java.awt.*;

/**
 * Created by cerebro on 06/07/18.
 */
public class Player extends Entity {

    public static final int HEIGHT = 90;
    public static final int WIDTH = 72;

    private boolean inAir = false;

    private int imageIndex = 0;

    public Player(int x, int y) {
        super(x, y, WIDTH, HEIGHT);
    }

    public void update() {
        super.update();

        if(this.inAir) {
            this.image = Resources.getJumpImage();
        } else {
            this.imageIndex++;
            this.imageIndex %= 16;
            this.image = Resources.getPlayerImages()[this.imageIndex / 2];
        }
    }

    public void jump() {
        Resources.getJumpAudio().play();
        this.inAir = true;
        this.yVel = -18;
        this.yAcc = 1;
    }

    public void land() {
        this.yVel = 0;
        this.yAcc = 0;
        this.inAir = false;
    }
}
