package myzoo;

/**
 * Created by cerebro on 12/06/18.
 */
public class Ship {
    private static int fuel = 100;
    private static int xCord = 0;
    private static int yCord = 0;

    public static void move(int x, int y) {
        int fuelNeeded = Ship.fuelNeeded(x, y);

        if(fuelNeeded < Ship.fuel) {
            Ship.xCord = x;
            Ship.yCord = y;
            Ship.fuel  = Ship.fuel - fuelNeeded;
        } else {
            System.out.println("You don't have enough fuel");
        }
    }

    private static int fuelNeeded(int x, int y) {
        return (Math.abs(Ship.xCord - x) + Math.abs(Ship.yCord - y)) * 2;
    }

    public static int getFuel() {
        return Ship.fuel;
    }

    public static int getX() {
        return Ship.xCord;
    }

    public static int getY() {
        return Ship.yCord;
    }
}
