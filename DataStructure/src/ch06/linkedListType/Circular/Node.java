package ch06.linkedListType.Circular;

/*
 * 환형 링크드리스트(환형 더블 링크드리스트)
 * http://cky5122.blog.me/80150434789
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%ED%99%98%ED%98%95-%EB%A7%81%ED%81%AC%EB%93%9C%EB%A6%AC%EC%8A%A4%ED%8A%B8%ED%99%98%ED%98%95-%EB%8D%94%EB%B8%94-%EB%A7%81%ED%81%AC%EB%93%9C%EB%A6%AC%EC%8A%A4%ED%8A%B8-Circular-Double-LinkedList
 * 환형 링크드리스트(환형 더블 링크드리스트) - Circular Double LinkedList
 * 더블 링크드리스트에서 헤드와 테일을 연결한 형태
 * - 환형 형태로 구현하게 되면 테일에 접근하는 비용이 거의 없는 것이나 다름 없을 정도로 작아지므로
 *    노드 추가 함수의 성능을 개선시킬 수 있다. 또 뒤에서부터 노드를 찾아나가는 노드 탐색 루틴을 구현할 수도 있다.
 *     - 시간복잡도 : O(n)
 * 
 * */

public class Node {
	int data;		// 데이터
	Node prevNode;	// 이전 노드의 주소를 저장
	Node nextNode;	// 다음 노드의 주소를 저장
	
	public Node(int data){
		this.data = data;
	}

}
