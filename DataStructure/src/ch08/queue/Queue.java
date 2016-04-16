package ch08.queue;

/*
 * 순차 자료구조 방식으로 구현하는 큐...등.
 * 일반큐, 원형큐
 * 
 * */

public interface Queue {
	boolean isEmpty();			// 비엇나 체크
	void enQueue(char item);	// 큐 삽입 
	char deQueue();				// 큐 삭제
	void delete();				// 큐 삭제 내부
	char peek();				// 큐 검색
}
