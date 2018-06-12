package myzoo;

/**
 * Created by cerebro on 12/06/18.
 */
public class Dog {
    public static int averageAge = 10;
    public int age = 10;

    public static void jump() {
        System.out.println("Dog is jumping");

        Dog.talk();
        Dog.talk();
        Dog.talk();
    }

    private static void talk() {
        System.out.println("Wuff Wuff");
    }

    public static void moveShip(int x, int y) {

    }

}
