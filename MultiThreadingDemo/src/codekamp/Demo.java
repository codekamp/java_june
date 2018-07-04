package codekamp;

/**
 * Created by cerebro on 04/07/18.
 */
public class Demo implements Runnable {
    private static Thread t1;
    private static Thread t2;
    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo.t1 = new Thread(d1);
        Demo.t1.setName("suresh");
        Demo.t1.start();

        Demo.t2 = new Thread(d1);
        Demo.t2.setName("ramesh");
        Demo.t2.start();
    }

    synchronized public static void callNoidaPeople() {
        for (int i = 1; i <= 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Calling Noida person " + i);
        }
    }

    public static void callDelhiPeople() {
        for (int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Calling Delhi person " + i);
        }
    }

    @Override
    public void run() {

        if(Thread.currentThread() == Demo.t1) {
            System.out.println("this is suresh");
            Demo.callNoidaPeople();
        } else {
            System.out.println("this is ramesh");
            Demo.callDelhiPeople();
        }
    }
}
