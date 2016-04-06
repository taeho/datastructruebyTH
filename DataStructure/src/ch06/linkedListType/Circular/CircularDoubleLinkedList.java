package ch06.linkedListType.Circular;

public class CircularDoubleLinkedList {
	
	private Node head;
	
	//노드 추가 함수
	public void add(Node newNode){
		if(head == null){
			head = newNode;
			head.prevNode = head;
			head.nextNode = head;
		} else {
			Node tail = head.prevNode;
			
			tail.nextNode = newNode;
			head.prevNode = newNode;
			
			newNode.prevNode = tail;
			newNode.nextNode = head;	
		}		
	}
	
	// 노드 추가 함수 ( 지정된 위치 )
	public void add(Node newNode, int location){
		// 헤더 위치에 삽입될 경우
		if(location == 0){
			newNode.nextNode = head;
			newNode.prevNode = head.prevNode; // 꼬리
			head.prevNode = newNode;
			newNode.prevNode.nextNode = newNode;
			head = newNode;			
		} else {
			Node before = head;
			// 이전 노드를 찾아 연결
			while((--location) > 0){
				before = before.nextNode;
			}
			
			newNode.prevNode = before;
			newNode.nextNode = before.nextNode;
			
			before.nextNode = newNode;
			newNode.nextNode.prevNode = newNode;
		}
	}
	
	// 노드 탐색
	public Node get(int location){
		Node current = head;
		while((--location) >= 0){
			current = current.nextNode;
		}
		return current;
	}
	
	// 노드 삭제
	public void remove(int location){
		// 제거할 노드가 헤더이면
		if(location == 0){
			head.prevNode.nextNode = head.nextNode;
			head.nextNode.prevNode = head.prevNode;
			head = head.nextNode;
		} else {
			Node before = head;
			while((--location)>0){
				before = before.nextNode;
			}
			before.nextNode = before.nextNode.nextNode;
			before.nextNode.prevNode = before;
		}
	}

	// 노드 사이즈
	public int size(){
		Node current = head;
		int size = 0;
		
		while(current != null){
			current = current.nextNode;
			size++;
			if(current == head)
				break;
		}
		return size;
	}
}
