package ch08.queue.deque;
/*
 * Deque, Double-endted Queue: 큐의 양쪽 끝에서 삽입과 삭제가 모두 발생할수 있는 큐.
 * 	- 스택의 성질과 큐의 성질을 모두 가지고 있는 자료구조
 *  - front : 저장된 원소중에서 가장 앞부분 원소
 *  - rear : 저장된 원소 중에서 가장 뒷부분 원소  
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
