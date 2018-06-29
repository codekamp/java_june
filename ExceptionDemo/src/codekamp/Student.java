package codekamp;

/**
 * Created by cerebro on 28/06/18.
 */
public class Student {
    public static Integer[] marks = {29, 75, null, 45, 98, null};
    public static int[] feeDefaulters = {1, 4};

    // a function may have 0, 1 or more throw type
    // throw type can only be a subclass of Throwable

    public static int getMarks(int rollNumber) throws RollNumberNotFound, CopyNotCheckedYet, FeeNotDeposited {
        if(rollNumber > 5) {
            // function failed because rollnumber not in our db
            RollNumberNotFound r = new RollNumberNotFound();
            throw r;
        } else {
            for (int i = 0; i < Student.feeDefaulters.length; i++) {
                if(Student.feeDefaulters[i] == rollNumber) {
                    throw new FeeNotDeposited();
                }
            }
        }

        Integer marks = Student.marks[rollNumber];

        if(marks == null) {
            // function failed because abhi iss rollnumber ki copies check nahi hui
            throw new CopyNotCheckedYet();

        }

        return marks;
    }

    // not catching an exception is equivalent to catching and immediately
    // ... rethrowing it.
    public static int getFailedStudentCount() throws CopyNotCheckedYet {
        int failedStudents = 0;

        for (int i = 0; i < 6; i++) {
            try {
                int marks = Student.getMarks(i);
                if(marks < 30) {
                    failedStudents++;
                }
            } catch (RollNumberNotFound e) {

            } catch (FeeNotDeposited e) {
                failedStudents++;
            }
        }

        return failedStudents;
    }

    public static void xyz() {

    }
}
