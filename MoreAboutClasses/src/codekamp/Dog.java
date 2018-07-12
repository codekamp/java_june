package codekamp;

/**
 * Created by cerebro on 12/07/18.
 */
public class Dog {

    // 1. objects of nested static class belong to outter class but
    // ... but objects of non static nested class belong to individual
    // ... object of outer class.

    // 2. Nested non static classes are also called inner classes.
    // 3. We can't create static functions/variables inside non static
    // ...nested classes.

    // 4. Non static nested classes have 2 'this'.

    public String name;

    public void bark() {
        System.out.println("Wuff Wuff");
    }

    public static void aaa() {
        System.out.println("Just printing aaa");
    }

    public static class Xyz {
        public int age;

        public void hello() {
            System.out.println("This is Xyz class age: " + this.age);
        }

        public static void something() {
//            System.out.println("something " + this.age);
        }
    }

    public class Pqr {
        public int age;

        public void hello() {
            System.out.println("This is Pqr class age: " + this.age + " name: " + Dog.this.name);
        }


//        public static void something() {
//            System.out.println("something " + this.age);
//        }
    }

    // facebook.com/codekamp.in
}
