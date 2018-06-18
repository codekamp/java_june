package codekamp;

/**
 * Created by cerebro on 14/06/18.
 */
public class Kangaroo extends Animal {

    // method overriding
    // If inhertited method is not good enough for a class, it can
    // define it's own and override the parent definition.
    public void walk() {
        System.out.println("Jumping jumping jumping " + this.name);
    }


    // method overloading
    // ek class mein ek hi naam ke multiple methods hona is method overloading
    // but for method overloading, parameter types of mehtods have to be different.

    public void eat() {
        System.out.println("Eating grass");
    }


    public void eat(String item) {
        System.out.println("Eating " + item);
    }


    public void eat(int count) {
        System.out.println("Eating " + count);
    }

    public void eat(String item, int count) {
        System.out.println("Eating " + count + " " + item);
    }


    public void eat(int count, String item) {
        System.out.println("Eating " + count + " " + item);
    }
}
