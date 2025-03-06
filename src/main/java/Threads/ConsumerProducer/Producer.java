package Threads.ConsumerProducer;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int maxProduced;
    public Producer(BlockingQueue<Integer> queue, int maxProduced) {
        this.queue = queue;
        this.maxProduced = maxProduced;
    }
    @Override
    public void run() {
        for (int i = 0; i < maxProduced; i++) {
            try {
                queue.put(i);
                System.out.println("Produced: " + i);
                Thread.sleep(100); // Simulate production time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
