package ch08.queue.linked;

/*
 * Queue: ���� �ڷᱸ�� ����� �̿��Ͽ� ������ ť  
 *  ����: ���� �ڷᱸ�� ����� �̿��Ͽ� ������ ť���� ������ ����.
 *       ��� ũ�Ⱑ ���ѵǾ� �־ ���̸� ������� ������ �� ����, ���Ұ� ���� ������
 *       �׻� ó�� ũ��� �����ϰ� �־�� �ϹǷ� �޸𸮵� ����ȴ�.
 *       �̿� ���� ������ �غ��ϱ����� �����ڷᱸ�� ����� �̿��Ͽ� ũ�⿡ ������ ���� ���� ť
 *       (Linked Queue)�� ����.
 *       
 *       ���� ť���� ���Ҵ� ������ �ʵ�� ��ũ �ʵ带 ���� ���� �����ϸ�, ù��° ��带 ����Ű Ű��
 *       �������� front�� ������ ��带 ����Ű�� �������� rear�� ����Ѵ�.
 *       ���� ť�� �ʱ� ����(����ť)�� front�� rear�� ��(NULL)�� �����Ͽ� ǥ���ϴ�.
 * */


public class LinkedQueue implements Queue {
	
	QNode front;
	QNode rear;
	
	public LinkedQueue(){
		front = null;	// �ʱ�ȭ NULL�� 
		rear = null;	// �ʱ�ȭ NULL��
	}
	
	@Override
	public boolean isEmpty() {
		return (front == null);
	}

	@Override
	public void enQueue(char item) {
		QNode newNode = new QNode();
		newNode.data = item;	// ������ �����
		newNode.link = null;	// ������ ������� �ڴ� NULL
		
		if(isEmpty()){	// ���� ť�� ������ ���
			front = newNode;
			rear = newNode;
		} else {		// ���� ť�� ��尡 �ִ� ��� 
			rear.link = newNode;	// ���� ť�� ������ ����� �ڿ� ����带 �����Ѵ�.
			rear = newNode;			// �׸��� ��������带 ����Ű�� rear�� ������ ����带 ����Ű����
		}
		
		System.out.println("Inserted item : " + item);
	}

	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("Deleting fail!! Linked Queue is Empty!!");
			return 0;
		} else {
			char item = front.data;	// front�� ����Ű�� ��带 �������� old�� ����Ű�� �Ͽ� ������ ��带 ����
			front = front.link;		// �������� �Ŀ��� ���� front����� ���� ��尡 front ��尡 �Ǿ�� �ϹǷ� front.link�� ����
			
			if(front == null) {		// ���� ť�� ���� �ϳ�, �缳����front�� null �̸� ���������� ����ť ��.
				rear = null;		// �׷��� rear�� null �� ����
			}
			return item;			// old �� ����Ű�� �մ� ��带 �����Ͽ� �޸� ������ �ý��ۿ� ��ȯ return
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
