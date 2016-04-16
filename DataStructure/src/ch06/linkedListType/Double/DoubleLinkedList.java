package ch06.linkedListType.Double;

/*
 * [자료구조] 더블링크드리스트(이중연결리스트) - DoubleLinkedList
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EB%8D%94%EB%B8%94%EB%A7%81%ED%81%AC%EB%93%9C%EB%A6%AC%EC%8A%A4%ED%8A%B8%EC%9D%B4%EC%A4%91%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8-DoubleLinkedList
 *  - 링크드리스트 개선버전
 *  - 기존의 링크드리스트는 단방향으로만 탐색할 수 있으나 
 *     더블링크드리스트는 앞의 노드의 주소도 가지고 있으므로 양방향 탐색이 가능하다
 *  - 시간 복잡도 : O(n)
 *  http://cky5122.blog.me/80149935892
 * */

public class DoubleLinkedList {
	private Node head;
	
	// 노드 추가 함수
	public void add(Node newNode){
		if(head == null){
			head = newNode;
		} else {
			Node tail = head;
			while(tail.nextNode != null){
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;
			newNode.prevNode = tail;
		}
	}
	
	// 노드 추가 함수 ( 저장된 위치 )
	public void add(Node newNode, int location){
		// 헤더 위치에 삽입 된 경우
		if(location == 0){
			newNode.nextNode = head;
			head.prevNode = newNode;
			head = newNode;
		} else {
			Node before = head;
			// 이전 노드를 찾아 연결
			while((--location) >0 ){
				before = before.nextNode;
			}
			// before 노드가 tail 일수도 있으므로
			if(before.nextNode != null){
				before.nextNode.prevNode = newNode;
			}
			
			newNode.prevNode = before;
			newNode.nextNode = before.nextNode;
			before.nextNode = newNode;
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
		// 제거할 노드가 헤드이면
		if(location ==0){
			head = head.nextNode;
			if(head != null){
				head.prevNode = null;
			}
		} else {
			Node before = head;
			while((--location) > 0){
				before = before.nextNode;
			}
			
			Node after = before.nextNode.nextNode;
			if(after != null) {
				before.nextNode = after;
				after.prevNode = before;
			} else {
				before.nextNode = null;
			}
		}
	}
	
	// 노드 정보 출력
	public void print(){
		StringBuffer sb = new StringBuffer();
		Node current  = head;
		int size = 0;
		
		while(current != null){
			sb.append(current.data);
			sb.append(", ");
			current = current.nextNode;
			size++;			
		}
		
		int i = sb.lastIndexOf(", ");
		sb.delete(i, i+2);
		
		System.out.println("[ "+ sb +" ]");
		System.out.println("size : " + size);
	}

}
