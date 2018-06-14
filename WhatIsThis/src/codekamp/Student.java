package codekamp;

/**
 * Created by cerebro on 13/06/18.
 */
public class Student {
    public String name;
    public int marks;
    public int attendance;

    public static String profession = "Vidya ki arthi uthana";


    // 1. "this" is a magic local variable which is always availabe inside
    // ... non static methods.

    // 2. "this" always stores the object on which the method was called

    // 3. Datatype of "this" is class in which we write "this"

    public boolean hasFailed() {
//        Student this;
        if(this.marks < 33 || this.attendance < 70) {
            return true;
        } else {
            return false;
        }
    }

    public int attendanceNeededToPass() {
        System.out.println(this.name);
        if(this.attendance > 70) {
            return 0;
        } else {
            return 70 - this.attendance;
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public boolean hasGreaterMarksThan(Student s) {
        return this.marks > s.marks;
    }

    // new project
    // src/codekamp
    // inside codekamp, Demo, Dog, Cat, Animal classes
    // inside Demo main function
    // inside Dog and Cat, create talk method.
    // inside Dog and Cat, create a variable "public String name;"
    // side Dog and Cat, create method walk

    // cave of programming java
}
