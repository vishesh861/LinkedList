package Threads;

public class Thread_Demo implements Runnable {



    @Override
    public void run() {

        for (int i=6; i<=10; i++) {
                System.out.println(i);
        }
    }
}
