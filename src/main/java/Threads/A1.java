package Threads;

public class A1 implements Runnable {

    int i = 31;
    @Override
    public void run() {

        while (i++<=60) {
            System.out.print(i + " ");
        }
    }
}
