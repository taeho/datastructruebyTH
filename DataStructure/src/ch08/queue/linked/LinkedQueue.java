package ch08.queue.linked;

/*
 * Queue: 연결 자료구조 방식을 이용하여 구현한 큐  
 *  내용: 순차 자료구조 방식을 이용하여 구현한 큐에는 문제가 있음.
 *       사용 크기가 제한되어 있어서 길이를 마음대로 변경할 수 없고, 원소가 없을 때에도
 *       항상 처음 크기로 유지하고 있어야 하므로 메모리도 낭비된다.
 *       이와 같은 문제를 극복하기위해 연결자료구조 방식을 이용하여 크기에 제한이 없는 연결 큐
 *       (Linked Queue)를 구현.
 *       
 *       연결 큐에서 원소는 데이터 필드와 링크 필드를 가진 노드로 구성하며, 첫번째 노드를 가리키 키는
 *       참조변수 front와 마지막 노드를 가리키는 참조변수 rear를 사용한다.
 *       연결 큐의 초기 상태(공백큐)는 front와 rear를 널(NULL)로 설정하여 표현하다.
 * */


public class LinkedQueue implements Queue {
	
	QNode front;
	QNode rear;
	
	public LinkedQueue(){
		front = null;	// 초기화 NULL로 
		rear = null;	// 초기화 NULL로
	}
	
	@Override
	public boolean isEmpty() {
		return (front == null);
	}

	@Override
	public void enQueue(char item) {
		QNode newNode = new QNode();
		newNode.data = item;	// 삽입할 새노드
		newNode.link = null;	// 삽입할 새노드의 뒤는 NULL
		
		if(isEmpty()){	// 연결 큐가 공백인 경우
			front = newNode;
			rear = newNode;
		} else {		// 연결 큐에 노드가 있는 경우 
			rear.link = newNode;	// 현재 큐의 마지막 노드의 뒤에 새노드를 삽입한다.
			rear = newNode;			// 그리고 마지막노드를 가리키는 rear가 사입한 새노드를 가리키도록
		}
		
		System.out.println("Inserted item : " + item);
	}

	@Override
	public char deQueue() {
		if(isEmpty()) {
			System.out.println("Deleting fail!! Linked Queue is Empty!!");
			return 0;
		} else {
			char item = front.data;	// front가 가리키는 노드를 참조변수 old가 가리키게 하여 삭제할 노드를 지정
			front = front.link;		// 삭제연산 후에는 현재 front노드의 다음 노드가 front 노드가 되어야 하므로 front.link로 설정
			
			if(front == null) {		// 현재 큐에 노드는 하나, 재설정한front가 null 이면 삭제연산후 공백큐 됨.
				rear = null;		// 그래서 rear를 null 로 설정
			}
			return item;			// old 가 가리키고 잇는 노드를 삭제하여 메모리 공간을 시스템에 반환 return
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
