package Threads;

public class PrintOddByThread1EvenByThread2 {

    private volatile Integer count = 1;
    private volatile Integer threadIdToRun = 1;
    private Object object = new Object();

    public static void main(String[] args) throws InterruptedException {

        PrintOddByThread1EvenByThread2 printOddByThread1EvenByThread2 = new PrintOddByThread1EvenByThread2();
        Thread t1 = new Thread(printOddByThread1EvenByThread2.new Printer(1));
        Thread t2 = new Thread(printOddByThread1EvenByThread2.new Printer(2));

        t1.start();
        t2.start();
    }

    class Printer implements Runnable {

        private int threadId;

        public Printer(int threadId) {
            super();
            this.threadId = threadId;
        }

        @Override
        public void run() {
            try {
                while (count <= 50) {
                    synchronized (object) {
                        if (threadId != threadIdToRun) {
                            object.wait();
                        } else {
                            if (count % 2 != 0 && threadId == 1) {
                                System.out.println("Thread " + threadId + " printed " + count);
                            } else if (count % 2 == 0 && threadId == 2) {
                                System.out.println("Thread " + threadId + " printed " + count);
                            }
                            count += 1;

                            if (count > 50 && threadId == 1) {
                                threadIdToRun = 2;
                                count = 1;
                                object.notifyAll();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
