package myzoo;


// Naming convention:
// 1. Classes and file name are camel cased
//  myawesomeclass - wrong
//  my-awesome-class - wrong
//  my_awesome_class - wrong
//  my awesome class - wrong syntax
//  MyAwesomeClass - Right

// 2. variables and methods(functions) are also camel cased
// but first letter of first word is small.
// MyAwesomeFunction - wrong
// myAwesomeFunction - right


// Directly inside a class we can only define methods and variables
// and initialize variables at time of definition.

// Private methods or variables can be accessed only within same class.
// public methods or variables can be accessed anywhere.
// Abstraction i.e. try to make things private so that your class is easy
// to use.

// Encaptulation - Everything has a place and everything at it's place.
// So that it's easier to find thing and if not found you can can be sure that
// it doesnt' exit and we need to create.
// Agar maggie alimrah mein nahi hai so it means maggie nahi hai.

// Static is group ki property. And non static individual ki property.
// So Dog ki averageAge is static and Dog ki age is non static.


// By creating a new class we add a new data type.

// Let's say we have a class named Dog.
// To use static variable  of Dog class we will use "Dog." e.g. Dog.averageAge;
// But to use non static variables of Dog class we will need Dog kaa koi
// ... individual. e.g. Dog d1 = new Dog(); d1.name;

public class Demo {

    private static Student s1;
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Dog.jump();
//        Cat.jump();
//
//        System.out.println(Dog.averageAge);
//        System.out.println(Cat.averageAge);

        Demo.s1 = new Student();
        Demo.s1.name = "Suresh";
        Demo.s1.age = 23;
        Student.averageAge = 25;


        Student s2 = new Student();
        s2.name = "Ramesh";
        s2.age = 19;
        Student.averageAge = 30;



        System.out.println(Demo.s1.name);
        System.out.println(s2.name);
        System.out.println("------------");
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println("------------");
        System.out.println(Student.averageAge);
        System.out.println(Student.averageAge);


    }


}