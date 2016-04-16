package ch07.stack.stack.link;
/*
 * http://warmz.tistory.com/entry/자료구조-스택Stack-링크드리스트-기반
 *  - 자세한 설명은 아래 링크에서...
 *   http://warmz.tistory.com/612
 *  - 링크드리스트 기반의 스택은 용량의 제한이 없으나 성능상 순차탐색을 감안해야 한다.
 *  - 링크드리스트 기반의 스택을 이용하여 사칙연산 계산기와 같은 프로그램을 만들 수 있다.
 * */

public class Stack {
	Node top;	// tail. 스택의 맨 위
	Node list;	// head. 스택의 맨 아래
	
	// 삽입
	public void push(Node newNode){
		if(list == null){
			list = newNode;
		} else {
			// 최상위 노드를 찾아 newNode를 연결
			Node currentTop = list;
			while(currentTop.nextNode != null){
				currentTop = currentTop.nextNode;
			}
			currentTop.nextNode =newNode;
		}
		top = newNode;
	}
	
	// 제거
	public Node pop(){
		//반환할 최상위 노드
		Node popped = top;
		
		// 만약 노드를 모두 반환했다면
		if(list == top){
			top = null;
			list = null;
		} else {
			// 새로운 최상위 노드를 스택의 top 필드에 등록
			Node currentTop = list;
			while(currentTop != null && currentTop.nextNode != popped ){
				currentTop = currentTop.nextNode;
			}
			// 현재 스택의 top 갱신
			top = currentTop;
			// 현재 스택의 top에 nextNode 정보 갱신
			currentTop.nextNode = null;
		}
		return popped;
	}
	
	// 최상위 노드 반환
	public Node top(){
		return top;
	}
	
	// 스택 사이즈 반환
	public int getSize(){
		int count = 0;
		
		Node current = list;
		while(current != null){
			current = current.nextNode;
			count++;
		}		
		return count;
	}
	
	// 스택이 비어 있는지
	public boolean isEmpty(){
		return (list ==null);
	}
}
