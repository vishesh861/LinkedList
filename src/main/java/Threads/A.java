package Threads;

public class A  implements Runnable{

int i = 0;
    @Override
    public void run() {

        while (i++<=30) {
            System.out.print(i + " ");
        }
    }
}
