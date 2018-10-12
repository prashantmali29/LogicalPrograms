import java.util.LinkedList;
import java.util.Queue;


public class TestThread {

	public static void main(String[] args) {
		final Queue sharedQ = new LinkedList();

        Thread producer = new ThreadProducer(sharedQ);
        Thread consumer = new ThreadConsumer(sharedQ);
        
        
      

        producer.start();
        consumer.start();



	}
}
