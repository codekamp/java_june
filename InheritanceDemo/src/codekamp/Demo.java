package codekamp;

/**
 * Created by cerebro on 14/06/18.
 */
public class Demo {

    // DRY - Don't Repeat Yourself
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Pluto";

        // d1.talk() means java will try to find a non static public function
        // named talk() inside Data type of d1 which is Dog.
        // If it doesn't find one, it will go parent class of Dog to search.
        // agar wahan bhi nahi mila to uski bhi parent class mein. And soo on...
        // Java will keep on searching till it finds the function or reaches Object
        // ... class. Agar Object class mein bhi nahi mila then Java will show error.
        d1.walk();

        System.out.println("------");

        Kangaroo k1 = new Kangaroo();
        k1.name = "Australia";
        k1.walk();
        k1.eat("Pizza");

        System.out.println("------");

        Cat c1 = new Cat();
        c1.name = "Billi";
        c1.walk();
        c1.talk();
        c1.talk("Hello");


//        Dog d2 = new Cat();

        // M.Tech is required so B.Tech won't work
//        Dog d3 = new Animal();

        // B.Tech is required so M.Tech will also work
        Animal a2 = new Dog();

        // Inside a variable of XYZ class you class store object of
        /// ... XYZ and it's subclasses

//        https://www.freetutorials.us/git-complete-the-definitive-step-by-step-guide-to-git/
    }


    // This approach is DRY but doesn't follow encaptulation because we
    // ... are writing a function belonging to Cat/Dog class in Demo class
    // ... but Demo has nothing to do with Walk.
//    public static void walk(String name) {
//        System.out.println("Moving moving moving moving " + name);
//    }
}
