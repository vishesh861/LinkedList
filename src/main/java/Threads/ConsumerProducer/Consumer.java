package Threads.ConsumerProducer;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int maxConsumed;
    public Consumer(BlockingQueue<Integer> queue, int maxConsumed) {
        this.queue = queue;
        this.maxConsumed = maxConsumed;
    }
    @Override
    public void run() {
        for (int i = 0; i < maxConsumed; i++) {
            try {
                Integer consumed = queue.take();
                System.out.println("Consumed: " + consumed);
                Thread.sleep(100); // Simulate consumption time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
