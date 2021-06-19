package Threads;

public class Thread_Demo extends Thread {

    public synchronized void run() {

        for (int i=0; i<5; i++) {
                System.out.println(i);
        }
        print();
    }

    public static synchronized void print() {

        for (int i=5; i<10; i++) {
            System.out.println(i);
            print1();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void print1() {

        for (int i=10; i<15; i++) {
            System.out.println(i);
        }
    }
}
