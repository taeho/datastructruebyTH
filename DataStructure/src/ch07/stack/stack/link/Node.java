package ch07.stack.stack.link;

/*
 * http://warmz.tistory.com/entry/자료구조-스택Stack-링크드리스트-기반
 *  - 자세한 설명은 아래 링크에서...
 *   http://warmz.tistory.com/612
 *  - 링크드리스트 기반의 스택은 용량의 제한이 없으나 성능상 순차탐색을 감안해야 한다.
 *  - 링크드리스트 기반의 스택을 이용하여 사칙연산 계산기와 같은 프로그램을 만들 수 있다.
 * */

public class Node {
	String data;
	Node nextNode;
	
	public Node(String data){
		this.data = data;
		
	}

}
