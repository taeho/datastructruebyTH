package ch06.linkedListType.Double;

/*
 * [�ڷᱸ��] ����ũ�帮��Ʈ(���߿��Ḯ��Ʈ) - DoubleLinkedList
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EB%8D%94%EB%B8%94%EB%A7%81%ED%81%AC%EB%93%9C%EB%A6%AC%EC%8A%A4%ED%8A%B8%EC%9D%B4%EC%A4%91%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8-DoubleLinkedList
 *  - ��ũ�帮��Ʈ ��������
 *  - ������ ��ũ�帮��Ʈ�� �ܹ������θ� Ž���� �� ������ 
 *     ����ũ�帮��Ʈ�� ���� ����� �ּҵ� ������ �����Ƿ� ����� Ž���� �����ϴ�
 *  - �ð� ���⵵ : O(n)
 *  http://cky5122.blog.me/80149935892
 * */

public class Node {
	int data;			// ������ 
	Node prevNode;		// ���� ����� �ּҸ� ����
	Node nextNode;		// ���� ����� �ּҸ� ����
	
	public Node(int data){
		this.data = data;
	}

}
