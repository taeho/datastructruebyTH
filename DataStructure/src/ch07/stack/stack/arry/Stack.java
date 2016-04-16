package ch07.stack.stack.arry;

/*
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EC%8A%A4%ED%83%9DStack-%EB%B0%B0%EC%97%B4-%EA%B8%B0%EB%B0%98
 * 스택 배열기반
 * http://cky5122.blog.me/80149999833
 *  - 데이터를 건초나 짚더미와 같이 쌓아놓은 형태
 *  - 데이터를 삽입시 스택 아래부터 쌓이며 최신 데이터는 스택의 가장 윗 부분에 위치한다.
 *  - 데이터를 추출(제거)시 스택의 가장 윗 부분에서 꺼내므로 LIFO(Last-In, First-Out) 구조이다.
 *  - 스택을 구현시 배열 기반 또는 링크드리스트 기반으로 구현이 가능하다.
 *  - 배열 기반의 스택의 경우 스택의 크기가 정해져 있다.
 * */

public class Stack {
	
	private Node nodes[];
	private int capacity;
	private int top;
	
	// 생성자
	public Stack(int capacity){
		// 초기화
		nodes = new Node[capacity];
		for(int i=0; i<capacity; i++){
			nodes[i] = new Node();
		}
		this.capacity = capacity;
		top = 0;
	}
	
	// 삽입
	public void push(int data){
		nodes[top].data = data;
		top++;
	}
	
	// 제거
	public int pop(){
		//실제 top의 값은 index +1인 상태이므로
		return nodes[--top].data;
	}
	
	// 용량반환
	public int capacity(){
		return capacity;
	}
	
	// 최상위 노드 반환
	public int top(){
		return nodes[top-1].data;
	}
	
	// 사이즈
	public int size(){
		return top;
	}
	
	// 비어있는지 확인
	public boolean isEmpty(){
		return top == 0;
	}
	
	// 가득 찼는지 확인
	public boolean isFull(){
		return capacity == top;
	} 

}
