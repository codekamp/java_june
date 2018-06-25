package codekamp;

/**
 * Created by cerebro on 25/06/18.
 */
public class Dog {
    // Constructors are special functions/methods that are used to
    // configure the objects immediately after creation
    // 1. non static
    // 2. Same name as class name
    // 3. no return type, not even void


    // Unlike all other functions, constructors are not called with a dot.

    public Dog() {
        System.out.println("random function");
    }

    public Dog(String name) {
        System.out.println("A new dog named " + name);
    }


    // int x = 10;
    // String x1 = Integer.toString(x);

    // double x = 10.5;
    // String x1 = Double.toString(x);


    // String y = "30";
    // int y1 = Integer.parseString(y);


    // String y = "30";
    // double y1 = Double.parseString(y);
}
