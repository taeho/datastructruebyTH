package ch08.queue;

public class ArraryCQueue implements Queue {
	
	private int front;	// ����� ���� �߿��� ù ��° ���������Ͽ� ���� ���길 ����
	private int rear;	// �ٸ��� ���� ���� ���길 �����ϵ��� ����
	private int queueSize;
	private char itemArray[];
	
	// �ʱ�ȭ 
	// �ʱ� ��������� ����ť �̹Ƿ� front/rear 0�� �ʱ�ȭ 
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
		if(isFull())	// ��ȭ���� üũ
			System.out.println("Inserting fail! Circular Queue is Full!!");
		else {
			rear = (rear+1) % this.queueSize;	
			// ������������ %, ���� ��� ũ�Ⱑ 4�� ���� ť���� ���� rear�� ��ġ�� 2�̸�, (2+1)mod4=3
			// �� �ǰ�, ������ ���� ��ġ�� cQ[3]�� �ǰ�, ���� rear�� ��ġ�� 3�̶�� (3+1)mode4=0
			// �� �Ǿ�, ������ ���� ��ġ�� cQ[0]�� �ȴ�.
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
