package codekamp;

/**
 * Created by cerebro on 12/07/18.
 */
public class Cat {
    public Cat() {
        System.out.println("Cat class kaa constructor");
    }

    // Static code blocks:
    // They are executed only and only once during a software session
    // They are executed automatically whenever a class is used first time
    // ... during a software session.
    static {
        System.out.println("static code block of Cat");
    }

    static {
        System.out.println("Another static code block of Cat");
    }

    public static void hello() {
        System.out.println("Cat saying hello");
    }

    // mysql mariaDB
    // sqlite
    // mssql

    // SQL - Structured Query Language
}
