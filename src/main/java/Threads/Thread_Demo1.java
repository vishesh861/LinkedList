package Threads;

public class Thread_Demo1 implements Runnable {



    @Override
    public void run() {
        for (int i=1; i<=5; i++) {

                System.out.println(i);

        }
        notify();

    }
}
