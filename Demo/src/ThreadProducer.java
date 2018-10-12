import java.util.Queue;


public class ThreadProducer extends Thread
{
	private final  Queue sharedQueue;

	public ThreadProducer(Queue sharedQueue) {
		super("ThreadProducer");
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run(){
		
		for(int i= 0; i<4; i++){
			synchronized (sharedQueue) {
				while (sharedQueue.size() > 1) {

					try {
						System.out.println("Queue is full wating to empty");
						sharedQueue.wait();
					} catch (Exception e) {

					}
				}
				System.out.println("Producer start producing");
				sharedQueue.add(i);
				sharedQueue.notify();
			}
			
			
		}
	}


}
