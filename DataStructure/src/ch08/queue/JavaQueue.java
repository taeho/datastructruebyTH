package ch08.queue;

public class JavaQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int queueSize = 3;
		char deleteItem;
		ArraryQueue Q = new ArraryQueue(queueSize);
		
		Q.enQueue('A');
		Q.printQueue();
		
		Q.enQueue('B');
		Q.printQueue();
		
		deleteItem = Q.deQueue();
		if(deleteItem != 0)
			System.out.println("delete item : " + deleteItem);
		Q.printQueue();
		
		Q.enQueue('C');
		Q.printQueue();
		
		deleteItem = Q.deQueue();
		if(deleteItem != 0)
			System.out.println("delete item : " + deleteItem);
		Q.printQueue();
		
		deleteItem = Q.deQueue();
		if(deleteItem != 0)
			System.out.println("delete item : " + deleteItem);
		Q.printQueue();
		
		deleteItem = Q.deQueue();
		if(deleteItem != 0)
			System.out.println("delete item : " + deleteItem);
		Q.printQueue();
		
	}

}
