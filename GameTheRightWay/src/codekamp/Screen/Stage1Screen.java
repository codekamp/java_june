package codekamp.Screen;

import codekamp.Entity.Block;
import codekamp.Entity.Entity;
import codekamp.Entity.Player;
import codekamp.Game;
import codekamp.GamePanel;
import codekamp.Resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.KeyEvent;

/**
 * Created by cerebro on 05/07/18.
 */
public class Stage1Screen extends Screen {

    private static final int GROUND_Y = Game.HEIGHT - 45;
    private static final int BLOCK_GAP = 200;
    private static final int BLOCK_Y = GROUND_Y - 50;
    private static final int PLAYER_GROUND_Y = GROUND_Y - Player.HEIGHT;
    private static final int PLAYER_INITIAL_X = (Game.WIDTH - Player.WIDTH) / 2;

    private Player player;
    private List<Block> blocks = new ArrayList<>();

    public Stage1Screen() {
        this.blocks.add(new Block(900, BLOCK_Y));
        this.blocks.add(new Block(900 + BLOCK_GAP, BLOCK_Y));
        this.blocks.add(new Block(900 + 2 * BLOCK_GAP, BLOCK_Y));
        this.blocks.add(new Block(900 + 3 * BLOCK_GAP, BLOCK_Y));
        this.blocks.add(new Block(900 + 4 * BLOCK_GAP, BLOCK_Y));

        this.player = new Player(PLAYER_INITIAL_X, PLAYER_GROUND_Y);

        this.entities.addAll(this.blocks);
        this.entities.add(this.player);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
        g.drawImage(Resources.getGrassImage(), 0, GROUND_Y, null);
        g.setColor(Color.red);
        g.drawString("Score: " + Game.score, 20, 20);
        super.draw(g);
    }

    @Override
    public void update() {
        super.update();

        if(this.player.x <= 0) {
            GamePanel.currentScreen = new GameOverScreen();
            return;
        }

        if (this.player.y >= PLAYER_GROUND_Y && this.player.yVel != 0) {
            this.player.y = PLAYER_GROUND_Y;
            this.player.land();
        }

        for (Block b : blocks) {
            if (b.isCollidingWith(this.player)) {
                Resources.getHitAudio().play();
                this.player.x -= 50;
                b.visible = false;
            }

            if(b.x <= -b.width) {
                if(b.visible) {
                    Game.score += 10;
                }
                b.x = Game.WIDTH + BLOCK_GAP - b.width;
                b.visible = true;
            }
        }
    }

    @Override
    public void onKeyPress(int keyCode) {
        if (keyCode == KeyEvent.VK_SPACE && this.player.y == PLAYER_GROUND_Y) {
            this.player.jump();
        }
    }
}
