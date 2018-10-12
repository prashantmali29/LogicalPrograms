import java.util.Queue;


public class ThreadConsumer extends Thread {

	private final Queue sharedQueue;

	public ThreadConsumer(Queue sharedQueue) {
		super("ThreadConsumer");
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run(){
		while(true) {

            synchronized (sharedQueue) {
                //waiting condition - wait until Queue is not empty
                while (sharedQueue.size() == 0) {
                    try {
                    	System.out.println("Thread consumer waiting");
                        sharedQueue.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                int number = (int) sharedQueue.poll();
                System.out.println("Thread consumer"+number);
                sharedQueue.notify();
                //termination condition
                if(number == 3){break; }
            }
        }



	}
	
}
