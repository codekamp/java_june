package codekamp;

/**
 * Created by cerebro on 28/06/18.
 */
public class Demo {
    // final variable's value can't be changed
    // final method can't be overridden
    // final class can't be subclassed

    public static void main(String[] args) {

        try {
            System.out.println("Try ki first line");
            int marks = Student.getMarks(0);
            System.out.println("getMarks successful");
            System.out.println(marks);
        } catch (Exception xyz) {
            System.out.println("getMarks failed");
        } finally {

        }

        System.out.println("after try catch");


        try {
            int failedStudents = Student.getFailedStudentCount();
        } catch (CopyNotCheckedYet copyNotCheckedYet) {

        }

        Student.xyz();
    }


}
