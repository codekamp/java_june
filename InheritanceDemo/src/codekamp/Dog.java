package codekamp;

/**
 * Created by cerebro on 14/06/18.
 */
public class Dog extends Animal {

    public Cat enemyCat;

    public void chaseTheTail() {

        System.out.println("having fun chasing the tale");
    }

    public void doFavoriteThing() {

        System.out.println("Play with ball");
    }

    public void talk() {
        System.out.println("Wuff Wuff");

        // Datatype of this is Dog
//        this.walk();

        // Datatype of super Dog's immediate parent class
        // Even at run time super always starts method search from
        // ... immediate parent class, irrespective of object type
        // So Object's datatype doesn't matter in case of super
        super.walk();
    }

    public void walk() {

        System.out.println("create sound");
        super.walk();

        System.out.println("create sound");
    }
}
