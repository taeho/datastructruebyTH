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

public class Node {
	int data;			// 데이터 
	Node prevNode;		// 이전 노드의 주소를 저장
	Node nextNode;		// 다음 노드의 주소를 저장
	
	public Node(int data){
		this.data = data;
	}

}
