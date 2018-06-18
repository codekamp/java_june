package codekamp;

/**
 * Created by cerebro on 14/06/18.
 */
public class Cat extends Animal {

    public void climbTree() {
        System.out.println(this.name + " is climbing the tree");
    }

    public void talk(String sound) {
        System.out.println("Talking with sound " + sound);
    }

    // This approach follows encaptulation but is not DRY because we need to
    // ...write walk function in both Dog and Cat class
//    public void walk() {
//        System.out.println("Moving moving moving moving " + this.name);
//    }
}
