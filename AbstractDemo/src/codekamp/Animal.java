package codekamp;

/**
 * Created by cerebro on 05/07/18.
 */
abstract public class Animal {
    // Abstract functions are functions which have no body, just signature.
    // You can make abstract functions only in abstract classes or interfaces,
    // ... but not in regular classes.

    // Abstract Classes lies somewhere in middle of Classes and Interfaces.

    // 1. Objects of Abstract classes can't be created.
    // 2. Abstract class can have unimplmented (abstract) methods
    // 3. Regular subclasses of abstract classes need to implement any abstract methods
    // ... of parent class.

    abstract public void talk();
}
