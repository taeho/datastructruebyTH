package ch08.queue;

public class ArrayCQueue implements Queue {
	
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayCQueue(int queueSize){
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front==rear);
	}
	
	public boolean isFull() {
		return (((rear + 1 ) % this.queueSize) == front);
	}

	@Override
	public void enQueue(char item) {
		// TODO Auto-generated method stub
		if(isFull()){
			System.out.println("Inserting was Failed!! Array Circular Queue is full!!");
		} else {
			rear = (rear + 1 ) % this.queueSize;
			itemArray[rear] = item;
			System.out.println("Inserted item : " + item);
		}
	}

	@Override
	public char deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Deleting was Failed!! Array Circular Queue is empty!!");
			return 0;
		} else {
			front = (front + 1) % this.queueSize;
			return itemArray[front];
		}
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			System.out.println("Deleting was deleted!! Array Circular Queue is Empty!! ");
		} else {
			front = (front + 1) % this.queueSize;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Peeking was failed Array Circular Queue is empty!! ");
			return 0;
		} else {
			return itemArray[(front + 1 ) % this.queueSize];
		}
		
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("Array Circular Queue is empty!! ");
		} else {
			System.out.printf("Array Circular Queue>> ");
			for(int i=(front+1) % this.queueSize; i!= (rear+1)% this.queueSize; i=++i % this.queueSize){
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();
			System.out.println();
		}
	}

}
