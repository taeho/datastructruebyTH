package ch08.queue;

/*
 * ���� �ڷᱸ���� ����� ť 
 * 
 * */

public class ArraryQueue implements Queue {
	
	private int front;		// �迭�� ����� ���� �߿��� ù ��° ������ �ε����� ������ ����
	private int rear;		// ����� ������ ������ �ε����� ������ rear ���� ���.
	private int queueSize;
	private char itemArray[];
	
	public ArraryQueue(int queueSize){
		front = -1;	// �ʱ� ���� ť�� ���´� ���� -1 �� �����Ѵ�. 
		rear = -1;	// �ʱ� ���� ť�� ���´� ���� -1 �� �����Ѵ�.
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
			// ������ ������ �ε����� ������ rear���� �ϳ� �������� ������ �غ�
			// �� �ε����� �ش��ϴ� �迭���� itemArray[rear]�� item�� ����
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
			// ���� ���°� �ƴ� ť���� ������ ������ ������ ť�� ����� ���� �߿��� ���� �տ� �ִ� ����
			// �� ���� ���� ť�� ���� �ִ� ���Ҹ� ���� ���� �����ؾ� �Ѵ�. �׷��� ���ؼ��� 
			// front�� ��ġ�� �� �ڸ� �ڷ� �����Ͽ� ť�� ���� �ִ� ù ��° ������ ��ġ�� �̵��Ͽ�
			// ������ �غ� �ϰ� ���ڸ��� ���Ҹ� �����Ͽ� ��ȯ�Ѵ�.
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
			// ť������ �˻��� ť�� �ִ� �����߿��� ������� �����ִ� ����
			// �� itemArray[front + 1]�� �ִ� ���Ҹ� �˻��Ͽ� ��ȯ�ϴ� �����̴�.
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
