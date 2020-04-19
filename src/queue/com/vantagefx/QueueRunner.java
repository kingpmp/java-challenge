package queue.com.vantagefx;

public class QueueRunner {
    public static void main(String[] args) {
    	QueueConsumer<Integer> worker = new QueueConsumer<>();
        worker.run();
    }
}
