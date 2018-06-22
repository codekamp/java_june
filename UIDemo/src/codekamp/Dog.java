package codekamp;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cerebro on 22/06/18.
 */
public class Dog implements Educated, ActionListener {

    public void chaseTheBall() {
        System.out.println("Run run run");
    }

    @Override
    public void read() {
        System.out.println("anything here");
    }

    @Override
    public void write() {
        System.out.println("write any code");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Dog class kaa actionPerformed");
    }
}
