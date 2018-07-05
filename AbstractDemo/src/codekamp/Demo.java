package codekamp;

/**
 * Created by cerebro on 05/07/18.
 */
public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();

        a.talk();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }
    }
}
