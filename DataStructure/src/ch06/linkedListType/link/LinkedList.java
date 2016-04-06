package ch06.linkedListType.link;
/*
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EB%A7%81%ED%81%AC%EB%93%9C%EB%A6%AC%EC%8A%A4%ED%8A%B8%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8-LinkedList
 * http://cky5122.blog.me/80146918953 
 * 자료구조] 링크드리스트(연결리스트) - LinkedList
 *  - 노드(Node)를 연결해서 만들어진 리스트
 *  - 기존의 배열은 개수가 정해져 있어야 하나(적을수도 있고 많아서 남을수도 있으므로 비효율적) 링크드리스트는
 *      프로그램 실행 중에도 메모리를 동적으로 할당받아 필요한만큼 데이터를 저장할 수 있다.
 *  - 노드는 데이터, 다음 노드에 대한 메모리 주소가 담겨져 있다.
 *   - 시간 복잡도 : O(n)
 *   
 *  장점
 *  - 새로운 노드의 추가/삽입/삭제가 쉽고 빠르다
 *  - 현재 노드의 다음 노드를 얻어오는 연산에 대해서는  비용이 발생하지 않는다.     
 *  단점
 *  - 다음 노드를 가리키려는 포인터 때문에 각 노드마다 4byte의  메모리가 추가로 필요하다.
 *  - 특정 위치에 있는 노드를 얻는데 드는 비용이 크며 속도도  느리다. 
 *  노드의 개수가 n 이라면 최악의 경우 
 *  n회의 노드  탐색 루프를 실행해야 특정 위치에 있는 노드를 찾을 수 있다. 
 * */

public class LinkedList {
	
	private Node head;
	
	// 노드 추가
	public void add(Node newNode){
		if(head == null){
			head = newNode;			
		} else {
			Node tail = head;
			while(tail.nextNode != null){
				tail = tail.nextNode;
			}
			tail.nextNode = newNode;
		}
	}
	
	// 노드 추가 함수 (지정된 위치)
	public void add(Node newNode, int location){
		// 헤더위치에 삽입 될 경우
		if(location == 0){
			newNode.nextNode = head;
			head = newNode;
		} else {
			Node before = head;
			// 이전 노드를 찾아 연결
			while((--location) > 0){
				before = before.nextNode;
			}
			newNode.nextNode = before.nextNode;
			before.nextNode = newNode;
		}
	}
	
	// 노드 탐색
	public Node get(int location){
		Node current = head;
		
		while((--location)>= 0 ){
			current = current.nextNode;
		}
		return current;
	}
	
	// 노드 삭제
	public void remove(int location){
		// 제거할 노드가 헤더이면
		if(location == 0){
			 head = head.nextNode;
		} else {
			Node before = head;
			while((--location ) >0){
				before = before.nextNode;
			}
			Node after = before.nextNode.nextNode;
			if(after != null){
				before.nextNode = after;
			} else {
				before.nextNode = null;
			}
		}
	}
	
	// 노드 정보 출력
	public void print(){
		StringBuffer sb = new StringBuffer();
		Node current = head;
		int size = 0;
		
		while(current != null) {
			sb.append(current.data);
			sb.append(", ");
			current = current.nextNode;
			size++;
		}
		
		int i = sb.lastIndexOf(", ");
		sb.delete(i, i+2);
		
		System.out.println("[" + sb + "]");
		System.out.println("size = "+ size);
	}

}
