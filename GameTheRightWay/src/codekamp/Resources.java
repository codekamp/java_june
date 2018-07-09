package codekamp;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

/**
 * Created by cerebro on 06/07/18.
 */
abstract public class Resources {

    private static AudioClip jumpAudio;
    private static AudioClip hitAudio;
    private static Image grassImage;
    private static Image[] playerImages = new Image[8];
    private static Image jumpImage;
    private static Image blockImage;

    private static boolean loaded = false;

    //if we use a variable xyz without dot then java searches in below order:
    // 1. local variable xyz
    // 2. non static variable xyz. But this needs object so it uses 'this'
    // ... so it searches for this.xyz.
    // 3. CurrentClass.xyz i.e. static variable xyz in current class.
    // Step #2 is skipped if function is static.

    public static void load() {
        try {
            grassImage = ImageIO.read(Resources.class.getClassLoader().getResource("codekamp/resources/images/grass.png"));
            blockImage = ImageIO.read(Resources.class.getClassLoader().getResource("codekamp/resources/images/block.png"));
            jumpImage = ImageIO.read(Resources.class.getClassLoader().getResource("codekamp/resources/images/jump.png"));
            playerImages[0] = ImageIO.read(Resources.class.getClassLoader().getResource("codekamp/resources/images/run_anim1.png"));
            playerImages[1] = ImageIO.read(Resources.class.getClassLoader().getResource("codekamp/resources/images/run_anim2.png"));
            playerImages[2] = ImageIO.read(Resources.class.getClassLoader().getResource("codekamp/resources/images/run_anim3.png"));
            playerImages[3] = ImageIO.read(Resources.class.getClassLoader().getResource("codekamp/resources/images/run_anim4.png"));
            playerImages[4] = ImageIO.read(Resources.class.getClassLoader().getResource("codekamp/resources/images/run_anim5.png"));
            playerImages[5] = playerImages[3];
            playerImages[6] = playerImages[2];
            playerImages[7] = playerImages[1];
            jumpAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("codekamp/resources/audios/onjump.wav"));
            hitAudio = Applet.newAudioClip(Resources.class.getClassLoader().getResource("codekamp/resources/audios/hit.wav"));
            loaded = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AudioClip getJumpAudio() {
        return jumpAudio;
    }

    public static AudioClip getHitAudio() {
        return hitAudio;
    }

    public static Image getGrassImage() {
        return grassImage;
    }

    public static Image[] getPlayerImages() {
        return playerImages;
    }

    public static Image getJumpImage() {
        return jumpImage;
    }

    public static Image getBlockImage() {
        return blockImage;
    }

    public static boolean isLoaded() {
        return loaded;
    }
}
