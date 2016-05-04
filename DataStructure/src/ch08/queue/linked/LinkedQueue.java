package ch08.queue.linked;

/*
 * Queue: ���� �ڷᱸ�� ����� �̿��Ͽ� ������ ť  
 * 
 * */


public class LinkedQueue implements Queue {
	
	QNode front;
	QNode rear;
	
	public LinkedQueue(){
		front = null;
		rear = null;
	}
	
	@Override
	public boolean isEmpty() {
		return (front == null);
	}

	@Override
	public void enQueue(char item) {
		QNode newNode = new QNode();
		newNode.data = item;
		newNode.link = null;
		
		if(isEmpty()){
			front = newNode;
			rear = newNode;
		} else {
			rear.link = newNode;
			rear = newNode;
		}
		
		System.out.println("Inserted item : " + item);
	}

	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("Deleting fail!! Linked Queue is Empty!!");
			return 0;
		} else {
			char item = front.data;
			front = front.link;
			
			if(front == null) {
				rear = null;
			}
			return item;
		}
	}

	@Override
	public void delete() {
		if(isEmpty()) { 
			System.out.println("Deleting fail!! Linked Queue is Empty!! ");
		} else { 
			front = front.link;
			if(front == null ) {
				rear = null;
			}
		} 
	}

	@Override
	public char peek() {
		if(isEmpty()) {
			System.out.println("Peeking fail!! Linked Queue is empty!!");
			return 0;
		} else {
			return front.data;
		}
	}
	
	public void printQueue() {
		if(isEmpty()) {
			System.out.printf("Linked Queue is Empty!! \n \n ");
		} else {
			QNode temp = front;
			System.out.printf("Linked Queue >> ");
			while(temp != null ) {
				System.out.printf("%c ", temp.data);
				temp = temp.link;
			}
			System.out.println();
			System.out.println();
		}
	}

}
