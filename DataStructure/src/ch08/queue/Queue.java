package ch08.queue;

/*
 * ���� �ڷᱸ�� ������� �����ϴ� ť...��.
 * �Ϲ�ť, ����ť
 * 
 * */

public interface Queue {
	boolean isEmpty();			// ����� üũ
	void enQueue(char item);	// ť ���� 
	char deQueue();				// ť ����
	void delete();				// ť ���� ����
	char peek();				// ť �˻�
}
