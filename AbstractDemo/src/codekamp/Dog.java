package codekamp;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by cerebro on 05/07/18.
 */
public class Dog extends Animal {

    public void bark() {
        System.out.println("wuff wuff");
    }

    @Override
    public void talk() {
    }
}
