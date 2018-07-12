package codekamp;

/**
 * Created by cerebro on 12/07/18.
 */
public class Demo {
    public boolean isVisible;

    public static void main(String[] args) {


        Dog d = new Dog() {
            int age = 12;

            public void hello() {
                System.out.println("Hello age: " + this.age + " name: " + this.name);
            }
        };

        Dog d1 = new Dog();
        d1.name = "Pluto";

        Dog d2 = new Dog();
        d2.name = "Mars";


        Dog.Xyz xyz1 = new Dog.Xyz();
        xyz1.age = 99;
        xyz1.hello();

        Dog.Xyz.something();


        Dog.Pqr pqr1 = d1.new Pqr();
        pqr1.age = 1;
        pqr1.hello(); // 'this' will be pqr1 and hence Dog.this will be d1

        Dog.Pqr pqr2 = d1.new Pqr();
        pqr2.age = 2;
        pqr2.hello();  // 'this' will be pqr2 and hence Dog.this will be d1

        Dog.Pqr pqr3 = d2.new Pqr();
        pqr3.age = 1;
        pqr3.hello();  // 'this' will be pqr3 and hence Dog.this will be d2

        pqr1 = d2.new Pqr();

        Cat.hello();
        Cat.hello();
    }

    public void something() {

        Dog d = new Dog() {
            int age = 12;

            public void hello() {
                System.out.println("Hello age: " + this.age + " name: " + this.name + " isVisible: " + Demo.this.isVisible);
            }
        };
    }

}
