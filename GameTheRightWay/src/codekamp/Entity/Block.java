package codekamp.Entity;

/**
 * Created by cerebro on 06/07/18.
 */
public class Block extends Entity {
    public Block(int x, int y) {
        this(x, y, -5, 0);
    }

    public Block(int x, int y, int xVel, int yVel) {
        super(x, y, 20, 50);
    }
}
