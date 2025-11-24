import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueueBank {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");

        System.out.println("Initial Queue: " + queue);

        String served = queue.poll();
        System.out.println("Served: " + served);

        System.out.println("Queue after serving: " + queue);

        queue.add("Customer 4");
        System.out.println("Queue after adding Customer 4: " + queue);

        served = queue.poll();
        System.out.println("Served: " + served);

        System.out.println("Final Queue: " + queue);
    }
}