package ch08.queue.deque;

/*
 * Deque, Double-endted Queue: 큐의 양쪽 끝에서 삽입과 삭제가 모두 발생할수 있는 큐.
 * 	- 스택의 성질과 큐의 성질을 모두 가지고 있는 자료구조
 *  - front : 저장된 원소중에서 가장 앞부분 원소
 *  - rear : 저장된 원소 중에서 가장 뒷부분 원소  
 * 
 * */
public class DQNode {
	char data;
	DQNode rlink;
	DQNode llink;
}
