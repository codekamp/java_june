package codekamp;

/**
 * Created by cerebro on 14/06/18.
 */
public class Animal {


    // Jiska koi nahi hota uska bhagwan hota hai.
    // Jiski koi super class nahi hoti uski super class Object hoti hai.

    // Every class in java inherits from Object directly or indirectly.

    public String name;

    public void talk() {
        System.out.println("wuff wuff");
    }

    public void walk() {
        System.out.println("Moving moving moving moving " + this.name);
    }
}
