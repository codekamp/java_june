package codekamp;

import java.util.Random;

/**
 * Created by cerebro on 14/06/18.
 */
public class Demo {

    private static Animal screenAnimal;

    // DRY - Don't Repeat Yourself
    public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.name = "Pluto";

        // d1.talk() means java will try to find a non static public function
        // named talk() inside Data type of d1 which is Dog.
        // If it doesn't find one, it will go parent class of Dog to search.
        // agar wahan bhi nahi mila to uski bhi parent class mein. And soo on...
        // Java will keep on searching till it finds the function or reaches Object
        // ... class. Agar Object class mein bhi nahi mila then Java will show error.
//        d1.walk();

//        System.out.println("------");
//
//        Kangaroo k1 = new Kangaroo();
//        k1.name = "Australia";
//        k1.walk();
//        k1.eat("Pizza");
//
//        System.out.println("------");
//
//        Cat c1 = new Cat();
//        c1.name = "Billi";
//        c1.walk();
//        c1.talk();
//        c1.talk("Hello");


//        Dog d2 = new Cat();

        // M.Tech is required so B.Tech won't work
//        Dog d3 = new Animal();

        // B.Tech is required so M.Tech will also work
//        Animal a2 = new Dog();
//        a2.walk();

        // Inside a variable of XYZ class you can store object of
        /// ... XYZ class and it's subclasses

//        https://www.freetutorials.us/git-complete-the-definitive-step-by-step-guide-to-git/

        // Data type of variable can always be determined at compile time but
        // ... but it's not always possible to determine data type of object
        // ... stored inside a variable at compile time and it can be determined
        // ... only at run time.

        // Sirf code ko dekh kar app variable ki data type toh bata sakte ho
        // ... but usmein stored object ki datatype batana ke liye code run
        // ... karna zaroori hai

        // Compile time errors / run time errors.
        // errors are always bad, but compile time errors are
        // ... less bad. because:
        // 1. Compile time are faced by developer while run time may reach user.
        // 2. Compile time are easy to debug


        // At compile time methods search starts from class of variable
        // But at run time methods search starts from class of object.

//        Random r = new Random();

//        value of xyz will be 10 to 15, includeing the limits
//        int xyz = 10 + r.nextInt(6);

//        int animalType = r.nextInt(3);
//
//        if(animalType == 0) {
//            Demo.screenAnimal = new Dog();
//        } else if(animalType == 1) {
//            Demo.screenAnimal = new Cat();
//        } else {
//            Demo.screenAnimal = new Kangaroo();
//        }


//        Demo.onDoubleTap();


//        Dog myDog = new Dog();
//        myDog.enemyCat = new Cat(); // Cat #1
//        myDog.enemyCat.enemyDog = myDog;
//
//        myDog.enemyCat = null;


        Dog d1 = new Dog();
        d1.walk();
    }


    // This approach is DRY but doesn't follow encaptulation because we
    // ... are writing a function belonging to Cat/Dog class in Demo class
    // ... but Demo has nothing to do with Walk.
//    public static void walk(String name) {
//        System.out.println("Moving moving moving moving " + name);
//    }

    public static void onDoubleTap() {

        Demo.screenAnimal.doFavoriteThing();
    }

    public static void onRightSwipe() {
        Demo.screenAnimal.walk();
    }
}
