package ch06.linkedListType.Circular;

/*
 * ȯ�� ��ũ�帮��Ʈ(ȯ�� ���� ��ũ�帮��Ʈ)
 * http://cky5122.blog.me/80150434789
 * http://warmz.tistory.com/entry/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%ED%99%98%ED%98%95-%EB%A7%81%ED%81%AC%EB%93%9C%EB%A6%AC%EC%8A%A4%ED%8A%B8%ED%99%98%ED%98%95-%EB%8D%94%EB%B8%94-%EB%A7%81%ED%81%AC%EB%93%9C%EB%A6%AC%EC%8A%A4%ED%8A%B8-Circular-Double-LinkedList
 * ȯ�� ��ũ�帮��Ʈ(ȯ�� ���� ��ũ�帮��Ʈ) - Circular Double LinkedList
 * ���� ��ũ�帮��Ʈ���� ���� ������ ������ ����
 * - ȯ�� ���·� �����ϰ� �Ǹ� ���Ͽ� �����ϴ� ����� ���� ���� ���̳� �ٸ� ���� ������ �۾����Ƿ�
 *    ��� �߰� �Լ��� ������ ������ų �� �ִ�. �� �ڿ������� ��带 ã�Ƴ����� ��� Ž�� ��ƾ�� ������ ���� �ִ�.
 *     - �ð����⵵ : O(n)
 * 
 * */

public class Node {
	int data;		// ������
	Node prevNode;	// ���� ����� �ּҸ� ����
	Node nextNode;	// ���� ����� �ּҸ� ����
	
	public Node(int data){
		this.data = data;
	}

}
