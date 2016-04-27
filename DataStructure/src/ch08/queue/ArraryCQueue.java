package ch08.queue;

public class ArraryCQueue implements Queue {
	
	private int front;	// 저장된 원소 중에서 첫 번째 원소지정하여 삭제 연산만 수행
	private int rear;	// 다른쪽 끝은 삽입 연산만 수행하도록 제한
	private int queueSize;
	private char itemArray[];
	
	// 초기화 
	// 초기 공백상태의 원형큐 이므로 front/rear 0로 초기화 
	public ArraryCQueue(int queueSize){
		front = 0;	
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front == rear);
	}
	
	public boolean isFull(){
		
		return (rear == this.queueSize -1);
	}

	@Override
	public void enQueue(char item) {
		// TODO Auto-generated method stub
		if(isFull())	// 포화상태 체크
			System.out.println("Inserting fail! Circular Queue is Full!!");
		else {
			rear = (rear+1) % this.queueSize;	
			// 나머지연산자 %, 예를 들어 크기가 4인 원형 큐에서 현재 rear의 위치가 2이면, (2+1)mod4=3
			// 이 되고, 삽입할 다음 위치는 cQ[3]이 되고, 현재 rear의 위치가 3이라면 (3+1)mode4=0
			// 이 되어, 삽입할 다음 위치는 cQ[0]이 된다.
			itemArray[rear] = item;
			System.out.println("Insert Item : " + item);
		}
		
	}

	@Override
	public char deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Circular Queue is Emtpy!!");
			return 0;
		} else {
			front = (front + 1) % this.queueSize;
			return itemArray[front];
		}
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Circular Queue is Emtpy!!");			
		} else {
			front = (front+1) % this.queueSize;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("peeking fail! Circular Queue is Emtpy!!");
			return 0;
		} else {
			return itemArray[(front + 1) % this.queueSize];
		}
	}
	
	public void printQueue(){
		if(isEmpty()) {
			System.out.println("Circular Queue is Emtpy!!");			
		} else {
			System.out.printf("Array Circular Queue >> ");
			for(int i = (front +1) % this.queueSize ; i != (rear+1) % this.queueSize; i=++i % this.queueSize){
				System.out.printf("%c", itemArray[i]);
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
