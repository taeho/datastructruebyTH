package ch08.queue.linked;

/*
 * Queue: ���� �ڷᱸ�� ����� �̿��Ͽ� ������ ť  
 * 
 * */

public interface Queue {

	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
}
