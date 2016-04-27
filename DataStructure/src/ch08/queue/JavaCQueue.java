package ch08.queue;

/*
 * 자바 원형큐 
 * */

public class JavaCQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int queueSize = 4;
		char deleteItem;
		ArraryCQueue cQ = new ArraryCQueue(queueSize);
		
		cQ.enQueue('A');
		cQ.printQueue();
		
		cQ.enQueue('B');
		cQ.printQueue();
		
		deleteItem = cQ.deQueue();
		if(deleteItem != 0)
			System.out.println("delete item : " + deleteItem);
		cQ.printQueue();
		
		cQ.enQueue('C');
		cQ.printQueue();
		
		cQ.enQueue('D');
		cQ.printQueue();
		
		cQ.enQueue('E');
		cQ.printQueue();		
	}

}
