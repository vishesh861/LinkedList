package Threads;

public class A2 implements Runnable{
    int i = 61;
    @Override
    public void run() {

        while (i<=90) {
            System.out.print(i + " ");
            i++;
        }
    }
}
