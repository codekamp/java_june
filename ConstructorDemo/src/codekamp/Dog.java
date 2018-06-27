package codekamp;

import java.awt.*;

/**
 * Created by cerebro on 25/06/18.
 */
public class Dog extends Animal {
    private static int count = 0;

    public String breed;
    public String name;
    public Color color;
    // Constructors are special functions/methods that are used to
    // configure the objects immediately after creation
    // 1. non static
    // 2. Same name as class name
    // 3. no return type, not even void


    // Unlike all other functions, constructors are not called with a dot.





    // if a class has no contructor, java adds an empty constructor with no
    // ...parameters. So a class with 0 constructors has 1 contructor.

    // Constructors are not inherited.


    // Purane object pe Constructor call nahi ho sakta


    // this() means we are calling constructor of current class
    // super() means we are calling constructor of parent class

    // First line in every constructor should be a call to parent class'
    // ... constructor. Directly or Indirectly.


    public static int getCount() {
        return Dog.count;
    }

    public Dog(String breed) {
        this(breed, "Gumnam kutta");
    }

    public Dog(String breed, String name) {
        super(10);
        this.breed = breed;
        this.name = name;
    }

    public void talk() {
        System.out.println("Dog class kaa talk method");
    }

    //


    // int x = 10;
    // String x1 = Integer.toString(x);

    // double x = 10.5;
    // String x1 = Double.toString(x);


    // String y = "30";
    // int y1 = Integer.parseString(y);


    // String y = "30";
    // double y1 = Double.parseString(y);
}
