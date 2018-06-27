package codekamp;

import javax.swing.plaf.PanelUI;

/**
 * Created by cerebro on 14/06/18.
 */
public class Animal {


    // Jiska koi nahi hota uska bhagwan hota hai.
    // Jiski koi super class nahi hoti uski super class Object hoti hai.

    // Every class in java inherits from Object directly or indirectly.

    public String name;

    public void talk() {
        System.out.println("Animal talking");
        // data type of variable 'this' is animal
        this.walk();
    }

    public void walk() {

        System.out.println("Animal class kaa walk method");
    }

    public void doFavoriteThing() {
    }
}
