package myzoo;

/**
 * Created by cerebro on 12/06/18.
 */
public class Student {
    public String name;
    public int age;

    public static int averageAge;

    private double attendance;

    private boolean detained;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getAverageAge() {
        return averageAge;
    }

    public static void setAverageAge(int averageAge) {
        Student.averageAge = averageAge;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public boolean isDetained() {
        return detained;
    }

    public void setDetained(boolean detained) {
        this.detained = detained;
    }
}
