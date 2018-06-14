package codekamp;

/**
 * Created by cerebro on 13/06/18.
 */
public class Demo {

    public static Student s4;
    private static Student s5;
    private Student s6;

    public static void main(String[] args) {
        Student s1 = new Student(); // Object #1
        s1.name = "Suresh";
        s1.marks = 30;
        s1.attendance = 90;
//
        Student s2 = new Student(); // Object #2
        Student s3 = s2;

        Demo.s4 = s2;
        Demo.s5 = s2;

        Demo d1 = new Demo();
        d1.s6 = s2;

        s2.name = "Ramesh";
        s2.marks = 95;
        s2.attendance = 75;

        // If I write "s2." I will be able to acess public and non static
        //  ... methods and variables of Student class only.

        // If I write "Student." I will be able to access public and static
        // ... methods and variables on student class.


        // private/public, local/non local, static/non static are
        // ... properties of variables, not objects/instances.

        // local variables are not static/non static or private/public.

        System.out.println(s2.name);

        boolean hasS1Failed = s1.hasFailed();
        boolean hasS2Failed = s2.hasFailed();
        System.out.println(hasS1Failed);
        System.out.println(hasS2Failed);

        Student.add(10, 20);
        Student.add(10, 20);
        Student.add(9, 999);

        System.out.println(s2.hasGreaterMarksThan(s1));
    }
}
