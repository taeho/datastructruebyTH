package ch08.queue;

/*
 * 순차 자료구조를 사용한 큐 
 * 
 * */

public class ArraryQueue implements Queue {
	
	private int front;		// 배열에 저장된 원소 중에서 첫 번째 원소의 인덱스를 저장할 변수
	private int rear;		// 저장된 마지막 원소의 인덱스를 저장할 rear 변수 사용.
	private int queueSize;
	private char itemArray[];
	
	public ArraryQueue(int queueSize){
		front = -1;	// 초기 공백 큐의 상태는 값을 -1 로 설정한다. 
		rear = -1;	// 초기 공백 큐의 상태는 값을 -1 로 설정한다.
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
		if(isFull())
			System.out.println("Inserting fail! Arary Queue is Full!!");
		else {
			// 마지막 원소의 인덱스를 저장한 rear값을 하나 증가시켜 삽입할 준비
			// 그 인덱스에 해당하는 배열원소 itemArray[rear]에 item을 저장
			itemArray[++rear] = item;
			System.out.println("Insert Item : " + item);
		}
		
	}

	@Override
	public char deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Arary Queue is Emtpy!!");
			return 0;
		} else {
			// 공백 상태가 아닌 큐에서 원소의 삭제는 언제나 큐에 저장된 원소 중에서 가장 앞에 있는 원소
			// 즉 가장 먼저 큐에 들어와 있는 원소를 가장 먼저 삭제해야 한다. 그러기 위해서는 
			// front의 위치를 한 자리 뒤로 조정하여 큐에 남아 있는 첫 번째 원소의 위치로 이동하여
			// 삭제할 준비를 하고 그자리의 원소를 삭제하여 반환한다.
			return itemArray[++front];
		}
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Arary Queue is Emtpy!!");			
		} else {
			++front;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("peeking fail! Arary Queue is Emtpy!!");
			return 0;
		} else {
			// 큐에서의 검색은 큐에 있는 원소중에서 가장먼저 들어와있는 원소
			// 즉 itemArray[front + 1]에 있는 원소를 검색하여 반환하는 연산이다.
			return itemArray[front + 1];
		}
	}
	
	public void printQueue(){
		if(isEmpty()) {
			System.out.println("Arary Queue is Emtpy!!");			
		} else {
			System.out.printf("Array Queue >> ");
			for(int i = front +1 ; i <= rear; i++){
				System.out.printf("%c", itemArray[i]);
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
