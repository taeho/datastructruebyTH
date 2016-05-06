package ch08.queue.deque;
/*
 * Deque, Double-endted Queue: ť�� ���� ������ ���԰� ������ ��� �߻��Ҽ� �ִ� ť.
 * 	- ������ ������ ť�� ������ ��� ������ �ִ� �ڷᱸ��
 *  - front : ����� �����߿��� ���� �պκ� ����
 *  - rear : ����� ���� �߿��� ���� �޺κ� ����  
 * 
 * */
public class Main {
	public static void main(String[] args) {
		char deleteItem;
		DQueue DQ = new DQueue();
		
		DQ.insertFront('A');
		DQ.printDQueue();
		
		DQ.insertFront('B');
		DQ.printDQueue();
		
		DQ.insertRear('C');
		DQ.printDQueue();
		
		deleteItem = DQ.deleteFront();
		if(deleteItem != 0) {
			System.out.println("Front deleted Item : " + deleteItem);
		}
		DQ.printDQueue();
		
		deleteItem = DQ.deleteRear();
		if(deleteItem != 0) {
			System.out.println("Rear deleted Item : " + deleteItem);
		}
		DQ.printDQueue();
		
		DQ.insertRear('D');
		DQ.printDQueue();
		
		DQ.insertFront('E');
		DQ.printDQueue();
		
		DQ.insertFront('F');
		DQ.printDQueue();
	}
}
